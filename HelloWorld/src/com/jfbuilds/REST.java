package com.jfbuilds;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path(value="restful path")
public class REST {
	
	public void REST() {
		
	}
	
	@GET
	@Produces("text/xml")
	public Object get() {
		return "hello world";
	}
	
	@PUT
	@Consumes("text/xml")
	public void  put(String content) {
		
	}

}
