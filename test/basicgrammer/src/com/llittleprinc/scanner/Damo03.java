package com.llittleprinc.scanner;

import java.util.Scanner;

public class Damo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数据："); //输入Hello world
        String str = scanner.nextLine();
        System.out.println("输出内容为："+str);  //输出Hello world
        scanner.close();
    }
}
