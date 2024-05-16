package springs_hibernate_onetoone.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springs_hibernate_onetoone.dao.EmployeeDao;
import springs_hibernate_onetoone.dao.OTOConfig;
import springs_hibernate_onetoone.dto.Employee;
import springs_hibernate_onetoone.dto.SalaryAccount;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(OTOConfig.class);
		SalaryAccount sc=context.getBean("salaryAccount",SalaryAccount.class);
		Employee employee=context.getBean("employee",Employee.class);
		EmployeeDao dao=context.getBean("employeeDao",EmployeeDao.class);
		//dao.saveEmployee(employee);
		//dao.getPerson(3);
		//dao.updateBoth(7, employee);
		dao.deleteEmployee(9);
		
		

	}

}
