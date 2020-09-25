package com.llittleprinc.operator;

public class Damo02 {
    public static void main(String[] args) {
        long a = 1234567345L;
        int b = 123;
        short c = 10;
        byte d = 8;
        System.out.println(a+b+d+c);//有Long 输出就是Long类型
        System.out.println(b+c+d); //int
        System.out.println(c+d); // int short +byte 为Int
        System.out.println((double)c+d);//int 可以转换城double 不可以转成string
        System.out.println((long) c+d);
        System.out.println(b%c);//3
        System.out.println(b%d);//3
        System.out.println((int)d);//8
        System.out.println((long )c);//10
    }
}
