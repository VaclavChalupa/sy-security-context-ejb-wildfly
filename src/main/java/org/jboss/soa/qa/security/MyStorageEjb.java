package org.jboss.soa.qa.security;

import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;

@Stateless
@PermitAll
public class MyStorageEjb {

	public String invoke() {
		return "invoked ejb method";
	}

	@RolesAllowed("authorized")
	public String invokeSecured() {
		return "invoked secured ejb method";
	}
}
