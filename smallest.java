//  WAP to find lowest number among four different number

import java.util.Scanner;

class Smallest{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
     int a,b,c,d;
         System.out.println("Enter 4 numbers");
        a= sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();
        d= sc.nextInt();
        
       if(a<b && a<c && a<d)
       {
          System.out.println("A is Smallest"); 
       }
       
       else if(b<a && b<c && b<d)
       {
           System.out.println("B is Smallest"); 
       }
       
       else if(c<a && c<b && c<d)
       {
           System.out.println("C is Smallest"); 
       }
       else
       {
           System.out.println("d is Smallest"); 
       }
    }
}
