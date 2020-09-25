package com.llittleprinc.base;

public class Damo03 {
    public static void main(String[] args) {
        //拓展 二进制 十进制 十六进制
        int i = 10;
        int i2 = 010;
        int i3 = 0x10;
        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
        //===================================
        //浮点数拓展？银行业务怎么表示
        //float:有限 离散 舍入误差  大约  接近但不等于  所以不能用Float 做比较
        //银行一般用BigDecimal 数学工具类
        // ==================================
         float f = 0.1f;     //0.1
         double d = 1.0/10;  //0.1
        System.out.println(f==d);  //false
        float d1 = 23121212121f;
        float d2 = d1+1;
        System.out.println(d1 == d2); // true
        //===================================
        //字数拓展？
        //所有的字符本质还是数据
        //编码 Unicode 2个字节 65536
        //转义字符 \t \n
        // ==================================
        char c1 = 'a';
        char c2 = '中';
        char c3 = '\u0051';
        System.out.println(c1);       //a
        System.out.println((int)c1);  //97
        System.out.println(c2);       // 中
        System.out.println((int)c2);  //20013
        System.out.println(c3);
        System.out.println("Hello\tWorld");
        System.out.println("Thank\nYout");
        //===================================
        // String 拓展
        //===================================
        String sa = new String("Hello world");
        String sb = new String("Hello world");
        System.out.println(sa == sb);   //false
        String sc = "Hello world";
        String sd = "Hello world";
        System.out.println(sc == sc);   // true

    }
}
