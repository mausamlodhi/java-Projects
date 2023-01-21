//Write a Java program to calculate profit or loss

import java.util.Scanner;

class Profit{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
       int cp,sp,ans;
       
        System.out.println("Enter Amount");
        cp= sc.nextInt();
        
        System.out.println("Enter Amount");
        sp= sc.nextInt();
         
        ans=sp-cp;
        
        if(sp > cp)
        {
            System.out.println("Its profit"+ans);
        }
        
        else {
            System.out.println("Its Loss"+ans);
        }
    }
}
