/* Write a program to input choice from user. If user enter ‘+’ as choice then calculate addition of 2 number. If Choice ‘>’ then check which number is greaterst. If choice   is ‘==’ then check both number is equal or not.*/

import java.util.Scanner;

class Calculater2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
     int a,b,c,ch;
     boolean d;
     
     System.out.println("Enter a no for #Add  1\t #sub   2\t #Mul   \t #Div  4\t #Mod  5\t  #garter then  6\t  #Smaller then   7 \t #Equal  =\t");
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
              
              
               case 6:
                   d=a>b;
              System.out.println("A is Grater ="+d);  
              break;
              
               case 7:
                   d=a<b;
              System.out.println("A is smaller="+d);  
              break;
              
               case 8:
                   d=a==b;
              System.out.println("Both are Equal ="+d);  
              break;
            
           default:
            System.out.println("Invelid input");
              
        }
    }
}


