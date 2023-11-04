//  write a program  for implement the
//  concept of hread by extending Runnable interface class

import java.lang.Runnable;
import java.lang.Thread;

class A implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread A: " + i);
        }
        System.out.println("Exist from A");
    }

}

class B implements Runnable {
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("Thread B: " + j);
        }
        System.out.println("Exist from B");
    }
}

class C implements Runnable {
    public void run() {
        for (int k = 1; k <= 5; k++) {
            System.out.println("Thread C: " + k);
        }
        System.out.println("Exist from C");
    }

}

public class RunnableDemo {
    public static void main(String[] args) {
        Runnable threadA = new A();
        Runnable threadB = new B();
        Runnable threadC = new C();

        Thread t1 = new Thread(threadA);
        Thread t2 = new Thread(threadB);
        Thread t3 = new Thread(threadC);
        t1.start();
        t2.start();
        t3.start();

    }
}

    // Thread B: 1
    // Thread B: 2
    // Thread A: 1
    // Thread A: 2
    // Thread C: 1
    // Thread C: 2
    // Thread B: 3
    // Thread B: 4
    // Thread A: 3
    // Thread C: 3
    // Thread C: 4
    // Thread B: 5
    // Exist from B
    // Thread A: 4
    // Thread C: 5
    // Exist from C
    // Thread A: 5
    // Exist from A