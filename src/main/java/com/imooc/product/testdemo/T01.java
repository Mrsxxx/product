package com.imooc.product.testdemo;

import org.openjdk.jol.info.ClassLayout;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author zxW
 * @ClassName: T01
 * @Description:
 * @date 2021-02-04 ,11:06
 * @packageName com.imooc.product.testdemo
 */
public class T01 {

    public static void main(String[] args) {

        // >java -XX:+PrintCommandLineFlags -version
        // -XX:+UseCompressedClassPointers  压缩类指针
        // -XX:+UseCompressedOops   压缩普通对象指针

        AtomicInteger atomicInteger = new AtomicInteger();
        //递增并拿到当前的值
        //compareAndSwapInt  c \ c++ 的实现
        //在没有锁的状态下可以保证多个线程对一个值的更新
        //Unsafe.cpp
        int i = atomicInteger.incrementAndGet();
        //AtomicStampedReference a = new AtomicStampedReference();

        //lock cmpxchg（锁定cpu）

        //jol  java object  Layout
        // markword
        //class pointer
        //实例数据
        //补位
        Object o = new Object();
        o.hashCode();
        System.out.println(ClassLayout.parseInstance(o).toPrintable());


        synchronized (o) {


        }
    }
}
