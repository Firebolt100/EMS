package com.flp.ems.service;

import java.util.HashMap;
import java.util.List;

import com.flp.ems.domain.Employee;

public interface IEmployeeService {

	public void AddEmployee(HashMap<String , String > h);
	public void ModifyEmployee(HashMap<String , String > h);
	public void RemoveEmployee(HashMap<String , String > h);
	public void SearchEmployee(HashMap<String , String > h);
	public HashMap<String,String>[] getAllEmployee();
}
