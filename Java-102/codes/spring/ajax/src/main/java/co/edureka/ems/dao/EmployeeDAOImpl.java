package co.edureka.ems.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import co.edureka.ems.dto.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	
	private JdbcTemplate st;	
	
	public void setSt(JdbcTemplate st) {
		this.st = st;
	}

	@Override
	public Employee findEmployeeByNo(final String eno) {
		Employee emp = null;
		String sql = "select ename,sal from emp where empno="+eno;
		try {
		 emp = st.queryForObject(sql, new RowMapper<Employee>() {
			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				String name = rs.getString(1);
				float sal = rs.getFloat(2);
				return new Employee(Integer.parseInt(eno), name, sal);
			}
			
		 });
		}catch(Exception ex) {}
		return emp;
	}
}
