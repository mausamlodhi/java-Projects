//  WAP to check wheather number is even or odd

import java.util.Scanner;

class Even_odd{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
       int a;
       
        System.out.println("Enter First value");
        a= sc.nextInt();
         
        
        if(a%2==0)
        {
            System.out.println("Number is even");
        }
        
        else {
            System.out.println("Number is odd");
        }
    }
}
