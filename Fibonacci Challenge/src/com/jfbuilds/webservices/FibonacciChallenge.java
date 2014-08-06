package com.jfbuilds.webservices;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class FibonacciChallenge {

		public void constructor() {
			
		}
		
		@WebMethod
		public int fibonacci(int index) {
			int a = 1;
			int b = 1;
			for(int i = 1; i < index; i++) {
				int temp = a + b;
				a = b;
				b = temp;
			}
			return b; 
		}
}
