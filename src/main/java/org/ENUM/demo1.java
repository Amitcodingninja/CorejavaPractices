package org.ENUM;


enum Pizza{
    SMALL,
    MEDIUM,
    LARGE
}
public class demo1 {
    public static void main(String[] args) {
        Pizza mypizza = Pizza.LARGE;
        if (mypizza==Pizza.LARGE){
            System.out.println("Super");
        }
    }
}
