package com.dal.hibproj;


import java.util.Scanner;

import com.dal.controller.*;

public class app {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeController ec = new EmployeeController();
		String c = null;
		do {
			System.out.println("Enter your Choice :");
			System.out.println("1. Add Employee");
			System.out.println("2. View Employee");
			System.out.println("3. Update Employee");
			System.out.println("4. Search Employee By ID");
			System.out.println("5. Search Employee Using Criteria Query");
			System.out.println("6. Search Employee By Department");
			
			int choice = sc.nextInt();

			switch (choice) {
			case 1: {
				ec.addEmployee();
				break;
			}
			case 2: {
				ec.viewEmployee();
				break;
			}
			case 3: {
				ec.updateEmployee();
				break;
			}
			case 4: {
				ec.searchEmpById();
				break;
			}

			case 5: {
				ec.searchUsingCriteriaQuery();
				break;
			}
			case 6: {
				ec.searchEmpByDNO();
				break;
			}

			default: {
				System.out.println("Choose the right choice !!!");
			}
			}
			System.out.println("Do you want to continue? Y or y");
			c = sc.next();
		} while (c.equals("y") || c.equals("Y"));
		System.out.println("Exited from application.");
		System.exit(0);



	}

}
