//  Find even odd using switch case 

import java.util.Scanner;

class Even_Odd_Switch{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
       int a;
       
       
        System.out.println("Enter First value");
        a= sc.nextInt();
         
        switch(a%2)
        
        {
            case 0:
              System.out.println("No is even"); 
              break;
            
            case 1:
                System.out.println("no is odd");
                break;
              
        }
        
        
        
    }
}
