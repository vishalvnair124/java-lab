// write a java program to implement the sleep(),yield(),stop(),methods(),in thread
import java.lang.Thread;

class A extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            if (i == 1)
                Thread.yield();
            System.out.println("Thread A: " + i);
        }
        System.out.println("Exit from A");
    }
}

class B extends Thread {
    public void run() {
        for (int j = 1; j <= 5; j++) {
            if (j == 1)
               interrupt();
            System.out.println("Thread B: " + j);
        }
        System.out.println("Exit from B");
    }
}

class C extends Thread {
    public void run() {
        for (int k = 1; k <= 5; k++) {
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println("Error Occurred: " + e);
            }
            System.out.println("Thread C: " + k);
        }
        System.out.println("Exit from C");
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        A threadA = new A();
        B threadB = new B();
        C threadC = new C();
        threadA.start();
        threadB.start();
        threadC.start();
    }
}
