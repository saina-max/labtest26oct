package com.Enhanced;

import java.util.Scanner;

/*
Program: WAP to implement enhanced switch case
@author: Saina Khan
@Date: 26 Oct 2022  
*/

//import packages package com. Enhanced;

public class EnhancedSwitch {
	
	//method to print full form of abbreviation
		static void printTagline(String Tagline)
		{
			 switch(Tagline)
		   {
			   //expression level
			   case "accenture" ->System.out.println("Explore beyond limits");		               
	           case "acer" ->System.out.println("we hear you");		              		
	           case "apple"-> System.out.println("think different");		               	
	           default-> System.out.println("Wrong input");						
		   } 
			
		}	
			
			
		//main started
		public static void main(String args[])
		{
	       // switch case with string
		   String inputTagline;
		   
		    //declaring the object of scanner
			Scanner sc = new Scanner(System.in);
			
			System.out.println("enter an company name(accenture,acer,apple):");
			inputTagline= sc.next().toLowerCase();// converting the input to lowercase
		   
		   //calling method
		  printTagline(inputTagline);
		  sc.close();
		     
		}
			
		// end of main
		
	}
	// end of class 

