package com.picknride.WebApp;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Application;

@Path( "check" )
public class ServerReady extends Application {
	
	@GET
	public String respond(){
		return "Server is functional";
	}
}
