//  Check given character is vowel or not using switch case 

import java.util.Scanner;

class Vowel{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
     String ch;
       
       
        System.out.println("Enter a character");
        ch= sc.next();
         
        switch(ch)
        {
            case "a":
              System.out.println("a is vovel"); 
              break;
              
               case "e":
              System.out.println("e is vovel"); 
              break;
              
               case "i":
              System.out.println("i is vovel"); 
              break;
              
               case "o":
              System.out.println("o is vovel"); 
              break;
              
               case"u":
              System.out.println("u is vovel"); 
              break;
              
               case "A":
              System.out.println("A is vovel"); 
              break;
              
               case "E":
              System.out.println("E is vovel"); 
              break;
              
               case "I":
              System.out.println("I is vovel"); 
              break;
              
               case "O":
              System.out.println("O is vovel"); 
              break;
              
               case "U":
              System.out.println("U is vovel"); 
              break;
            
           default:
            System.out.println("Character is Consonent");
              
        }
    }
}
