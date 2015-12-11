package hu.ericsson.springcourse;

import javax.sql.DataSource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import hu.ericsson.springcourse.model.Customer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/spring-config/application-context.xml" })
public class FirstUnitTest {

	@Value("${welcome.message}")
	private String property;

	@Autowired
	private DataSource ds;
	
	
	@Autowired
	private Customer cus;
	
	@Autowired
	private Environment env;

	@Test
	public void testDI() {

		Assert.assertNotNull(ds);
		Assert.assertNotNull(cus);
		Assert.assertEquals("Hello World", property);
	}

}
