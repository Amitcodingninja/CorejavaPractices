package org.ENUM;

enum size {
    SMALL(30),
    MEDIUM(40),
    LARGE(50);

    private int value;

    size(int value) {
        this.value = value;
    }

    int getValue() {
        return value;
    }
}

public class demo2 {
    public static void main(String[] args) {
        size s  = size.LARGE;
        System.out.println(s);
        System.out.println(s.getValue());
    }

}
