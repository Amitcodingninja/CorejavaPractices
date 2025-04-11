package org.Revision;

public class Demo4 {
    int value;

    Demo4(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }
    
    public int hashCode1() {
        return 100;
    }

    public static void main(String[] args) {
        Demo4 d1 = new Demo4(10);
        Demo4 d2 = new Demo4(20);

        System.out.println("d1.equals(d2): " + d1.equals(d2)); // ❌ false
        System.out.println("d1.hashCode(): " + d1.hashCode()); // ✅ 100
        System.out.println("d2.hashCode(): " + d2.hashCode());
    }


}


