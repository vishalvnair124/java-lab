// wirte java program for perform Array sorting

import java.util.Scanner;
class Arraysorting{
 public static void main(String nandhu[]){
    
    int temp;
    Scanner obj=new Scanner(System.in);
    System.out.print("Enter a number of elements:");
    int n=obj.nextInt();
    int a[]=new int[n];
    System.out.println("Enter elements");
    for(int i=0;i<n;i++){
        a[i]=obj.nextInt();
    }
    System.out.println("Array Before Sort");
    for(int i=0;i<n;i++){
        System.out.print(" "+a[i]);
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(a[i]<a[j]){
             temp=a[i];
             a[i]=a[j];
             a[j]=temp;        
            }
        }
    }
    System.out.println("");
    System.out.println("Array After Sort");
    for(int i=0;i<n;i++){
        System.out.print(" "+a[i]);
    }
 }
}


// Enter a number of elements:6
// Enter elements
// 1
// 7
// 3
// 8
// 2
// 4
// Array Before Sort
//  1 7 3 8 2 4
// Array After Sort
//  1 2 3 4 7 8