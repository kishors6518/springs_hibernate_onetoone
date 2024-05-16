package springs_hibernate_onetoone.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Entity
@Component
@Data
public class SalaryAccount {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Value("Kotak")
	private String name;
	@Value("kotak@415")
	private String ifsc;
	

}
