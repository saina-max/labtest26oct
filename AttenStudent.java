/*
Program: WAP to implement enhanced switch case
@author: Saina Khan
@Date: 26 Oct 2022  
*/
package com.AttenStudent;

import java.util.Scanner;

public class AttenStudent {
	
	public static void main(String args[]){
        try (Scanner in = new Scanner(System.in)) {
			int ch, ca;
			char m;
			float p;
    //   p.setPrecision(4);
			String rs;
			System.out.print("Enter Number of Classes Held: ");
			ch = in.nextInt();
			System.out.print("Enter Number of Classes Attended: ");
			ca = in.nextInt();
			p = (((float)ca / (float)ch)*100);

			if(p >= 75)
			{
			    rs = "You are allow to sit in exam";
			}
			else 
			{
			    rs = "Not allowed to attend the exam";
			    
			}
			System.out.println("Attendence: "+p+"\nResult: "+rs);
		}
	}
}
    



