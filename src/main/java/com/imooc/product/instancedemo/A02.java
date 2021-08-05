package com.imooc.product.instancedemo;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author zxW
 * @ClassName: A02
 * @Description:
 * @date 2021-07-30 ,16:25
 * @packageName com.imooc.product.instancedemo
 */
public class A02 {
    volatile int count = 0;
    AtomicLong countB = new AtomicLong(0);

     synchronized  void m() {
        for (int i = 0; i < 10000; i++) countB.incrementAndGet();


    }


    public static void main(String[] args) {
        A02 t = new A02();
        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            threads.add(new Thread(t::m, "thread-" + i));
        }
        threads.forEach((o) -> o.start());
        threads.forEach((o) -> {
            try {
                o.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        System.out.println(t.count);
    }
}
