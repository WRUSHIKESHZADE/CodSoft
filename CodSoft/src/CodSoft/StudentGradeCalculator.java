package CodSoft;

import java.util.Scanner;

public class StudentGradeCalculator {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int marks[] = new int[5];
		int sum = 0;
        double avg;	
        
		System.out.println("Enter The Marks Of 5 Subjects!");
		 for(int i=0;i<5; i++) {
			 
			 System.out.print("Enter Marks of Subject "+(i+1)+"(out of 100): ");
	           marks[i] = sc.nextInt(); 
	           sum = sum + marks[i];
		 }   
		 
		 System.out.println("Total of marks: " + sum);
		 
		 avg = sum/5.0;
		 System.out.println("Average percentage: "+ String.format("%.2f%%", avg));
		 
		 System.out.print("Grade is: ");
		 
	       if(avg>80) {
	    	   System.out.println("A");
	    	   
	       }else if(avg>=60 && avg<80) {
	    	   
	    	   System.out.println("B");
	    	   
	       }else if(avg>=40 && avg<60) {
	    	   
	    	   System.out.println("C");
	    	   
	       }else {
	    	   System.out.println("D");
	       }
		
	}

}

