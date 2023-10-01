package co.edureka.ems.dao;

import co.edureka.ems.dto.Employee;

public interface EmployeeDAO {

	Employee findEmployeeByNo(String eno);
}
