package com.roocon.thread.t2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author ZerlindaLi create at 2019/12/5 17:45
 * @version 1.0.0
 * @description newFixedThreadPool线程池中的线程数是固定的
 */
public class Demo6FixedThreadPool {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(4);

        for(int i =0; i<100; i++) {
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
