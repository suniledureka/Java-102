package co.edureka.java.except;

import java.io.IOException;
import java.sql.SQLException;

public class ThrowsTest {

	public static void main(String[] args) throws InterruptedException {
		UserService uService = new UserService();
		
		//int id = 101;
		int id = 100;
		
		String userName=null;
		try {
			userName = uService.findUserNameById(id);
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}
		
		if(userName != null)
			System.out.println("Welcome " + userName);
		else
			System.out.println("Welcome Guest");
		System.out.println();
		
		System.out.println("please wait for 5 seconds");
		Thread.sleep(5000); //5000ms
		System.out.println("thanks for waiting!!!");
	}
}
