package com.jfbuilds;

import javax.jws.WebService;

@WebService
public class HelloWorld {
	
	public void constructor() {
		
	}
	
	public String Hello (String s) {
		return "Hello " + s; 
	}
}
