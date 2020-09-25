package com.llittleprinc.operator;

public class Damo07 {
    public static void main(String[] args) {
        int a= 10;
        int b= 20;
        a+=b;
        System.out.println(a); //30
        a+=b;
        System.out.println(a);//50
        a-=b;
        System.out.println(a);//30
        System.out.println(""+a+b);//3020 输出字符串
        System.out.println(a+b+"");//50 先加


    }
}
