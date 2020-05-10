package com.malviyad.springdependencyinjection.controllers;

import org.junit.Before;
import org.junit.Test;

import com.malviyad.springdependencyinjection.services.GreetingServiceImpl;

public class PropertyInjectedControllerTest {
	PropertyInjectedController controller;

	@Before
	public void setUp() {
		controller = new PropertyInjectedController();
		controller.greetingService = new GreetingServiceImpl();
	}

	@Test
	public void getGreeting() {
		System.out.println(controller.getGreeting());
	}
}
