// WAP to calculate area of circle

import java.util.Scanner;

class Circle{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        float radius,pi=3.14f,area;
        System.out.println("Enter The radius");
        radius= sc.nextFloat();
        
        area=pi*radius*radius;
         System.out.println("Area of circle is ="+area);
        
    }
}
