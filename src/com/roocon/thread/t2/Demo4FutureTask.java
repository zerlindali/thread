package com.roocon.thread.t2;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @author ZerlindaLi create at 2019/12/5 16:47
 * @version 1.0.0
 * @description 将线程放到FutureTask里面，可以得到线程的返回结果
 */
public class Demo4FutureTask implements Callable<Integer>{


    public static void main(String[] args)  throws Exception{
        Demo4FutureTask d = new Demo4FutureTask();
        FutureTask<Integer> f = new FutureTask(d);
        Thread t = new Thread(f);
        t.start();
        System.out.println("我先干点别的");
        System.out.println("最终线程执行的结果为："+f.get());
    }

    @Override
    public Integer call() throws Exception {
        System.out.println("我正在进行紧张的计算");
        Thread.sleep(3000);
        return 1;
    }
}
