// wirte a program for implements priority  in Thread


import java.lang.Thread;

class A extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread A: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread A interrupted.");
            }
            Thread.yield(); // Yield to other threads
        }
        System.out.println("Exit from A");
    }
}

class B extends Thread {
    public void run() {
        this.setPriority(Thread.MAX_PRIORITY); // Setting thread B to the highest priority
        for (int j = 1; j <= 5; j++) {
            System.out.println("Thread B: " + j);
        }
        System.out.println("Exit from B");
    }
}

class C extends Thread {
    public void run() {
        this.setPriority(Thread.MIN_PRIORITY); // Setting thread C to the lowest priority
        for (int k = 1; k <= 5; k++) {
            System.out.println("Thread C: " + k);
        }
        System.out.println("Exit from C");
    }
}

public class ThreadPriority {
    public static void main(String[] args) {
        A threadA = new A();
        B threadB = new B();
        C threadC = new C();
        threadA.start();
        threadB.start();
        threadC.start();
    }
}

// Thread A: 1
// Thread B: 1
// Thread B: 2
// Thread B: 3
// Thread B: 4
// Thread B: 5
// Exit from B
// Thread C: 1
// Thread C: 2
// Thread C: 3
// Thread C: 4
// Thread C: 5
// Exit from C
// Thread A: 2
// Thread A: 3
// Thread A: 4
// Thread A: 5
// Exit from A