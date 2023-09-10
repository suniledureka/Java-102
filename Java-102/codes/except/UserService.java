package co.edureka.java.except;

import java.io.IOException;
import java.sql.SQLException;

public class UserService {
	public String findUserNameById(int id) throws SQLException, IOException {
		//logic to find User Name from DB
		if(id==101)
			return "Sanjay";
		return null;
	}
}
