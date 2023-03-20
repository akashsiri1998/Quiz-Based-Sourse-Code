package com.velocity.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class QuizQustion  {

	
	public static void getQustion() {
		Scanner sc=new Scanner(System.in);
		char a;
		int score =0;
		
		
		System.out.println(" \n1. Who is the Founder Of Core Java: ");
		System.out.println("A. James Gosling ");
		System.out.println("B. Tim-Barners Lee ");
		System.out.println("C. Charlies Babbage ");
		System.out.println("D. Bill Gates ");
		a=sc.next().charAt(0);
		
		switch(a) {
			
			case 'A':System.out.println("Your Answer is Correct ");
			score++;
			break;
		
		default: System.out.println("Sorry Wrong Answer");
		
		System.out.println("Sorry You Have To Select Wrong Option Plz Select Right Opstion");
		
//...........................................................................................................................//		 
	
		}
		
		System.out.println(" \n2. Number of primitive data Types in Core Java : ");
		System.out.println("A. 6 ");
		System.out.println("B. 10 ");
		System.out.println("C. 8 ");
		System.out.println("D. 11 ");
		a=sc.next().charAt(0);
		
		switch(a) {
			
			case 'C':System.out.println("Your Answer is Correct ");
			score++;
			break;
		
		default: System.out.println("Sorry Wrong Answer");
		System.out.println("Sorry You Have To Select Wrong Option Plz Select Right Opstion");
		
		
	}
		
		
//.........................................................................................................................//		
		
		
		System.out.println(" \n3. What is the Size of Float and Double in Java: ");
		
		System.out.println("A. 32 and 64");
		System.out.println("B. 32 and 32");
		System.out.println("C. 64 and 64 ");
		System.out.println("D. 64 and 32 ");
		a=sc.next().charAt(0);
		
		switch(a) {
			
			case 'A':System.out.println("Your Answer is Correct ");
			score++;
			break;
		
		default: System.out.println("Sorry Wrong Answer");
		
		System.out.println("Sorry You Have To Select Wrong Option Plz Select Right Opstion");
		
	  }
		
//.........................................................................................................................//	
		System.out.println(" \n4. Select Valid Statement : ");
	
		System.out.println("A. char[]ch=new char(5)");
		System.out.println("B. char[]ch=new char[5]");
		System.out.println("C. char[]ch=new char() ");
		System.out.println("D. char[]ch=new char[] ");
		a=sc.next().charAt(0);
		
		switch(a) {
			
			case 'B':System.out.println("Your Answer is Correct ");
			score++;
			break;
		
		default: System.out.println("Sorry Wrong Answer");
		
		System.out.println("Sorry You Have To Select Wrong Option Plz Select Right Opstion");
		
	}
//...........................................................................................................................//		
		
		System.out.println(" \n5. An interface with no fields or methods is known as a ______. : ");
		
		System.out.println("A. Runnable Interface");
		System.out.println("B. Marker Interface");
		System.out.println("C. Abstract Interface");
		System.out.println("D. CharSequence Interface ");
		a=sc.next().charAt(0);
		
		switch(a) {
			
			case 'B':System.out.println("Your Answer is Correct ");
			score++;
			break;
		
		default: System.out.println("Sorry Wrong Answer");
		
		System.out.println("Sorry You Have To Select Wrong Option Plz Select Right Opstion");
		
	}
//............................................................................................................................//		

        System.out.println(" \n6. Which of these classes are the direct subclasses of the Throwable class? : ");
		
		System.out.println("A. RuntimeException and Error class");
		System.out.println("B. Exception and VirtualMachineError class");
		System.out.println("C. Error and Exception class");
		System.out.println("D. IOException and VirtualMachineError class ");
		a=sc.next().charAt(0);
		
		switch(a) {
			
			case 'C':System.out.println("Your Answer is Correct ");
			score++;
			break;
		
		default: System.out.println("Sorry Wrong Answer");
		
		System.out.println("Sorry You Have To Select Wrong Option Plz Select Right Opstion");
		
	}
//...........................................................................................................................//
		
		  System.out.println(" \n7.  In which memory a String is stored, when we create a string using new operator? : ");
			
			System.out.println("A. Stack");
			System.out.println("B. String memory");
			System.out.println("C. Heap memory");
			System.out.println("D. Random storage space");
			a=sc.next().charAt(0);
			
			switch(a) {
				
				case 'C':System.out.println("Your Answer is Correct ");
				score++;
				break;
			
			default: System.out.println("Sorry Wrong Answer");
			
			System.out.println("Sorry You Have To Select Wrong Option Plz Select Right Opstion");
			
	
}

//...............................................................................................................................//
			 System.out.println(" \n8.  What is the use of the intern() method? : ");
				
				System.out.println("A. It returns the existing string from memory");
				System.out.println("B. It creates a new string in the database");
				System.out.println("C. It modifies the existing string in the database");
				System.out.println("D. None of the above");
				a=sc.next().charAt(0);
				
				switch(a) {
					
					case 'A':System.out.println("Your Answer is Correct ");
					score++;
					break;
				
				default: System.out.println("Sorry Wrong Answer");
				
				System.out.println("Sorry You Have To Select Wrong Option Plz Select Right Opstion");
				
		
			
	}
//..................................................................................................................................//
				 System.out.println(" \n9.   Which of the following is a reserved keyword in Java? : ");
					
					System.out.println("A. Object");
					System.out.println("B. Strictfp");
					System.out.println("C. System");
					System.out.println("D. Main");
					a=sc.next().charAt(0);
					
					switch(a) {
						
						case 'B':System.out.println("Your Answer is Correct ");
						score++;
						break;
					
					default: System.out.println("Sorry Wrong Answer");
					
					System.out.println("Sorry You Have To Select Wrong Option Plz Select Right Opstion");
					
			
}
//.....................................................................................................................................//
					
                  System.out.println(" \n10.   Which of the given methods are of Object class? : ");
					
					System.out.println("A. notify(), wait( long msecs ), and synchronized()");
					System.out.println("B. wait( long msecs ), interrupt(), and notifyAll()");
					System.out.println("C. notify(), notifyAll(), and wait()");
					System.out.println("D. sleep( long msecs ), wait(), and notify()");
					a=sc.next().charAt(0);
					
					switch(a) {
						
						case 'C':System.out.println("Your Answer is Correct ");
						score++;
						break;
					
					default: System.out.println("Sorry Wrong Answer");
					
					System.out.println("Sorry You Have To Select Wrong Option Plz Select Right Opstion");
					
					
       				
					}
					System.out.println("Your Score is:= " + score + " / 10");
					
				
			          try {
							Connection connection= ConnectionDemo.getConnection();
							
							PreparedStatement ps=connection.prepareStatement("insert into  ScoreDemo  (Score) values  ('"+score+"')" );
							
						  ps.executeUpdate();
							
							
							System.out.println("score insertion successfully: ");
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
							System.out.println("Thank you For Attending  the Quiz Qustion...");
                          
							System.exit(0);
							}
	
}

