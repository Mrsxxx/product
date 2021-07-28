package com.imooc.product.testdemo;

/**
 * @author zxW
 * @ClassName: T01_CacheLinePadding
 * @Description:缓存行对齐小实验
 * @date 2021-06-11 ,11:24
 * @packageName com.imooc.product.testdemo
 */
public class T01_CacheLinePadding {
    private static class T {
        public volatile long x = 0L;
    }

    public static T[] arr = new T[2];

    static {
        arr[0] = new T();
        arr[1] = new T();
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000_0000L; i++) {
                arr[0].x = i;
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000_0000L; i++) {
                arr[1].x = i;
            }
        });


        final long start = System.nanoTime();
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println((System.nanoTime() - start )/ 100_0000);
    }
}
