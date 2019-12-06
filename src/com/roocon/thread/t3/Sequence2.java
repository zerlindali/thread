package com.roocon.thread.t3;

/**
 * @author ZerlindaLi create at 2019/12/6 15:43
 * @version 1.0.0
 * @description 多线程调用,出现了线程安全性问题
 * java提供的一个查看class二进制文件的工具
 * javap -verbose Sequence2.class
 */
public class Sequence2 {
    private int value;

    /**
     * 该方法在jvm中的执行过程
     *   public int getNext();
     *     descriptor: ()I
     *     flags: ACC_PUBLIC
     *     Code:
     *       stack=4, locals=1, args_size=1
     *          0: aload_0
     *          1: dup
     *          2: getfield      #2                  // Field value:I
     *          5: dup_x1
     *          6: iconst_1
     *          7: iadd
     *          8: putfield      #2                  // Field value:I
     *         11: ireturn
     *       LineNumberTable:
     *         line 11: 0
     *       LocalVariableTable:
     *         Start  Length  Slot  Name   Signature
     *             0      12     0  this   Lcom/roocon/thread/t3/Sequence2;
     * @return
     */
    public int getNext(){
        return value++;
    }

    public static void main(String[] args) {
        Sequence2 s2 = new Sequence2();
        Thread t1 = new Thread(()->{
            while (true) {
                System.out.println(Thread.currentThread().getName() +"-----"+s2.getNext());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        });

        Thread t2 = new Thread(()->{
            while (true) {
                System.out.println(Thread.currentThread().getName() +"-----"+s2.getNext());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t3 = new Thread(()->{
            while (true) {
                System.out.println(Thread.currentThread().getName() +"-----"+s2.getNext());
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
