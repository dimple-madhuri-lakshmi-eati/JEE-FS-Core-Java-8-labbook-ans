package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.exception.EmployeeException;
import com.cg.eis.service.EmployeeService;
import com.cg.eis.service.EmployeeServiceImpl;

public class Application {

static int selectedOption;
	
	public static void main(String[] args) throws EmployeeException{
		
		Scanner sc = new Scanner(System.in);
		EmployeeService empService = new EmployeeServiceImpl();

		
		 
		do {
			System.out.println("1. Add Employee");
			System.out.println("2. Update Employee");
			System.out.println("3. Delete Employee");
			System.out.println("4. View Scheme Details");
			System.out.println("5. View employee Details");
			System.out.println("Enter 0 to exit");

			System.out.println("Choose any one option : ");
			selectedOption = sc.nextInt();
			
			switch (selectedOption) {
			case 1:
				System.out.println("Enter emp id");
				int id = sc.nextInt();
				System.out.println("Enter emp name");
				String name = sc.next();
				System.out.println("Enter emp salary");
				int salary = sc.nextInt();
				if(salary<3000) {
					throw new EmployeeException("enter salary above 3000");
				}
				System.out.println("Enter emp Designation");
				String designation = sc.next();

				String insuranceScheme = null;
				if ((salary > 5000 && salary < 20000) && designation.equalsIgnoreCase("SystemAssociate")) {
					insuranceScheme = "Scheme C";
				}
				else if ((salary >=20000 && salary < 40000) && designation.equalsIgnoreCase("programmer")) {
					insuranceScheme = "Scheme B";
				}
				else if ((salary>=40000) && designation.equalsIgnoreCase("Manager")) {
					insuranceScheme = "Scheme A";
				}
				else if ((salary < 5000) && designation.equalsIgnoreCase("clerk")) {
					insuranceScheme = "No Scheme";
				}
				
				Employee emp = new Employee(id, name, designation,salary,insuranceScheme);
				empService.addEmployee(emp);
				break;
			case 2:
				System.out.println("Selected option : "+ selectedOption);
				System.out.println("Enter emp id");
				int empid = sc.nextInt();
				System.out.println("Enter emp name");
				String name1 = sc.next();
				System.out.println("Enter emp salary");
				int salary1 = sc.nextInt();
				System.out.println("Enter emp Designation");
				String designation1 = sc.next();
				String insuranceSche = null;
				if ((salary1 > 5000 && salary1 < 20000) && designation1.equalsIgnoreCase("SystemAssociate")) {
					insuranceSche = "Scheme C";
				}
				else if ((salary1 >=20000 && salary1 < 40000) && designation1.equalsIgnoreCase("programmer")) {
					insuranceSche = "Scheme B";
				}
				else if ((salary1>=40000) && designation1.equalsIgnoreCase("Manager")) {
					insuranceSche = "Scheme A";
				}
				else if ((salary1 < 5000) && designation1.equalsIgnoreCase("clerk")) {
					insuranceSche = "No Scheme";
				}
				
				Employee emp1 = new Employee(empid, name1, designation1,salary1,insuranceSche);
				System.out.println(empService.updateEmployee(empid, emp1));
				break;
			case 3:
				System.out.println("Enter emp id");
				int id1=sc.nextInt();
				System.out.println(empService.deleteEmp(id1));
				break;
			case 4:
				// logic for view policy details
				// Get emp Id form the user
				// call service method to view policy
				// display policy info or failure info
				System.out.println("Enter emp id");
				int id2=sc.nextInt();
				System.out.println(empService.viewInsuranceScheme(id2));
				break;
			case 5:
				System.out.println("Enter emp id");
				int id3=sc.nextInt();
				System.out.println(empService.getDetails(id3));
			default:
				System.out.println("Choose any option between 1 to 4");
			}

		} while (selectedOption == 0);

	}

}
