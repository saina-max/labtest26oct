
/*
	Program: WAP to implement enhanced switch case
	@author: Saina Khan
	@Date: 26 Oct 2022  
	*/
package com.EmployeeDetails;

public class EmployeeDetails {
	
		// instance variables
			int eid;
			String name;
			String department;
			int salary;
			private int s;

			// method to get the details
			public void getDetails(int id, String n,String d,int salary) {
				eid = id;
				name = n;
				department = d ;
				salary = s;
			}

			// method for printing details
			public void printDetails() {
				System.out.println("Employee Details are:");
				System.out.println("Employee ID:" + eid);
				System.out.println("Employee Name:" + name);
				System.out.println("Department Name:" +department);
				System.out.println("Employee salary:"+s);

			}

		}
		//end of class


