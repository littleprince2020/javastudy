package com.llittleprinc.base;

/**
 * @Description Hello world
 * @Author LittlePrince
 * Java 是强类型的语言，要求变量使用严格符合规定，所有变量都必须先定义后才能使用

 * 数值类型：8大数据类型
 * 引用类型：类，接口，数组
 */
public class Hello {
    public static void main(String[] args) {
        //sout 快捷键输出Hello world
        /*
        多行注释
         */

        //整数
        byte num1 =10;    //1 个字节  1B = 8b   1024B=1KB  1024KB = 1M   1024M = 1G
        short num3 = 30;   //2个字节
        int num2 = 20;     //4个字节
        long  num4 = 30L; //long 后面加L 8个字节
        //小数
        float num5 = 50.1F; //数字后面加F 4个字节
        double num6 = 3.1415925; //8个字节
        //字符
        char name ='锅';       //2个字节 1
        //布尔 true false
        boolean flag = true; //1 位

        String student = "LittlePrince";
        String 王者荣耀 = "王者";
        System.out.println(王者荣耀);
        System.out.println("Hello world");

    }
}

