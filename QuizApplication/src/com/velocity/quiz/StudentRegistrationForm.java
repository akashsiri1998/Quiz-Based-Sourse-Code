package com.velocity.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentRegistrationForm {
    
	public StudentRegistrationForm(String firstName, String lastName, String userName, String userPassword, String City,int mobileNumber,String email) {
		
	}
	
	public static  void InserRecordInformation() {
		System.out.println("Welcom To Student Section");
		
		Scanner sc=new Scanner(System.in);
			
		System.out.println("\n1. Student Registration ");
		System.out.println("\n2. Student Login ");
		System.out.println("\n3. Exit Application");
		int c=sc.nextInt();
		
		if(c==1) {
         
			//Student registration Form:
			
	    
	    System.out.println("Enter Your FirstName");
	    String firstName=sc.next();
	    
	    System.out.println("Enter Your lastName");
	    String lastName=sc.next();
	    
	    System.out.println("Enter Your userName");
	    String userName=sc.next();
	    
	    System.out.println("Enter Your userPassword");
	    String userPassword=sc.next();
	    
	    System.out.println("Enter Your City");
	    String City=sc.next();
	    
	    System.out.println("Enter Your Mobile Number");
	    int mobileNumber=sc.nextInt();
	    
	    System.out.println("Enter Your Email Address");
	    String email=sc.next();
	     
	  getInsertRecord(firstName,lastName,userName,userPassword,City,mobileNumber,email);   
		
	  
	    
	    
	    
		}
		 if(c==2) {
			try {
				Connection connection = ConnectionDemo.getConnection();
				
				Statement st=connection.createStatement();
				System.out.println(" : You can Give the Exam only if You have an Student Account otherwise You have to create an Account :  ");
				
				
				System.out.println("  \n1:   If You Have Alredy Create Account Then press ' 1 ' OtherWise press ' 2 ' going to Fill Student REgistration Form:  ");
				
				int d=sc.nextInt();
				
				if(d==1) {
					System.out.println("  Login Page...  ");
					
					
					for(int i=1;i<=3;i++) {
						
				System.out.println(" Enter Student Username: ");
				String username=sc.next();
				
				System.out.println(" Enter Student Password: ");
			    String password=sc.next();
			    
			    String s1="SELECT * FROM UserDemo WHERE username='"+username+"' && userPassword ='"+password+"'";
			    ResultSet rs=st.executeQuery(s1);
               
			   
			   if(rs.next()) {
				   
						System.out.println("Logging In...");
					
		 
					          	System.out.println("  ' Best Of Luck '  Your Exam Is Started: ");
							
							QuizQustion.getQustion();
						
						}
				     
				    else 
			         	{
			   	      System.out.println("Please Enter Valid Username And Password");
			   	      	}
			   }
					
			   
			   }
				System.out.println("Fill the Registration Form: ");
				if(d==2) {
					InserRecordInformation();
				}
		          
			
			}
			catch (SQLException e) {
				
				e.printStackTrace();
			
		}
			
		}
		 
		 System.out.println(" If You Have to breake then press  '3'  : ");
			int d1=sc.nextInt();
			     if(d1==3) {
				      System.out.println("Thanku Guys ..... See u Again");
				      
				      System.exit(0);

			     }
			    
	}

	public static void getInsertRecord(String firstName,String lastName,String userName,String userPassword,String City,int mobileNumber,String userEmail)
	{
		
		System.out.println("User first name : "+firstName);
		System.out.println("User Last name : "+lastName);
		System.out.println("Username : "+userName);
		System.out.println("User password : "+userPassword);
		System.out.println("User City name : "+City);
		System.out.println("User Mobile Number : "+mobileNumber);
		System.out.println("User Email Address : "+userEmail);
		
		
		try {
			Connection connection=ConnectionDemo.getConnection();
			
			
			PreparedStatement ps= connection.prepareStatement("insert into UserDemo(firstName,lastName,userName,userPassword,City,mobileNumber,userEmail)values(?,?,?,?,?,?,?)");
	        
			   ps.setString(1, firstName);
			   ps.setString(2, lastName);
			   ps.setString(3, userName);
			   ps.setString(4, userPassword);
			   ps.setString(5, City);
			   ps.setInt(6,mobileNumber);
			   ps.setString(7, userEmail);
			   
			   ps.execute();
			   
			   System.out.println("Record Insertion SuccessFully: ");
           		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
	}


	   
	    

	}

	
