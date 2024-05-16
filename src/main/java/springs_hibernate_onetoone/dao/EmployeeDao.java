package springs_hibernate_onetoone.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import springs_hibernate_onetoone.dto.Employee;


@Component
public class EmployeeDao {
	
	@Autowired
	private EntityManager manager;
	
	public void saveEmployee(Employee employee)
	{
		EntityTransaction transaction=manager.getTransaction();
		
		transaction.begin();
		//manager.persist(person.getACard());
		manager.persist(employee);
		transaction.commit();
	}
	public void getPerson(int id)
	{
		Employee employee=manager.find(Employee.class, id);
		if(employee!=null)
		{
			System.out.println(employee);
		}
		else
		{
			System.out.println("Employee not found!!!");
			
		}
		
	}
	public void deleteEmployee(int id)
	{
		Employee employee=manager.find(Employee.class, id);
		if(employee!=null)
		{
			EntityTransaction transaction=manager.getTransaction();
			
			transaction.begin();
		    manager.remove(employee);
			transaction.commit();
		}
		else
		{
			System.out.println("Employee not found!!!");
		}
	}
	public void updateBoth(int id, Employee employee)
	{
		Employee employee2=manager.find(Employee.class, id);
		if(employee2!=null)
		{
			EntityTransaction transaction=manager.getTransaction();
			employee.setId(id);
			employee.getSc().setId(employee2.getSc().getId());
			
			
			transaction.begin();
			//manager.merge(person.getACard());
			manager.merge(employee);
			transaction.commit();
			
		}
		else
		{
			System.out.println("Employee not found");
		}
		
	}

}
