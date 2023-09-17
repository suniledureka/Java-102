package co.edureka.ems.services;

import java.util.List;

import co.edureka.ems.dao.EmployeeDAO;
import co.edureka.ems.dao.EmployeeDAOImpl;
import co.edureka.ems.dto.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDAO dao;
	
	public EmployeeServiceImpl() throws Exception{
		dao = new EmployeeDAOImpl();
	}
	
	@Override
	public void saveEmployee(Employee emp) throws Exception {
		int n = dao.saveEmployee(emp);
		if(n > 0)
			System.out.println("Employee Saved!!");
		else
			System.err.println("Info: Employee could not be Saved!!");
	}

	@Override
	public void updateEmployee(int eno, Employee emp) throws Exception {
		int n = dao.updateEmployee(eno, emp);
		if(n > 0)
			System.out.println("Employee Updated");
		else
			System.out.println("Info: No Matching Employee to Update");		
	}

	@Override
	public void deleteEmployeeByNo(int eno) throws Exception {
		int n = dao.deleteEmployeeByNo(eno); 
		if(n > 0)
			System.out.println("Employee Deleted");
		else
			System.out.println("Info: No Matching Employee to Delete!!");	
	}

	@Override
	public Employee searchEmployeeByNo(int eno) throws Exception {
		return dao.findEmployeeByNo(eno);
	}

	@Override
	public void getAllEmployees() throws Exception {
		List<Employee> emps = dao.findAll();
		for(Employee emp : emps) {
			System.out.println(emp); //toString()
			Thread.sleep(1000);
		}
	}

}
