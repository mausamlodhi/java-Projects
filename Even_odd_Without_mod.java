import java.util.Scanner;

class Even_odd_without_mod{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
       int a;
       
       
        System.out.println("Enter a number");
        a= sc.nextInt();
         
       if((a/2)*2==a)
       {
       System.out.println("Number is Even");
       }
       
       else{
       System.out.println("Number is odd");
        }
        
    }
}

//                                 or                 
/*
import java.util.Scanner;

class Even_odd_without_mod{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
       int a;
       
       
        System.out.println("Enter First value");
        a= sc.nextInt();
         
       if((a&1)==0)
       {
       System.out.println("Number is Even");
       }
       
       else{
       System.out.println("Number is odd");
        }
        
    }
}
*/