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
		 * 这里会执行Thread重写的run方法
		 * Thread原本的run方法是调用传入的target的run方法，及传入的Runnable的run方法
		 *     @Override
		 *     public void run() {
		 *         if (target != null) {
		 *             target.run();
		 *         }
		 *     }
		 * 所以使用Runnable这种方式并没有改变原本的Thread的run方法。
		 * 而重写Thread的run方法后，run执行代码变成重写后的代码了，并不会去执行Runnable的run方法
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
