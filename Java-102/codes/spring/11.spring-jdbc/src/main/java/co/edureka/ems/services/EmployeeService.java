package co.edureka.ems.services;

import co.edureka.ems.dto.Employee;

public interface EmployeeService {
	void saveEmployee(Employee emp);
	
	void updateEmployee(int eno, Employee emp);
	
	void deleteEmployeeByNo(int eno);
	
	Employee searchEmployeeByNo(int eno);
	
	void getAllEmployees();	
}
