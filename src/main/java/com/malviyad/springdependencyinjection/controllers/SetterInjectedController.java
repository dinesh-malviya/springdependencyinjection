package com.malviyad.springdependencyinjection.controllers;

import com.malviyad.springdependencyinjection.services.GreetingService;

public class SetterInjectedController {
	public GreetingService greetingService;

	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	public String getGreeting(){
		return greetingService.sayGreeting();
	}

}
