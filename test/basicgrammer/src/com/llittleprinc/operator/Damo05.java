package com.llittleprinc.operator;

public class Damo05 {
    public static void main(String[] args) {
     //与 或 非
        boolean a = true;
        boolean b = false;
        System.out.println("a && b:" +(a&&b));  //变量都为true 结果才是true
        System.out.println("a || b:" +(a||b));  //变量有一个为真，结果为真
        System.out.println("!(a && b):" +!(a&&b));//取反，真变假来，假变真
        //短路运算
        int c = 5;
        boolean d = (c<4)&&(c++<4); //c<5 为fase   如果执行了应该是6，没有执行就是5
        System.out.println(d); // 所以d false
        System.out.println(c); //输出结果5  由此断定有短路运算 不执行 && 后面的语句
    }
}
