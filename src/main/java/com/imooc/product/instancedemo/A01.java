package com.imooc.product.instancedemo;

/**
 * @author zxW
 * @ClassName: A
 * @Description:
 * @date 2021-07-30 ,14:27
 * @packageName com.imooc.product.instancedemo
 */
public class A01 {

    private static volatile A01 instance;

    private A01() {
    }

    public static A01 getInstance() {

        if (instance == null) {
            synchronized (A01.class) {

                if (instance == null) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    instance = new A01();
                }


            }
        }


        return instance;
    }


    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(A01.getInstance().hashCode());
            }).start();
        }
    }
}
