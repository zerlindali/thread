package edu.zerlinda.pic;

/**
 * @author ZerlindaLi create at 2021/5/20 14:42
 * @version 1.0.0
 * @description AtomicDemo
 */
public class AtomicDemo {
//    volatile int i = 0;
    int i = 0;

    // 同步锁synchronized，排他锁，互斥锁。
    public synchronized void  incr(){
        /**
         *   0: aload_0
         *          1: dup
         *          2: getfield      #2                  // Field i:I
         *          5: iconst_1
         *          6: iadd
         *          7: putfield      #2                  // Field i:I
         *         10: return
         */
        i++;
    }

    public static void main(String[] args) {
        AtomicDemo demo = new AtomicDemo();
        Thread[] threads = new Thread[2];
        for(int j=0; j < 2; j++) {
            threads[j] = new Thread(()->{ // 创建2个线程
                for(int i = 0; i < 1000 ; i++) // 每个线程跑100次
                    demo.incr();
            });
            threads[j].start();
        }
        try {
            // join方法，等待子线程结束之后，主线程才执行
            threads[0].join();
            threads[1].join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(demo.i);
    }
}
