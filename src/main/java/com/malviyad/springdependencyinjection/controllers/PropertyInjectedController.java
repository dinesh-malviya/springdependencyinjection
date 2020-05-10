package com.malviyad.springdependencyinjection.controllers;

import com.malviyad.springdependencyinjection.services.GreetingService;

public class PropertyInjectedController {
	public GreetingService greetingService;

	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
