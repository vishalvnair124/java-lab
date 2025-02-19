// Prime Number Checker: Write a program that prompts the user to enter a 
// positive integer and then checks whether the entered number is a prime 
// number or not.

package control;

public class demo3 {
  public static void main(String[] args) {
    int num=100;

    boolean isPrime=true;

    for(int i=2;i<Math.sqrt(num);i++){
        if(num%i==0){
            isPrime=false;
            break;
        }
    }
    if(isPrime){
        System.out.println(num+" is a prime number");
    }else{
        System.out.println(num+" is not a prime number");
    }
  }  
}
