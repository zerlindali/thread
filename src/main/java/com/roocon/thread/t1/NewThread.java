package com.roocon.thread.t1;

public class NewThread implements Runnable {

	@Override
	public synchronized void run() {
		while(true) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("The defined Thread is Running....");
		}
	}
	
	public static void main(String[] args) {
		
		NewThread n = new NewThread(); // 创建线程任务

        // 初始化状态
		Thread thread = new Thread(n); // 创建线程，并指定线程任务
		
		thread.start(); // 启动
		
		while(true) {
			synchronized (n) {
				System.out.println("The main thread is Running ...");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				n.notifyAll();
			}
			
		}
		
	}

}
