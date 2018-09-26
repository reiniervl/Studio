package com.rest;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;

//@RequestScoped
@ApplicationPath("/hellostudios")
@Path("/hellostudios")
@Produces({ "application/xml", "application/json" })
@Consumes({ "application/xml", "application/json" })
public class HelloStudioEndpoint extends Application {
	@GET
	@Produces("text/html")
	public String getHtml() {
	    return "<html lang=\"en\"><body><h1>Hello, World!!</body></h1></html>";
	}
}
