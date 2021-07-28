package com.imooc.product.testdemo;

/**
 * @author zxW
 * @ClassName: T
 * @Description:JIT (just in time)及时编译器
 * @date 2021-05-21 ,10:40
 * @packageName com.imooc.product.testdemo
 */
public class T {

    public static volatile int i = 0;

    public static void main(String[] args) {

        for (int i = 0; i < 100000; i++) {
            m();
            n();
        }
    }

    public static synchronized void m() {

    }

    public static void n() {
        i = 1;

    }

}
