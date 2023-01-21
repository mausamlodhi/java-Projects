/*27. Write a Java program to input basic salary of an employee and calculate its Gross salary according to following: 
Basic Salary <= 10000 : HRA = 20%, DA = 80% 
Basic Salary <= 20000 : HRA = 25%, DA = 90% 
Basic Salary > 20000 : HRA = 30%, DA = 95% */

import java.util.Scanner;

class Salary{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int bs;
       float gs,hra,da;
       
        System.out.println("Enter Basic Salary");
        bs= sc.nextInt();
        
        
        if(bs <= 10000)
        {
        	gs= ((bs*0.20f)+ (bs*0.80f) +bs);
            System.out.println("Gross salary is ="+gs);
        }
        
        else if(bs <= 20000 )
         {
         	gs= ((bs*0.25f)+ (bs*0.90f) +bs);
            System.out.println("Gross salary is ="+gs);
        }
        
        else if(bs > 20000)
        {
        gs= ((bs*0.30f)+ (bs*0.95f)+bs );
       System.out.println("Gross salary is ="+gs);
        }        
      else{
      System.out.println("Again Enter");  
      }
    }
}
