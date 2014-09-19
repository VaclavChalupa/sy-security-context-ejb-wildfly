package org.jboss.soa.qa.security;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/service")
public interface MyServiceResource {

	@GET
	@Path("/permit-all")
	@Produces(MediaType.TEXT_PLAIN)
	Response get();

	@GET
	@Path("/roles-allowed")
	@Produces(MediaType.TEXT_PLAIN)
	Response getSecured();
}
