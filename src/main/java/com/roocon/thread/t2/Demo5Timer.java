package com.roocon.thread.t2;

import java.util.Timer;
import java.util.TimerTask;

/**
 * 定时器
 * 定时器框架 quartz
 */
public class Demo5Timer {

	public static void main(String[] args) {

		Timer timer = new Timer();

		timer.schedule(new TimerTask() {

			@Override
			public void run() {
				// 实现定时任务
				System.out.println("timertask is run");
			}
		}, 0, 1000);

	}

}
