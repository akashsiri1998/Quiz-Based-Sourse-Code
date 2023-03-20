package com.velocity.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class AdminDb{
	
	
	public static void getInsertInformation() {
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter The Qustion: ");
		String  Question=sc1.nextLine();
		
		
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter 1st Option");
		String option1=sc2.nextLine(); 
		
		Scanner sc3=new Scanner(System.in);
        System.out.println("Enter 2nd Option");
        String option2=sc3.nextLine();
		
		Scanner sc4=new Scanner(System.in);
		System.out.println("Enter 3rd  Option");
		String option3=sc4.nextLine();
		
		Scanner sc5=new Scanner(System.in);
		System.out.println("Enter 4th  Option");
		 String option4=sc5.nextLine(); 
		 
		
		Scanner sc6=new Scanner(System.in);
		System.out.println("Enter Correct Answer: ");
		  String QuestionAns=sc6.nextLine(); 
		
         System.out.println("Qustion is:= " +Question);
         System.out.println("1 Option is:= " +option1);
         System.out.println("2 Option is:=  " +option2);
         System.out.println("3 option is:= " +option3);
         System.out.println("4 option is:= " +option4);
         System.out.println(" Final Answer is:= " +QuestionAns);
         
		getInsertQustion(Question,option1,option2,option3,option4,QuestionAns);
	}


public static void getInsertQustion(String Question,String option1,String option2,String option3,String option4,String QuestionAns )  {
	
	
	try {
		Connection connection = ConnectionDemo.getConnection();
		
		PreparedStatement ps=connection.prepareStatement("INSERT INTO Question_Exam(Question,option1,option2,option3,option4,QuestionAns)VALUES(?,?,?,?,?,?)");
	

		   ps.setString(1, Question);
		   ps.setString(2, option1);
		   ps.setString(3, option2);
		   ps.setString(4, option3);
		   ps.setString(5, option4);
		   ps.setString(6, QuestionAns);
		   boolean re = ps.execute();
		   if(!re) {
				 
			   System.out.println("Qustion And Anser Insert SuccessFully: ");
		
			   
		   }else {
				 
			   System.out.println("Qustion And Anser Insert Fail: ");
		
		   }
		
	
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	

     
	

}
	public static void getAdminDb(int id) {
		
		System.out.println(" Welcome To Admin Section  :");
		Scanner sc=new Scanner(System.in);
		
		
		try {
			Connection connection = ConnectionDemo.getConnection();
			
			PreparedStatement ps=connection.prepareStatement("select * from UserDemo where id=?");
			ps.setInt(1, id );
			ResultSet rs=ps.executeQuery();
			
			
			
			
			
			while(rs.next()) {
				System.out.println("Student ID "+rs.getInt(1));
				System.out.println(" Student First NAme := "+rs.getString(2));
				System.out.println(" Student Last NAme := "+rs.getString(3));
				System.out.println(" Student userNAme := "+rs.getString(4));
				System.out.println(" Student password := "+rs.getString(5));
				System.out.println(" Student Mobile Number := "+rs.getString(6));
				System.out.println(" Student EmailAddress := "+rs.getString(7));
				
			}
			
			System.out.println(" fetching Successfull: ");
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		 
			System.out.println("If Stop Then Press '1' : ");
			int s=sc.nextInt();
			if(s==1) {
			         	
				   System.out.println("Thankyou So Much See u Soon....");
				   System.exit(s);
			}
			
	}
	public  void getScore(int ScoreId) {
		try {
			Connection connection = ConnectionDemo.getConnection();
			
PreparedStatement ps1=connection.prepareStatement("select * from ScoreDemo where ScoreId=?");
			
			ps1.setInt(1 , ScoreId);
			ResultSet r=ps1.executeQuery();
			 System.out.println("Score is := "+r.getInt(1));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}

