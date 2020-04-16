package com.zufrost.learn;

public class LogicalOperatorsLearn {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        boolean a = x == y;
        boolean b = x != y;
        System.out.println((x++ == y++ && x++ != y++) || x++ == y++);
        System.out.println("x= " + x + ", y= " + y);
    }
}
