package com.malviyad.springdependencyinjection.controllers;

import com.malviyad.springdependencyinjection.services.GreetingService;

public class ConstructorInjectedController {
	private final GreetingService greetingService;

	public ConstructorInjectedController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
