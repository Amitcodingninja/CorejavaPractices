package org.Revisions;

class MySingleton {
    // Step 1: static object
 private static MySingleton instance = new MySingleton();

//     Step 2: private constructor
    private MySingleton() {
    }

    // Step 3: public method to return same object
    public static MySingleton getInstance() {
        System.out.println("Hello");
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

public class SingletonDemo {
    public static void main(String[] args) {


        MySingleton s1 = MySingleton.getInstance();
        MySingleton s2 = MySingleton.getInstance();


//        s1.showMessage();
//
//        // ✅ Same object hai
        System.out.println(s1 == s2);  // true

    }
}
