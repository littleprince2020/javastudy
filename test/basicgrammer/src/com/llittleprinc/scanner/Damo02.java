package com.llittleprinc.scanner;

import java.util.Scanner;
//NextLine()
//以Enter 键为结束符，也就是nextLine()方法返回的是输入回车之前的所有字符
//nextLine() 可以获取空白字符
public class Damo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用NextLine的方式接收："); //输入Hello world
        if(scanner.hasNextLine())
        {
            String str = scanner.nextLine();
            System.out.println("输出内容为："+str);  //输出Hello world

        }
        scanner.close();
    }
}
