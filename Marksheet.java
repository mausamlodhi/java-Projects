//  WAP to calculate the percentage of students

import java.util.Scanner;

class Marksheet{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
       int h,e,m,s,c,total;
       float avg;
        System.out.println("Enter The Hindi marks");
        h= sc.nextInt();
        
        System.out.println("Enter The English  ");
        e= sc.nextInt();
        
        System.out.println("Enter The Maths marks  ");
        m= sc.nextInt();
        
        System.out.println("Enter The Science marks  ");
        s= sc.nextInt();
        
        System.out.println("Enter The Computer marks ");
        c= sc.nextInt();
        
        total= h+m+e+s+c;
        
        System.out.println("Total marks Obtained "+total);
        
        avg=total/5f;
         System.out.println("Area of Rectangle is ="+avg);
        
    }
}
