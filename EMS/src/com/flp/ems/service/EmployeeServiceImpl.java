package com.flp.ems.service;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import com.flp.ems.dao.EmployeeDaoImplForList;
import com.flp.ems.domain.Employee;

public class EmployeeServiceImpl implements IEmployeeService{
	
	EmployeeDaoImplForList empdao = new EmployeeDaoImplForList();
	
	//Add Employee
	public void AddEmployee(HashMap<String , String > h){
		
		Employee employee = new Employee();
		
		//to convert the DATE from string to Date format
		DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
		Date d1=null,d2=null ;
		try {
			 d1= df.parse(h.get("dob"));
		} catch (ParseException e) {
	    
			e.printStackTrace();
		}
		try {
			 d2= df.parse(h.get("doj"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int deptId= Integer.parseInt(h.get("deptId"));
		int projectId= Integer.parseInt(h.get("projectId"));
		int roleId= Integer.parseInt(h.get("roleId"));
		
		employee.setName(h.get("name"));
		employee.setPhoneNo(h.get("phoneNo"));
		employee.setAddress(h.get("address"));
		employee.setDob(d1);
		employee.setDoj(d2);
		employee.setDeptId(deptId);
		employee.setProjectId(projectId);
		employee.setRoleId(roleId);
		employee.setKinId(h.get("kinId"));
		employee.setEmailId(h.get("emailId"));
		
		empdao.AddEmployee(employee);
		
	}
	
	public void ModifyEmployee(HashMap<String , String > h){
		
	}
	public void RemoveEmployee(HashMap<String , String > h){
		
	}
	public void SearchEmployee(HashMap<String , String > h){
		
	}
	
	public HashMap<String,String>[] getAllEmployee(){
		List<Employee> l = empdao.getAllEmployee();
		
		HashMap<String , String> row[] = new HashMap[l.size()];
		
		int i=0;

		System.out.println("in service");
		while(i<l.size()){
			System.out.println("Putting to hashmap");
			String di="" +l.get(i).getDeptId();
			String pi ="" +l.get(i).getProjectId();
			String ri =	"" +	l.get(i).getRoleId();
			
			row[i]=new HashMap<String , String>();
			row[i].put("kinId",l.get(i).getKinId());
			row[i].put("name",l.get(i).getName());
			row[i].put("emailId",l.get(i).getEmailId());
			row[i].put("phoneNo",l.get(i).getPhoneNo());
			row[i].put("deptId",di);
			row[i].put("projectId",pi);
			row[i].put("roleId", ri);
			
			i++;
					
		}
		
		
		return row;
	}

}
