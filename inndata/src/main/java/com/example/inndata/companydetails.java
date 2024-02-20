package com.example.inndata;

import java.util.List;

public class companydetails {
	int id;
	String name;
	String Companydetails;
//	Employee employee;
    List<Employee> employees;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompanydetails() {
		return Companydetails;
	}
	public void setCompanydetails(String companydetails) {
		Companydetails = companydetails;
	}
	@Override
	public String toString() {
		return "companydetails [id=" + id + ", name=" + name + ", Companydetails=" + Companydetails + "]";
	}
//	public companydetails(Employee employee) {
//		super();
//		this.employee = employee;
//	}
//	 public void setEmployee(Employee employee) {
//	        this.employee = employee;
//	    }
	public companydetails() {
		super();
	}
	   public List<Employee> getEmployees() {
	        return employees;
	    }

	    public void setEmployees(List<Employee> employees) {
	        this.employees = employees;
	    }
		
}
