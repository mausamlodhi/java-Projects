// Write a Java program to input day number and print week day.

import java.util.Scanner;

class Week_day{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
       int ch;
       
        System.out.println("Enter a no 1-7");
        ch= sc.nextInt();
         
        
        switch(ch)
        {
        case 1:
         System.out.println("Monday");
         break;
         
          case 2:
         System.out.println("Tuesday");
         break;
         
          case 3:
         System.out.println("Wednesday");
         break;
         
          case 4:
         System.out.println("Thursday");
         break;
         
          case 5:
         System.out.println("Friday");
         break;
         
          case 6:
         System.out.println("Saturday");
         break;
         
          case 7:
         System.out.println("Sunday");
         break;
        
        default:
         System.out.println("Invelid Input");
        }
    }
}
