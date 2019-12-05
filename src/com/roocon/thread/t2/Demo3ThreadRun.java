package com.roocon.thread.t2;

public class Demo3ThreadRun {
	
	public static void main(String[] args) {
		
		/*new Thread() {
			public void run() {
				System.out.println("thread start ..");
			};
		}.start();*/
		
		
		/*new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("thread start ..");
			}
		}).start();*/


		/**
		 * �����ִ��Thread��д��run����
		 * Threadԭ����run�����ǵ��ô����target��run�������������Runnable��run����
		 *     @Override
		 *     public void run() {
		 *         if (target != null) {
		 *             target.run();
		 *         }
		 *     }
		 * ����ʹ��Runnable���ַ�ʽ��û�иı�ԭ����Thread��run������
		 * ����дThread��run������runִ�д�������д��Ĵ����ˣ�������ȥִ��Runnable��run����
		 */
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("runnable");
			}
		}) {
			public void run() {
				System.out.println("sub");
			};
		}.start();
		
		
	}

}
