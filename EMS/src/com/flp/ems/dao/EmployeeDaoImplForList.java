package com.flp.ems.dao;

import java.util.ArrayList;
import java.util.List;

import com.flp.ems.domain.Employee;

public class EmployeeDaoImplForList implements IemployeeDao {
	
	static List<Employee> list = new ArrayList<Employee>();

	public void AddEmployee(Employee employee){
		
		list.add(employee);
		for(Employee temp : list)
			System.out.println(temp);
	}
	public void ModifyEmployee(Employee employee){
		
	}
	public void RemoveEmployee(Employee employee){
		
	}
	public void SearchEmployee(Employee employee){
		
	}
	public List<Employee> getAllEmployee(){
		System.out.println("in dao");
		for(Employee temp : this.list){
			System.out.println(temp);	
			
		}
		System.out.println("out of dao");
		return list;
	}
}