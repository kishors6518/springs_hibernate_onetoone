package springs_hibernate_onetoone.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"springs_hibernate_onetoone.dao","springs_hibernate_onetoone.dto"})
public class OTOConfig {
	
	@Bean
	public EntityManager getManager() {
		return Persistence.createEntityManagerFactory("kishor").createEntityManager();
		
	}
}
