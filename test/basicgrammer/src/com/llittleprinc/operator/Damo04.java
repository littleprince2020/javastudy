package com.llittleprinc.operator;

public class Damo04 {
    public static void main(String[] args) {
        //++ -- 自增 自减 一元运算
        int a =3;
        System.out.println(a); //3
        int b = a++;           //执行完这行代码，先给b赋值，再给a + 1
        System.out.println(a);//4
        System.out.println(b);//3
        int c = ++a;          //先给a+1 后给c 赋值
        System.out.println(c);//5
        //幂运算
        double pow = Math.pow(2,3);
        System.out.println(pow);//8
    }
}
