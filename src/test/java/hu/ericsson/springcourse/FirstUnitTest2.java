package hu.ericsson.springcourse;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(locations = { "classpath:/spring-config/application-context2.xml" })
public class FirstUnitTest2 extends FirstUnitTest {

	@Value("${welcome.message}")
	private String property2;

	@Test
	public void testDI2() {

		Assert.assertEquals("Hello World", property2);
	}

}
