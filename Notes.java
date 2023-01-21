// Write a Java program to count total number of notes in given amount. 

import java.util.Scanner;


 class Notes {
  public static void main(String[] args) {
 
  Scanner sc = new Scanner(System.in);
 
    int n2000,n500,n200,n100,n50,n20,n10,n5,n2,n1;
    
    int amt;
    System.out.println("Enter Ammount\n");
    amt= sc.nextInt();
           n2000= amt/2000;
    amt=amt%2000;
    
    n500=amt/500;
    amt=amt%500;
    
    n200=amt/200;
    amt=amt%200;
    
    n100=amt/100;
    amt=amt%100;
    
    n50=amt/50;
    amt=amt%50;
    
    n20=amt/20;
    amt=amt%20;
    
    n10=amt/10;
    amt=amt%10;
    
    n5=amt/5;
    amt=amt%5;
    
    n2=amt/2;
    amt=amt%2;
    
    n1=amt/1;
    amt=amt%1;
    
          System.out.println("2000 rupey ke "+n2000+" notes");
    System.out.println("500 rupey ke "+n500+" notes");
    System.out.println("200 rupey ke "+n200+" notes");
    System.out.println("100 rupey ke "+n100+" notes");
    System.out.println("50 rupey ke "+n50+" notes");
    System.out.println("20 rupey ke "+n20+" notes");
    System.out.println("10 rupey ke "+n10+" notes");
    System.out.println("5 rupey ke "+n5+" notes");
    System.out.println("2 rupey ke "+n2+" coines");
    System.out.println("1 rupey ke "+n1+" coines");
  }
}

