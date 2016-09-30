package com.flp.ems.dao;

import java.util.List;

import com.flp.ems.domain.Employee;

public interface IemployeeDao {

	public void AddEmployee(Employee employee);
	public void ModifyEmployee(Employee employee);
	public void RemoveEmployee(Employee employee);
	public void SearchEmployee(Employee employee);
	public List<Employee> getAllEmployee();
}
