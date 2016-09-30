package com.flp.ems.view;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import com.flp.ems.domain.Employee;
import com.flp.ems.service.EmployeeServiceImpl;
import com.flp.ems.util.Validate;

public class UserInteraction {
	static int id;
	EmployeeServiceImpl empService = new EmployeeServiceImpl();
	Scanner input = new Scanner(System.in);
	
	public void AddEmployee(){
		
		boolean[] f = new boolean[8];
		for(boolean temp : f)
		{ temp = false; }
		
		String name = null,phoneNo = null,address= null,dob,doj,deptId= null,projectId= null,roleId = null, kinId = null, emailId= null;
		
		HashMap <String , String > employeedetails = new HashMap <String , String >();
		
		id++;
		
		System.out.println("Enter Employee Details .....");
		System.out.println("Name :");
		while(f[0]== false){
			name = input.nextLine();
			f[0] = Validate.validateName(name);
			if(f[0] == false)
				System.out.println("Invalid  . Enter valid Name ");
		}
		
		System.out.println("Phone Number :");
		
		while(f[1] == false){
			phoneNo = input.next();
			f[1] = Validate.validatePhoneNo(phoneNo);
			if(f[1] == false)
				System.out.println("Invalid  . Enter valid Phone Number ");
		}
	
		System.out.println("Address :");
		String garb = input.nextLine(); // so dat address doesn't giv invalid d first time it runs
=		while(f[2] == false){
			address = input.nextLine();
			f[2] = Validate.validateAddress(address);
			if(f[2] == false)
				System.out.println("Invalid  . Enter valid Address ");
		}
		System.out.println("Date of Birth (dd/mm/yyyy) :");
		dob = input.next();
		System.out.println("Date of joining (dd/mm/yyyy) :");
		doj = input.next();
		
		System.out.println("Enter Department Code Number :");
		System.out.println("1. Aviator");
		System.out.println("2. Velocity");
		System.out.println("3. Discover");
		
		while(f[5] == false){
			deptId = input.next();
			f[5] = Validate.validateDeptId(deptId);
			if(f[5] == false)
				System.out.println("Invalid  . Enter Department ID number code ");
		}
		
		
		System.out.println("Enter Project Code Number :");
		System.out.println("1. Tokyo");
		System.out.println("2. Sydney");
		System.out.println("3. California");
		
		while(f[6] == false){
			projectId = input.next();
			f[6] = Validate.validateProjectId(projectId);
			if(f[6] == false)
				System.out.println("Invalid  . Enter Project ID number code ");
		}
		
		System.out.println("Enter Role  Code Number :");
		System.out.println("1. Developer");
		System.out.println("2. Tester");
		
		while(f[7] == false){
			roleId = input.next();
			f[7] = Validate.validateRoleId(roleId);
			if(f[7] == false)
				System.out.println("Invalid  . Enter Role ID number code ");
		}
		
		kinId = ""+ id + "_fs";
		emailId= kinId+"@barclays.com";
		
		employeedetails.put("name", name);
		employeedetails.put("phoneNo", phoneNo);
		employeedetails.put("address", address);
		employeedetails.put("dob", dob);
		employeedetails.put("doj", doj);
		employeedetails.put("deptId", deptId);
		employeedetails.put("projectId", projectId);
		employeedetails.put("roleId", roleId);
		employeedetails.put("kinId", kinId);
		employeedetails.put("emailId", emailId);
				
		//input.close();
		
		empService.AddEmployee(employeedetails);
		
		
		
		
	}
	public void ModifyEmployee(){
		
		
		
	}
	public void RemoveEmployee(){
		
	}
	public void SearchEmployee(){
		
		boolean[] f=new boolean[3];
		for(boolean temp : f)
		{ temp = false; }
		
		System.out.println("Search by    ( leave blank if you don't want to search by a field ) ");
		
		System.out.println("KinID ");
		String kinId=input.next();
		f[0]=Validate.validateNonEmpty(kinId);
		if(f[0] == false)
			
		
		System.out.println("Name ");
		String name=input.next();
		f[0]=Validate.validateNonEmpty(kinId);
		
		System.out.println("EmailID");
		String emailId=input.next();
		f[0]=Validate.validateNonEmpty(kinId);
		
	}
	public void getAllEmployee(){
		
		HashMap<String , String >[] h = empService.getAllEmployee();
		System.out.println(h.toString());
		System.out.println("No of Employees  : "+ h.length+"\n");
		System.out.println("KinID   Name  emailID     PhoneNo  DeptID   ProjectID  RoleID \n\n");
		
		for (HashMap<String, String> hashMap : h) {
			//System.out.println("in loop");
			System.out.println(hashMap.get("kinId")+" "+hashMap.get("name")+" "+hashMap.get("emailId")+" "+hashMap.get("phoneNo")+" "+hashMap.get("deptId")+" "+hashMap.get("projectId")+" "+hashMap.get("roleId"));
		}	
					
	}
}

