//  W.A.P to check the sign of given number. 
import java.util.Scanner;

class Sign{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
       int a;
       
        System.out.println("Enter A number");
        a= sc.nextInt();
         
        
        if(a>0)
        {
            System.out.println("Number has Positive Sign");
        }
        
        else {
            System.out.println("Number has Negative Sign");
        }
    }
}
