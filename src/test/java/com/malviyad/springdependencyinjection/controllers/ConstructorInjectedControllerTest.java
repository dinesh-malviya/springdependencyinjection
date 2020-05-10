package com.malviyad.springdependencyinjection.controllers;

import org.junit.Before;
import org.junit.Test;

import com.malviyad.springdependencyinjection.services.GreetingServiceImpl;

public class ConstructorInjectedControllerTest {

	ConstructorInjectedController controller;

	@Before
	public void setUp() {
		controller = new ConstructorInjectedController(new GreetingServiceImpl());
	}

	@Test
	public void testGetGreeting() {
		System.out.println(controller.getGreeting());
	}
}
