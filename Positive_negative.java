//  WAP to check wheater number is positive or negative

import java.util.Scanner;

class Positive_negative{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
       int a;
       
        System.out.println("Enter First value");
        a= sc.nextInt();
         
        
        if(a>0)
        {
            System.out.println("Number is Positive");
        }
        
        else {
            System.out.println("Number is Negative");
        }
    }
}
