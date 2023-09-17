package co.edureka.ems.dao;

import java.util.List;

import co.edureka.ems.dto.Employee;

public interface EmployeeDAO {
	Integer saveEmployee(Employee emp) throws Exception;
	
	Integer updateEmployee(int eno, Employee emp) throws Exception;
	
	Integer deleteEmployeeByNo(int eno) throws Exception;
	
	Employee findEmployeeByNo(int eno) throws Exception;
	
	List<Employee> findAll() throws Exception;		
}
