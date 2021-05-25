package com.roocon.thread.t2;

import java.util.Arrays;
import java.util.List;

public class Demo7Lambda {
	
	public static void main(String[] args) {

		List<Integer> values = Arrays.asList(10,20,30,40);
		int res = new Demo7Lambda().add(values);
		System.out.println("计算的结果为：" + res);


	}



	public int add (List<Integer> values) {
//		values.parallelStream().forEach(System.out :: println);
		return values.parallelStream().mapToInt( i -> i * 2).sum();
	}

}
