//  write a program  for implement the
//  concept of hread by extending Thread class

import java.lang.Thread;

class A extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread A: " + i);
        }
        System.out.println("Exist from A");
    }

}

class B extends Thread {
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("Thread B: " + j);
        }
        System.out.println("Exist from B");
    }
}

class C extends Thread {
    public void run() {
        for (int k = 1; k <= 5; k++) {
            System.out.println("Thread C: " + k);
        }
        System.out.println("Exist from C");
    }

}

public class ThreadDemo {
    public static void main(String[] args) {
       
   A threadA =new A();
   B threadB =new B();
   C threadC = new C();

   threadA.start();
   threadB.start();
   threadC.start();
        
      

    }
}

// Thread A: 1
// Thread A: 2
// Thread A: 3
// Thread A: 4
// Thread A: 5
// Exist from A
// Thread B: 1
// Thread B: 2
// Thread B: 3
// Thread C: 1
// Thread C: 2
// Thread C: 3
// Thread C: 4
// Thread C: 5
// Thread B: 4
// Exist from C
// Thread B: 5
// Exist from B