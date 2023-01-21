//  Program to perform arithmetic operation using switch case

import java.util.Scanner;

class Calculator{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
     int a,b,c,ch;
     
     System.out.println("Enter a no for #Add  1\t #sub   2\t #Mul   \t #Div  4\t #Mod  5\t");
       ch= sc.nextInt();
       
       System.out.println("Enter First number");
        a= sc.nextInt();
        
        System.out.println("Enter Second number");
        b= sc.nextInt();
         
        switch(ch)
        {
            case 1:
                c=a+b;
              System.out.println("Add is ="+c); 
              break;
              
               case 2:
                c=a-b;   
             System.out.println("Sub is ="+c); 
              break;
              
               case 3:
                   c=a*b;
              System.out.println("Mul is ="+c); 
              break;
              
               case 4:
                   c=a/b;
             System.out.println("Div is ="+c); 
              break;
              
               case 5:
                   c=a%b;
              System.out.println("Mod is ="+c);  
              break;
              
            
           default:
            System.out.println("Invelid input");
              
        }
    }
}
