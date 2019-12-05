package com.roocon.thread.t2;

import java.security.AccessController;

public class Demo1DaemonThread extends Thread {

	public Demo1DaemonThread(){
		super();
	}
	public Demo1DaemonThread(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		while(!Thread.interrupted()) {
			try {
				Thread.sleep(1000);
				// Checking whether the thread is Daemon or not
				if(Thread.currentThread().isDaemon())
				{
					System.out.println(getName() + " is Daemon thread");
				}

				else
				{
					System.out.println(getName() + " is User thread");
				}
				System.out.println(getName() + "线程运行了 .. ");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {

		System.out.println(AccessController.getContext().toString());

		Demo1DaemonThread d1 = new Demo1DaemonThread("first-thread");
		Demo1DaemonThread d2 = new Demo1DaemonThread("second-thread");
		// 当程序中只剩下守护线程时，jvm会 退出。
		d1.setDaemon(true);
//		d2.setDaemon(true);
		d1.start();
		d2.start();

		if(Thread.currentThread().isDaemon())
		{
			System.out.println(Thread.currentThread().getName() + " is Daemon thread");
		}

		else
		{
			System.out.println(Thread.currentThread().getName() + " is User thread");
		}
		d1.interrupt();
	}

	/*public static void main(String[] args)
	{
		try
		{

			System.out.println("Entering into Deadlock");

			Thread.currentThread().join();

			// the following statement will never execute
			System.out.println("This statement will never execute");
			Thread.currentThread().interrupt();

		}

		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}*/
}
