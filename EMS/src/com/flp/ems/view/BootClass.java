package com.flp.ems.view;

import java.util.Scanner;

public class BootClass {
    
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		menuSelection();
		
		
	}
	
	
	public static void menuSelection(){
		
	
		//s.close();
		boolean flag=true;
		
		
		while (flag){
			
			System.out.println("          Menu");
			System.out.println("____________________________");
			System.out.println("1. Add Employee");
			System.out.println("2. Modify Employee");
			System.out.println("3. Remove Employee");
			System.out.println("4. Search Employee");
			System.out.println("5. View All Employees");
			System.out.println("6. Exit");
			System.out.println("\n");
			System.out.println("Enter job code ( 1 - 6 )   :");
			
			//String in =
			int jobcode =  s.nextInt();
			UserInteraction u = new UserInteraction();
			
				switch(jobcode){
				
					case 1:
							u.AddEmployee();
							//flag=false;
							break;
					
					case 2: u.ModifyEmployee();
							//flag=false;
							break;
					
					case 3: u.RemoveEmployee();
							//flag=false;
							break;
					
					case 4: u.SearchEmployee();
							//flag=false;
							break;
					
					case 5 : u.getAllEmployee();
							//flag=false;
							break;
					
					case 6 : return;	
						
					
					default: System.out.println("Enter Job Codes only between 1-5 ");
				}
		}
		
	}
	
}
