//   WAP to find greater among three number

import java.util.Scanner;

class Greater_in_3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
       int a,b,c;
       
        System.out.println("Enter First value");
        a= sc.nextInt();
         System.out.println("Enter Second value");
        b= sc.nextInt();
         System.out.println("Enter Third value");
        c= sc.nextInt();
        
        if(a>b && a>c)
        {
            System.out.println("A is Greater");
        }
        
        else if(b>c)
        {
            System.out.println("B is Greater");
        }
        
        else {
            System.out.println("C is Greater");
        }
    }
}
