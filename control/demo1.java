
// FizzBuzz: Write a program that prints the numbers from 1 to 100. But for 
// multiples of three, print "Fizz" instead of the number, and for the multiples of 
// five, print "Buzz". For numbers that are multiples of both three and five, print 
// "FizzBuzz".


package control;

public class demo1 {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){

            if(i%3==0&&i%5==0){
                System.out.println("FizzBuzz");   
                  
            }
           else if(i%3==0){
             System.out.println("Fizz");   
             
            }
            else if(i%5==0){
                System.out.println("Buzz");  
                
            }
            else{
               System.out.println(i);
            }
         
        }
    }
}
