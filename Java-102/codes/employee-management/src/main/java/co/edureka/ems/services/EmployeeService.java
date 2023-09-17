package co.edureka.ems.services;

import co.edureka.ems.dto.Employee;

public interface EmployeeService {
	void saveEmployee(Employee emp) throws Exception;
	
	void updateEmployee(int eno, Employee emp) throws Exception;
	
	void deleteEmployeeByNo(int eno) throws Exception;
	
	Employee searchEmployeeByNo(int eno) throws Exception;
	
	void getAllEmployees() throws Exception;	
}
