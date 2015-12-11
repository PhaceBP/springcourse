package hu.ericsson.springcourse.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import hu.ericsson.springcourse.model.Customer;

//@Configuration
//@PropertySource(value="classpath:/application.properties", ignoreResourceNotFound = true)
public class AppConfig {

	
	
	@Bean
	public Customer getCustomer(){
		
		Customer c = new Customer();
		c.setFirstName("Attila");
		c.setLastName("Balogh-Biro");
		return c;
	}
}
