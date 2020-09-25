package com.llittleprinc.scanner;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

//next()的特点
//1.一定要读到有效字符才可以技术
//对于输入有效字符之前的空白，next()会自动将其去掉
//直到输入有效字符后才将后面的空格作为分隔符或者结束符
//next()不能得到带空格的字符

public class Damo01 {
    public static void main(String[] args) {
        //创建一个扫描器对象，用于接收键盘数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("用next 方式接收数据：");
        //判断用户有没有输入字符串
        if(scanner.hasNext())
        {
            //使用next 方式接收
            String str = scanner.next();//程序会等待用户输入完毕  用户输入Hello World
            System.out.println("输出内容为："+str);     //程序输出 Hello
            //凡是属于IO流的类，如果不关闭会一直占用资源
            scanner.close();
        }
    }
}
