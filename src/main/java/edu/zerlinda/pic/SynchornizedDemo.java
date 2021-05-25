package edu.zerlinda.pic;

/**
 * @author ZerlindaLi create at 2021/5/20 14:42
 * @version 1.0.0
 * @description SynchornizedDemo
 */
public class SynchornizedDemo {
    /**
     * 作用范围
     * 1. 静态方法
     * 2. 实例方法
     * 3. 静态代码块
     */


    synchronized void m1(String str) {
        while(true) {
            System.out.println(str);
        }
    }

    Object lock = new Object();
    void m2() {
        synchronized (lock) { // 当前对象存储锁的标记

        }
    }

    void m22() {
        synchronized (this) {

        }
    }


    synchronized static void m3() {

    }

    // 需要考虑加锁的范围，任何锁都会带来性能问题
    // 数据安全和性能权衡
    public static void main(String[] args) {
        SynchornizedDemo sd = new SynchornizedDemo();
        SynchornizedDemo sd2 = new SynchornizedDemo();

        new Thread(()->{
            sd.m1("first thread");
        }).start();

        new Thread(()->{
            sd.m1("second thread");
        }).start();

    }
}
