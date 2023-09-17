package co.edureka.ems.configs;

import co.edureka.ems.services.EmployeeService;
import co.edureka.ems.services.EmployeeServiceImpl;

public class ServicesFactory {
	private static EmployeeService empService;
	
	public static EmployeeService getEmployeServices() throws Exception{
		if(empService == null) {
			empService = new EmployeeServiceImpl();
		}
		return empService;
	}
}