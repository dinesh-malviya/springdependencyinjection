package com.malviyad.springdependencyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.malviyad.springdependencyinjection.controllers.TestController;

@SpringBootApplication
public class SpringdependencyinjectionApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringdependencyinjectionApplication.class, args);
		TestController testController = (TestController) context.getBean("testController");
		String message = testController.testHello();
		System.out.println(message);
	}

}
