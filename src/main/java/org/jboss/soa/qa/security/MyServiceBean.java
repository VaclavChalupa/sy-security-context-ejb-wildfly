package org.jboss.soa.qa.security;

import org.switchyard.component.bean.Service;

import javax.inject.Inject;

@Service(MyService.class)
public class MyServiceBean implements MyService {

	@Inject
	private MyStorageEjb myStorageEjb;

	@Override
	public String get() {
		return myStorageEjb.invoke();
	}

	@Override
	public String getSecured() {
		return myStorageEjb.invokeSecured();
	}
}
