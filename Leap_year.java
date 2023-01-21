//   WAP to check given year is a leap year or not

import java.util.Scanner;

class Leap_year{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
       int year;
       
        System.out.println("Enter Year");
        year= sc.nextInt();
         
        
        if((year %4==0 || year%400==0) ||( year % 100==0))
        {
            System.out.println("Given Year is leap year");
        }
        
        else {
            System.out.println("Given Year is not a leap year");
        }
    }
}
