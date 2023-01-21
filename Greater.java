//  WAP to find greater among two number 

import java.util.Scanner;

class Greater{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
       int a,b;
       
        System.out.println("Enter First value");
        a= sc.nextInt();
         System.out.println("Enter Second value");
        b= sc.nextInt();
        
        if(a>b)
        {
            System.out.println("A is Greater");
        }
        
        else{
            System.out.println("B is Greater");
        }
    }
}
