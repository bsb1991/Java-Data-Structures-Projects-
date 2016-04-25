import java.io.*;

import java.util.*;
public class Exercise6 {
	static Scanner console = new Scanner (System.in);
	

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		
		 int numRight = 0;
		 int numWrong = 0;
		 int i = 0;
		 double grade = 0;
		 double finalGrade;
		 String studentId;
		 String inputString;
		 char ch;
		
		 Scanner input = new Scanner(new File("key.txt"));
		 inputString = input.nextLine();
		 
		 char[] answerKey = new char[20];
		 char[]studentAnswer = new char [20];
		 
		 System.out.println("Answer key is: ");
		 // answerKey to array
		 for(i=0; i<20; i++)
		 {
			 answerKey[i] = inputString.charAt(i);
			 System.out.print(" " +answerKey[i]); 
		 }
		 // reading studentRecords
		 while(input.hasNext()) {
			 finalGrade=0;
			grade = 0;
			 studentId = input.next();
			 System.out.println(" \n"+studentId);
			 System.out.print("Student Answers: ");
			 
			 
			 inputString = input.nextLine();
			 inputString = inputString.trim();
			 
			 System.out.println(" "+inputString);
			 
			
			 for(i=0; i<inputString.length(); i++){
			 
				 studentAnswer[i] = inputString.charAt(i);
				 System.out.print(studentAnswer[i]);
			 }
			 
			 for (i=0; i<20;i++){
				 
				 
				 if (studentAnswer[i] == answerKey[i])
					 grade +=2;
				 else if (!(studentAnswer[i] == ' '))
					 grade--;

					 
			 }
			 
			 finalGrade = grade / 40 *100;
		 	 if(finalGrade>= 90)
				 ch= 'A';
			 	  else if(finalGrade >= 80)
						 ch = 'B';
				  else if (finalGrade >= 70)
					 ch= 'C';
				  else if (finalGrade >=60)
					 ch = 'D';
				  else ch ='F';
			 	
			 
			 
			 
			 System.out.println("\nYour Grade is: " + ch +" " + finalGrade);
			 
			
				 
			 
			 }




	}

}
