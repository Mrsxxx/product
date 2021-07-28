package com.imooc.product.testdemo;

/**
 * @author zxW
 * @ClassName: T
 * @Description:JIT (just in time)及时编译器
 * @date 2021-05-21 ,10:40
 * @packageName com.imooc.product.testdemo
 */
public class T_HelloStringBuffer {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < 10000; i++) {
            StringBuffer a = sb.append("a");

        }
    }

}
