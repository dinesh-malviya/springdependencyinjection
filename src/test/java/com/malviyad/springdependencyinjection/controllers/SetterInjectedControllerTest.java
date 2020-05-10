package com.malviyad.springdependencyinjection.controllers;

import org.junit.Before;
import org.junit.Test;

import com.malviyad.springdependencyinjection.services.GreetingServiceImpl;

public class SetterInjectedControllerTest {
	SetterInjectedController controller;

	@Before
	public void setUp() {
		controller = new SetterInjectedController();
		controller.setGreetingService(new GreetingServiceImpl());
	}

	@Test
	public void testGetGreeting() {
		System.out.println(controller.getGreeting());
	}

}
