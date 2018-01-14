package com.test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloWorld {
	@GET
	@Path("/{param}")
	@Produces(MediaType.TEXT_PLAIN)
	public Response getMsg(@PathParam("param") String message) {
		String output = "jersey say " + message;
		return Response.status(200).entity(output).build();
	}
}
