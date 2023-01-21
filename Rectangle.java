//  WAP to calculate area of rectangle

import java.util.Scanner;

class Rectangle{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
       int l,b,area;
        System.out.println("Enter The length  ");
        l= sc.nextInt();
        
        System.out.println("Enter The breath  ");
        b= sc.nextInt();
        
        area=l*b;
         System.out.println("Area of Rectangle is ="+area);
    }
}
