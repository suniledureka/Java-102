package co.edureka.ems.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import co.edureka.ems.dao.EmployeeDAO;
import co.edureka.ems.dto.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDAO dao;
	

	@Override
	public Employee searchEmployeeByNo(String eno) {
		return dao.findEmployeeByNo(eno);
	}

}
