package com.roocon.thread.ta1;

public class Sequence {

	private MyLock lock = new MyLock();

	private int value;

	public int getNext() {
		lock.lock();
		value++;
		lock.unlock();
		return value;

	}
	
	public static void main(String[] args) {
		
		Sequence s = new Sequence();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true)
				System.out.println(s.getNext());
			}
		}).start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true)
				System.out.println(s.getNext());
			}
		}).start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true)
				System.out.println(s.getNext());
			}
		}).start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true)
				System.out.println(s.getNext());
			}
		}).start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true)
				System.out.println(s.getNext());
			}
		}).start();
	}

}
