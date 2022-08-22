package com.cg.eis.service;

import java.util.List;

import com.cg.eis.bean.Employee;

public interface EmployeeService {
	
	public void addEmployee(Employee emp);
	public List getByInscheme(String insuranceScheme);
	public boolean deleteEmp(int id);
	public Employee updateEmployee(int id, Employee emp );
	public String viewInsuranceScheme(int id);
	public Employee updateSalary(int id, int salary);
	public Employee updateEmpName(int id, String name);
	public Employee getDetails(int id);

}
