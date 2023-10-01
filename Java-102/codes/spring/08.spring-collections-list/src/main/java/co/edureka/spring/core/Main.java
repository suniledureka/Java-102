package co.edureka.spring.core;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.spring.core.beans.Hospital;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("hospital-beans.xml");
		
		Hospital hosp = (Hospital) context.getBean("apollo");
		
		System.out.println("Hospital Name ---> " + hosp.getHospitalName());
		System.out.println();
		
		System.out.println("Departments Available: ");
		
		List<String> deptNames = hosp.getDepartments();
		
		for(String deptName : deptNames) {
			System.out.println("\t----> " + deptName);
		}
	}
}