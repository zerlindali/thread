package com.roocon.thread.t2;

import java.util.Timer;
import java.util.TimerTask;

/**
 * ��ʱ��
 * ��ʱ����� quartz
 */
public class Demo5Timer {

	public static void main(String[] args) {

		Timer timer = new Timer();

		timer.schedule(new TimerTask() {

			@Override
			public void run() {
				// ʵ�ֶ�ʱ����
				System.out.println("timertask is run");
			}
		}, 0, 1000);

	}

}
