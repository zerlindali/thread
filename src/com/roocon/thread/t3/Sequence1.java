package com.roocon.thread.t3;

/**
 * @author ZerlindaLi create at 2019/12/6 15:33
 * @version 1.0.0
 * @description Sequence1
 */
public class Sequence1 {

    private int value;

    /**
     * 返回当前 value 并将value的值+1
     * @return
     */
    public int getNext(){
        return value++;
    }

    public static void main(String[] args) {

        Sequence1 s1 = new Sequence1();
        while(true){
            System.out.println(s1.getNext());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
