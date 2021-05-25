package edu.zerlinda.pic;


/**
 * @author ZerlindaLi create at 2021/5/24 17:15
 * @version 1.0.0
 * @description ClassLayoutDemo
 */
public class ClassLayoutDemo {
/*
    // 占一个字节的boolean类型
    private boolean flag;
    // int可惜占4个字节
    private int i;
    public static void main(String[] args) {
        // 构建一个对象实例
        ClassLayoutDemo classLayoutDemo = new ClassLayoutDemo();
        // 对象实例在内存中的布局
        System.out.println(ClassLayout.parseInstance(classLayoutDemo).toPrintable());

        *//**
         * edu.zerlinda.pic.ClassLayoutDemo object internals:
         *  OFFSET  SIZE   TYPE DESCRIPTION                               VALUE
         *       // 存储对象头
         *       0     4        (object header)                           01 00 00 00 (00000001 00000000 00000000 00000000) (1)
         *       4     4        (object header)                           00 00 00 00 (00000000 00000000 00000000 00000000) (0)
         *       // Klass Pointer
         *       8     4        (object header)                           05 c1 00 f8 (00000101 11000001 00000000 11111000) (-134168315)
         *      12     4        (loss due to the next object alignment)
         * Instance size: 16 bytes
         * Space losses: 0 bytes internal + 4 bytes external = 4 bytes total
         *//*
    }*/
}
