package springs_hibernate_onetoone.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Entity
@Component
@Data
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Value("Nilesh")
	private String name;
	@Value("9874588566")
	private long phone;
	@Value("Lamjana")
	private String address;
	
	@OneToOne(cascade = CascadeType.ALL)
	@Autowired
	SalaryAccount sc;

}
