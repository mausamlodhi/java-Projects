//  Write a Java program to check whether a number is divisible by 5 and 11 or not. 

import java.util.Scanner;

class Divisible{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
       int no;
       
        System.out.println("Enter A number");
        no= sc.nextInt();
         
        
        if(no%5==0 && no%11==0)
        {
            System.out.println("no is Divisible");
        }
        
        else {
            System.out.println("no is not Divisible");
        }
    }
}
