/* W.A.P to check whether the traingle is equilateral, scalene, or isosceles. Hint: - Isosceles triangle: In geometry, an isosceles triangle is a triangle that has two sides of equal length. Equilateral triangle: In geometry, an equilateral triangle is a triangle in which all three sides are equal. Scalene triangle: A scalene triangle is a triangle that has three unequal sides. */

import java.util.Scanner;

class Triangle{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
       float l,b,h;
       
        System.out.println("Enter l");
        l= sc.nextFloat();
        
        System.out.println("Enter b");
        b= sc.nextFloat();
        
        System.out.println("Enter h");
        h= sc.nextFloat();
         
        
        if(l==b && l==h)
        {
            System.out.println("Given Triangle is equilateral");
        }
        
        else if((l==b || l==h )||(b==h ) )
         {
            System.out.println("Given Triangle is isosceles");
        }
        
        else
        {
        System.out.println("Given Triangle is sceles");
        }
    }
}
