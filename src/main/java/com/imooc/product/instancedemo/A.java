package com.imooc.product.instancedemo;

/**
 * @author zxW
 * @ClassName: A
 * @Description:
 * @date 2021-07-30 ,14:27
 * @packageName com.imooc.product.instancedemo
 */
public class A {
    public static final A instance = new A();


    private A() {
    }

    public static A getInstance() {
        return instance;
    }

    public void m() {
        System.out.println("aa");
    }

    public static void main(String[] args) {
        A a1 = A.getInstance();
        A a2 = A.getInstance();
        System.out.println(a1 == a2);
    }

}
