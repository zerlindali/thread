package com.roocon.thread.t2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author ZerlindaLi create at 2019/12/5 17:55
 * @version 1.0.0
 * @description 当JVM认为线程池中线程不够用时，就会创建线程
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
