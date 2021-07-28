package com.imooc.product.testdemo;

import java.util.concurrent.TimeUnit;

/**
 * @author zxW
 * @ClassName: T01_HelloVolatile
 * @Description:
 * @date 2021-05-21 ,11:52
 * @packageName com.imooc.product.testdemo
 */
public class T01_HelloVolatile {
    volatile boolean running = true;

    void m() {
        System.out.println("m ,start ");
        while (running) {

        }
        System.out.println("m,end");

    }

    public static void main(String[] args) {

        T01_HelloVolatile t = new T01_HelloVolatile();
        new Thread(t::m, "t1").start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.running = false;
    }

}
