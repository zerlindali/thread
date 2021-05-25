package com.roocon.thread.t2;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Demo4Callable implements Callable<Integer> {
	
	
	public static void main(String[] args) throws Exception {
		Demo4Callable d = new Demo4Callable();
		
		FutureTask<Integer> task = new FutureTask<>(d);
		
		Thread t = new Thread(task);
		
		t.start();
		
		System.out.println("我先干点别的。。。");
		
		Integer result = task.get();
		System.out.println("线程执行的结果为：" + result);
	}

	@Override
	public Integer call() throws Exception {
		System.out.println("正在进行紧张的计算....");
		Thread.sleep(3000);
		return 1;
	}

}
