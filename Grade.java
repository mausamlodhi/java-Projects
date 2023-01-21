/*Write a Java program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer.          Calculate percentage and grade according to following: 
	Percentage >= 90% : Grade A 
	Percentage >= 80% : Grade B 
	Percentage >= 70% : Grade C 
	Percentage >= 60% : Grade D 
	Percentage >= 40% : Grade E 
	Percentage < 40% : Grade F
	*/
	
	
import java.util.Scanner;

class Grade{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
     int p,ch,m,bio,com;
       float per;
        System.out.println("Enter The Hindi marks");
        p= sc.nextInt();
        
        System.out.println("Enter The English  ");
        ch= sc.nextInt();
        
        System.out.println("Enter The Maths marks  ");
        m= sc.nextInt();
        
        System.out.println("Enter The Science marks  ");
        bio= sc.nextInt();
        
        System.out.println("Enter The Computer marks ");
        com= sc.nextInt();
        
        per= (p+ch+m+bio+com)/5;
        
        System.out.println("Total marks Obtained "+per);
        
        if(per >=90)
        {
        System.out.println("Grade A");
	}   
	
	 else if(per >=80)
        {
        System.out.println("Grade B");
	}   
	
	 else if(per >=70)
        {
        System.out.println("Grade C");
	}   
	
	 else if(per >=60)
        {
        System.out.println("Grade D");
	}   
	
	 else if(per >=40)
        {
        System.out.println("Grade E");
	} 
	
	 else
        {
        System.out.println("Fail");
	}          
	
	
}
}
