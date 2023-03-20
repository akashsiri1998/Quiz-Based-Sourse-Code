package com.velocity.quiz;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Admin 
{
      static boolean loginFlag = false;
	
	  public static void main(String [] args) 
	  {
		  System.out.println(" Welcome to  Quiz Application  ");
			Scanner sc=new Scanner(System.in);
	   while(true)
		{
	
			System.out.println("\n1. Clicked 1 for  ' ADMIN  MENU' ");
			
			System.out.println("\n2. Clicked 2 for 'STUDENT MENU' ");
			
			System.out.println("\n3.  Clicked 3 for 'Exit MENU' ");
			int c=sc.nextInt();
		try {
			 if(c==1){
				Connection connection=ConnectionDemo.getConnection();
				Statement st=connection.createStatement();
				System.out.println(" :  WELCOME To ADMIN SECTION  : ");
				 for(int i=1;i<=3;i++) 
				  {
					System.out.println(" Enter ADMIN USERNAME: ");
					String username=sc.next();
					
					System.out.println("Enter ADMIN  PASSWORD: ");
					String password=sc.next();
					String s="SELECT * FROM AdminLogin WHERE username='"+username+"' && userpassword ='"+password+"'";	
	                ResultSet rs=st.executeQuery(s);
		           if(rs.next()){
		        	  //Student Log in page;
						System.out.println("Logging In...");
						loginFlag = true;
						//Fetching Id 
						    
						break;
						
					}else if(i == 3){
		        	  System.out.println(" :Try After Some Time: ");     
		        	  
		        	  System.exit(i);
					 }else {
		        	  System.out.println("Please Enter Valid Username And Password");
		            }
					
				 }
				      
				 
			 }
			 
			 if(c==2) { 
				 System.out.println("If You Have to Going Exam Qustion Then press 2 := ");
				StudentRegistrationForm.InserRecordInformation();
			 
			}
			 
			 if(c==3) {
			    	 System.out.println("If You Have To Not Continue Then Press '3' :  " );
			            
			          System.out.println("   ThankYou Best Of Luck...." );
			          
			       // break;
		
				System.exit(c);
			 }
				 
				 System.out.println("if You Have To Add Any NEw Qustion Then press '5'  ");
				 System.out.println("If You have Direct Fetch Data Then press '6'  : ");
				 int c1=sc.nextInt();
				 if(c1==5) {
					 AdminDb.getInsertInformation();
					 
				 }
					
				
			  if(c1==6) {
				 
				 AdminDb.getAdminDb(c);
					 
				 }
		
			 
				if(loginFlag) {
					 System.out.println(" Enter the Id Whose Details You Want  :=  ");
					 int id=sc.nextInt();
					 AdminDb.getAdminDb(id);
				}
		    
			
				// if press 3 then going to Exit Page:
			 
	 
			    
					// System.out.println("If You Have to Going Exam Question Then press 2 := ");
			 
		}
		
		
	
					    catch (SQLException e)
				       {
					         e.printStackTrace();
				       }
		
		    }
				
}
	  
}

	  
	  
		   
