package com.flp.ems.domain;

public class Project {

	private String name;
	private String description;
	private int projectId;
	private int deptId;
	
	
	//Name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//Description
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	//DeptId
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	
	//ProjectId
	public int getProjectId() {
			return projectId;
	}
	public void setProjectId(int projectId) {
			this.projectId = projectId;
	}
	
}
