package com.roocon.thread.t2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author ZerlindaLi create at 2019/12/5 17:55
 * @version 1.0.0
 * @description ��JVM��Ϊ�̳߳����̲߳�����ʱ���ͻᴴ���߳�
 */
public class Demo6CachedThreadPool {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newCachedThreadPool();

        for(int i = 0; i < 100; i++) {
            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                }
            });
        }

        threadPool.shutdown();
    }
}
