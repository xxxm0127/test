package com.kh.kht.domain;

import javax.persistence.Entity;

@Entity
public class Employee {
	String emp_id;
	String emp_name;
	String emp_email;
	String emp_tel;
		
	public String getEmp_id() {
		return emp_id;
	}
		
	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}
		
	public String getEmp_name() {
		return emp_name;
	}
		
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
		
	public String getEmp_email() {
		return emp_email;
	}
		
	public void setEmp_email(String emp_email) {
		this.emp_email = emp_email;
	}
		
	public String getEmp_tel() {
		return emp_tel;
	}
		
	public void setEmp_tel(String emp_tel) {
		this.emp_tel = emp_tel;
	}
}
