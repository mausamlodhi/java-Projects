// W.A.P to check whether a charachter is an alphabet or not.

import java.util.Scanner;

class Alphabet{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
       char c;
       
        System.out.println("Enter First value");
        c= sc.next().charAt(0);
         
        
        if((c >= 'a' && c<='z') || (c >= 'A' && c <= 'z'))
        {
            System.out.println("Its a alhbabet");
        }
        
     
         else
        {
            System.out.println("Its a number");
        }
    }
}
