package hu.ericsson.springcourse.app;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import hu.ericsson.springcourse.model.Customer;
import hu.ericsson.springcourse.model.GenderType;
import hu.ericsson.springcourse.service.CustomerService;

public class Application
{

  @SuppressWarnings("resource")
	public static void main(String[]args){
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config/application-context.xml");
		System.out.println("Spring container started at : "+new Date(ctx.getStartupDate()));
		
		
		CustomerService service = ctx.getBean(CustomerService.class);
		
		Customer customer = new Customer();
    
    customer.setActive(Boolean.TRUE);
    customer.setFirstName("firstName");
    customer.setLastName("last");
    customer.setIdentityCardNumber("111111");
    customer.setNameOfMother("sdsdsdsd");
    customer.setBirthDate(new Date());
    customer.setGender(GenderType.MALE);
    
		service.createCustomer(customer);
		
		((ConfigurableApplicationContext) ctx).registerShutdownHook();
	}
}
