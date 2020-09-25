package com.llittleprinc.operator;//定义包 包名一般是公司区域名倒置
import com.llittleprinc.base.*; //*是通配符


import java.util.Date;

public class Damo08 {
    public static void main(String[] args) {

        //x?y:z
        //如果x==true 则结果为y，否则结果为z
        int soure = 80;
        String type = soure <60?"不及格":"及格";
        System.out.println(type);
        Date date = new Date();

    }
}
