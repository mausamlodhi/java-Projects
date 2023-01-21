/* Write a C program to input electricity unit charges and calculate total electricity bill according to the given condition:
 For first 50 units Rs. 0.50/unit 
 For next 100 units Rs. 0.75/unit 
 For next 100 units Rs. 1.20/unit 
 For unit above 250 Rs. 1.50/unit 
 An additional surcharge of 20% is added to the bill. 
 */


import java.util.Scanner;

class Electricity{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int unit;
       float bill,x;
       
        System.out.println("Enter Consumed Units of Electricity");
        unit= sc.nextInt();
         
        
        if(unit <=50)
        {
        	bill=unit*0.50f;
               x=bill*20/100;
               bill=bill+x;
            
        }
        
        else if (unit <=100){
        	
        	bill=(unit*0.75f);
               x=bill*20/100;
               bill=bill+x;
            
        }
        
          else if (unit <=150){
        	
        	bill=(unit*1.20f);
               x=bill*20/100;
               bill=bill+x;
           
        }
        
         
        else if (unit > 250){
        	
        	bill=(unit*1.50f);
              x=bill*20/100;
              bill=bill+x;
        }
          
        System.out.println("Bill is ="+bill);
        System.out.println("bill After Adding Additional charges ="+bill);
    }
}
