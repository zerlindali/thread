package com.roocon.thread.t2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ZerlindaLi create at 2019/12/6 11:20
 * @version 1.0.0
 * @description Demo7Stream
 */
public class Demo7Stream {

    public void stream1(){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);
        /**
         * parallelStream 并行流
         */
        numbers.parallelStream().forEach(num -> {
            System.out.println("第一次请求并行："+Thread.currentThread().getName() + ">>"+num);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }

    public void stream2(){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);
        numbers.parallelStream().forEach(num -> {
            System.out.println("第二次请求并行："+Thread.currentThread().getName() + ">>"+num);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }

    public static void main(String[] args) {
        Demo7Stream ds = new Demo7Stream();
        Thread t1 = new Thread(()->{
            ds.stream1();
        });

        Thread t2 = new Thread(()->{
            ds.stream2();
        });

        t1.start();
        t2.start();

        try {
            /**
             *  thread.join的含义是当前线程需要等待previousThread线程终止之后才从thread.join返回。
             *  简单来说，就是线程没有执行完之前，会一直阻塞在join方法处。
             */
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
