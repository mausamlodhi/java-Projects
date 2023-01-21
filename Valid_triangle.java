//  Print number between 1 to 5 in word format

import java.util.Scanner;

class Valid_triangle{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
       int a1,a2,a3,ans;
       
        System.out.println("Enter First Angle");
        a1= sc.nextInt();
        
        System.out.println("Enter Second Angle");
        a2= sc.nextInt();
        
        System.out.println("Enter Third Angle");
        a3= sc.nextInt();
         
        ans=a1+a2+a3;
        
        
        if(ans==180)
        {
            System.out.println("Its a Valid Triangle");
        }
        
         else
        {
            System.out.println("Its not a Valid Triangle");
        }
    }
}
