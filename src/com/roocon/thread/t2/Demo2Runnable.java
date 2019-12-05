package com.roocon.thread.t2;

/**
 * 作为线程任务存在
 * 
 * @author worker
 *
 */
public class Demo2Runnable implements Runnable {

	@Override
	public void run() {
		while(true) {
		try {
			Thread.sleep(10000);

				System.out.println("thread running ...");

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}

	public static void main(String[] args) {
		Thread thread = new Thread(new Demo2Runnable());
		thread.setDaemon(true);
		thread.start();
		System.out.println(thread.getName());
		System.out.println(thread.getThreadGroup());

		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getThreadGroup());

		System.out.println(Thread.currentThread().getName());
		System.out.println(System.getSecurityManager());

	}
	
}
