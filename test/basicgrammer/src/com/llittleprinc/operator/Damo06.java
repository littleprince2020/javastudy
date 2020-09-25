package com.llittleprinc.operator;

public class Damo06 {
    public static void main(String[] args) {
        /*
        * A = 0011 1100
        * B = 0000 1101
        * A&B = 0000 1100
        * A|B = 0011 1101
        * A^B = 0011 0001  //相同为0，不同为1
        * ~B =1111 0010
        * 2*8 2*2*2
        *<<   *2
        * >>  /2
        * */
        System.out.println(2<<3); //16
        System.out.println(2>>3); //0
    }
}
