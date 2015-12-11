package hu.ericsson.springcourse.app;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	
	@SuppressWarnings("resource")
	public static void main(String[]args){
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config/application-context.xml");
		System.out.println("Spring container started at : "+new Date(ctx.getStartupDate()));
		
		((ConfigurableApplicationContext) ctx).registerShutdownHook();
	}
}
