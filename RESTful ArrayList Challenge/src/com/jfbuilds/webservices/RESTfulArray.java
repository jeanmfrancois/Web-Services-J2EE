package com.jfbuilds.webservices;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path(value="/RESTfulArray")
public class RESTfulArray {
	
		private ArrayList<String> dogList = new ArrayList<String>();
		
		
		public RESTfulArray() {
			dogList = new ArrayList<String>();
			dogList.add("Diesel");
			dogList.add("Layla");
			dogList.add("Tyson");
			dogList.add("Bailey");
		}
		
		@GET
		@Consumes("text/xml")
		@Produces("text/xml")
		public String get(int index) {
			return dogList.get(index);
		}
		
		@PUT
		@Consumes("text/xml")
		public void put(String content) {
			dogList.add(content);
		}
		
		@DELETE
		@Consumes("text/xml")
		public void delete(int index) {
			dogList.remove(index);
		}
}
