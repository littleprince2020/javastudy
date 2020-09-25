package com.llittleprinc.base;

/*类名：首字母大写+驼峰*/
public class Damo07 {
    /* 类变量 static */
    static double salary = 25000;
    /*常量 建议大写+下划线*/
    //
    final static double PI = 3.14;
    static final  double PI1 =3.1415;


    /*属性：变量
    实例变量;从属于对象，如果不进行初始化，默认值未0
    布尔值默认为false
    除了基本类型，其余的默认值为null
    首字母小写+驼峰*/

    String name;
    int age;
    public static void main(String[] args) {
        //int a=1,b=2,c=3;//程序可读性差,不建议
        char a= 'c';
        //局部变量 必须声明和初始化值
        int i =10;
        System.out.println(i);

        Damo07 damo07 = new Damo07();
        System.out.println(damo07.name);
        System.out.println(damo07.age);

    }
    /*方法名：首字母小写+驼峰*/
    public void  add()
    {

    }

}
