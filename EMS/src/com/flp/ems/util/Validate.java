package com.flp.ems.util;

public class Validate {

	//boolean flag ;
	
	public static boolean validateName(String name){
		
		if(name.length()==0 || name.contains("[0-9]")||name.contains("~!@#$%^&*()?|") )
			return false;
		else
			return true;
	}
	
	public static boolean validatePhoneNo(String phoneNo){
		
		if(phoneNo.length() != 10 || phoneNo.contains("[A-Za-z]"))
			return false;
		else 
			return true;
	}
	
	public static boolean validateDob(String dob){
		
		if(dob.length()!=0)
			return true;
		else
			return false;
	}
	
	public static boolean validateDoj(String doj){
		
		if(doj.length()!=0)
			return true;
		else
			return false;
	}
	
	public static boolean validateAddress(String address){
		
		if(address.length()!=0)
			return true;
		else
			return false;
	}
	public static boolean validateDeptId(String deptId){
		
		if(deptId.length()!=0)
			return true;
		else
			return false;
	}
	public static boolean validateProjectId(String projectId){
		
		if(projectId.length()!=0)
			return true;
		else
			return false;
	}
	public static boolean validateRoleId(String roleId){
		
		if(roleId.length()!=0)
			return true;
		else
			return false;
	}
	
	
	
}
