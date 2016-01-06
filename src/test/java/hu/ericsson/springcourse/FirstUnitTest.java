package hu.ericsson.springcourse;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import hu.ericsson.springcourse.model.Customer;
import hu.ericsson.springcourse.model.GenderType;
import hu.ericsson.springcourse.service.CustomerService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/spring-config/application-context.xml" })
public class FirstUnitTest {

	@Autowired
	protected CustomerService service;

	@Test
	public void testDI() {

		Assert.assertNotNull(service);
	
		Customer customer = new Customer();
		
		customer.setActive(Boolean.TRUE);
		customer.setFirstName("firstName");
		customer.setLastName("last");
		customer.setIdentityCardNumber("111111");
		customer.setNameOfMother("sdsdsdsd");
		customer.setBirthDate(new Date());
		customer.setGender(GenderType.MALE);

		Long id = service.createCustomer(customer);
	
		
		Assert.assertNotNull(id);
	}
	
	

}
