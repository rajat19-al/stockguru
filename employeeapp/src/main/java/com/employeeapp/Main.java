package com.employeeapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.employeeapp.configuration.DBConfig;
import com.employeeapp.model.Employee;
import com.employeeapp.repository.EmployeeRepository;
import com.employeeapp.service.EmployeeService;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class);
		
//		EmployeeRepository repository = context.getBean(EmployeeRepository.class);
		EmployeeService service = context.getBean(EmployeeService.class);
		
		
		Employee employee = new Employee();
		employee.setId((long)0);
		employee.setAge(20);
		employee.setDepartmentId((long)1);
		employee.setName("Rajat");
		employee.setOrganizationId((long)(2));
		employee.setPosition("Manager");
		
//		repository.save(employee);
		service.addEmployee(employee);
		context.close();
		
	}

}
