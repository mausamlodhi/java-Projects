//  W.A.P to convert temperature from Fahrenheit to Celsius and Celsius to Fahrenheit. For given problem you have to take choice from user. If user enter choice ‘c’ or ‘C’ then convert Fahrenheit to Celsius. If user enter choice ‘f’ or ‘F’ then convert Celsius to Fahrenheit. 


import java.util.Scanner;

class Celcius{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
       float c,f;
       
        System.out.println("Enter value what you find Fahrenheit for 'f' and Celsius for 'c' ");
        char ch= sc.next().charAt(0);
         
        
        switch(ch)
        {
        case 'f':
        System.out.println("Enter Fahrenheit ");
        f= sc.nextInt();
        c=(f-32)/1.8f;
        System.out.println("Celsius is = "+c);
        break;
        
        case 'c':
        System.out.println("Enter Celcius ");
        c= sc.nextInt();
        f=c*(9/5f+32);
        System.out.println("Fahrenheit is ="+f);
        break;
        
        default:
         System.out.println("Invelid input");
         }
    }
}
