package com.roocon.thread.t7;

public class Demo2 {
	
	public volatile boolean run = false;
	
	public static void main(String[] args) {
		
		Demo2 d = new Demo2();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 1;i<=10;i++) {
					System.err.println("执行了第 " + i + " 次");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				d.run = true;
			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(!d.run) {
					// 不执行
				}
				System.err.println("线程2执行了...");
			}
		}).start();
		
		
	}

}
