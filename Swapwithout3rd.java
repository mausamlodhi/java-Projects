// WAP to exchange value to two variable without third variable

import java.util.Scanner;

class Swapwithout3rd{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
       int a,b,c;
       
        System.out.println("Enter First value");
        a= sc.nextInt();
         System.out.println("Enter Second value");
        b= sc.nextInt();
     
       System.out.println("The value of A "+a);
         System.out.println("The value of B "+b);
       
     a=a+b;
     b=a-b;
     a=a-b;
       System.out.println("The value of A is After Swap"+a);
         System.out.println("The value of Bis After Swap "+b);
       
        
    }
}
