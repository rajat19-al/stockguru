package com.employeeapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeeapp.model.Employee;
import com.employeeapp.repository.EmployeeRepository;

@Service

public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	public String addEmployee(Employee employee) {
		   try {
	             employeeRepository.save(employee);
	            return  "success";
	        } catch (Exception e){
	            e.printStackTrace();
	            return "fail";
	        }
	    }

	
	public String updateEmployee(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public String deleteEmployee(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Optional<Employee> findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Optional<List<Employee>> getEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	public Optional<List<Employee>> findByOrganizationId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
