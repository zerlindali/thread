package com.roocon.thread.t3;

/**
 * @author ZerlindaLi create at 2019/12/6 17:05
 * @version 1.0.0
 * @description 使用synchronized解决线程安全性问题
 */
public class Sequence3 {
    private int value;

    public synchronized int getNext(){
        return value++;
    }

    public static void main(String[] args) {
        Sequence3 s3 = new Sequence3();
        Thread t1 = new Thread(()->{
            while(true){
                System.out.println(Thread.currentThread().getName()+"---------"+s3.getNext());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(()->{
            while(true){
                System.out.println(Thread.currentThread().getName()+"---------"+s3.getNext());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t3 = new Thread(()->{
            while(true){
                System.out.println(Thread.currentThread().getName()+"---------"+s3.getNext());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();
        t3.start();

    }
}
