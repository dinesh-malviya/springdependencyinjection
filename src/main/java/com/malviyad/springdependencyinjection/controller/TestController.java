package com.malviyad.springdependencyinjection.controller;

import org.springframework.stereotype.Controller;

@Controller
public class TestController {
public String testHello(){
	System.out.println("Hello World!!!");
	return "Hi Test Controller";
}
}
