package edu.zerlinda.pic;

/**
 * @author ZerlindaLi create at 2021/5/20 14:42
 * @version 1.0.0
 * @description SynchornizedDemo
 */
public class SynchornizedDemo {
    /**
     * ���÷�Χ
     * 1. ��̬����
     * 2. ʵ������
     * 3. ��̬�����
     */


    synchronized void m1(String str) {
        while(true) {
            System.out.println(str);
        }
    }

    Object lock = new Object();
    void m2() {
        synchronized (lock) { // ��ǰ����洢���ı��

        }
    }

    void m22() {
        synchronized (this) {

        }
    }


    synchronized static void m3() {

    }

    // ��Ҫ���Ǽ����ķ�Χ���κ������������������
    // ���ݰ�ȫ������Ȩ��
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
