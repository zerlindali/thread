package com.roocon.thread.t4;

public class DemoPriority {
	
	public static void main(String[] args) {
		
		
		Thread t1 =  new Thread(new Target());
		Thread t2 =  new Thread(new Target());
		
		
		t1.setPriority(Thread.MIN_PRIORITY);
		// �����ȼ��������е����ȼ���CPUʱ��Ƭ
		t2.setPriority(Thread.MAX_PRIORITY);

		t1.start();
		t2.start();
		
	}

}
