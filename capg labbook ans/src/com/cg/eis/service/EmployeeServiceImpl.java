package com.cg.eis.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.cg.eis.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService{
	
	HashMap<Integer,Employee> map=new HashMap<>();
	@Override
	public void addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		map.put(emp.getId(), emp);
		System.out.println(emp.toString());
		
	}

	@Override
	public List getByInscheme(String insuranceScheme) {
		// TODO Auto-generated method stub
		ArrayList<Employee> list=new ArrayList<>();
		for(int x:map.keySet()) {
			if(map.get(x).getInsuranceScheme().equals(insuranceScheme)) {
				list.add(map.get(x));
			}
		}
		return list;
	}

	@Override
	public boolean deleteEmp(int id) {
		// TODO Auto-generated method stub
		map.remove(id);
		return true;
	}

	@Override
	public Employee updateEmployee(int id, Employee newemp) {
		// TODO Auto-generated method stub
		map.put(id, newemp);
		return map.get(id);
	}

	@Override
	public String viewInsuranceScheme(int id) {
		// TODO Auto-generated method stub
		return map.get(id).getInsuranceScheme();
	}

	@Override
	public Employee updateSalary(int id, int salary) {
		// TODO Auto-generated method stub
		map.get(id).setSalary(salary);
		return map.get(id);
	}

	@Override
	public Employee updateEmpName(int id, String name) {
		// TODO Auto-generated method stub
		map.get(id).setName(name);
		return map.get(id);
	}

	@Override
	public Employee getDetails(int id) {
		// TODO Auto-generated method stub
		return map.get(id);
	}

}
