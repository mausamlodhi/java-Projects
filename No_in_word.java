//  Print number between 1 to 5 in word format

import java.util.Scanner;

class No_in_word{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
       int a;
       
        System.out.println("Enter First value");
        a= sc.nextInt();
         
        
        if(a==1)
        {
            System.out.println("One");
        }
        
        else if(a==2)
        {
            System.out.println("two");
        }
        
         else if(a==3)
        {
            System.out.println("Three");
        }
        
         else if(a==4)
        {
            System.out.println("Four");
        }
        
         else
        {
            System.out.println("Five");
        }
    }
}
