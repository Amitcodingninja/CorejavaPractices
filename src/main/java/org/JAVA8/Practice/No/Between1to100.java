package org.JAVA8.Practice.No;

public class Between1to100 {
    public static void main(String[] args) {
////        Supplier<Integer> randomSupplier =
////                () -> new Random()
////                        .nextInt(100000) + 99999;
////        int randomNumber = randomSupplier.get();
////        System.out.println("Random number between 1 and 100: " + randomNumber);
//
//        int random = 100000 + (int) (Math.random() * 999999);
//        System.out.println(random);
//
//
//    }
//}


        B b = new B();
        b.print();

    }
}


interface A {
    void print();
}


class B implements A {

    @Override
    public void print() {
        System.out.println("hello Baby");
    }
}