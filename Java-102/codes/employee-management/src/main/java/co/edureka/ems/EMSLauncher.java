package co.edureka.ems;

import java.util.Scanner;

import co.edureka.ems.configs.ServicesFactory;
import co.edureka.ems.dto.Employee;
import co.edureka.ems.services.EmployeeService;

public class EMSLauncher {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception {
		EmployeeService service = ServicesFactory.getEmployeServices();
		
		Employee emp;
		int empno;
		
		while(true) {
			System.out.println("1. New Employee");
			System.out.println("2. Search Employee");
			System.out.println("3. Update Employee");
			System.out.println("4. Delete Employee");
			System.out.println("5. All Employees");
			System.out.println("6. Exit");
			
			System.out.print("\nenter an option: ");
			int opt = sc.nextInt();
			
			switch(opt) {
			 case 1:
				emp = getEmployee();
				service.saveEmployee(emp);
				break;
			 case 2:
				System.out.print("show the employee with no: ");
				empno = sc.nextInt();
				
				emp = service.searchEmployeeByNo(empno);
				if(emp != null) {
					System.out.println(emp);
				}else {
					System.err.println("@@@--- NO MATCHING EMPLOYEE FOUND ---@@@");
				}
				break;
			 case 3:
				System.out.println("logic to update employee"); 
				break;
			 case 4:
				System.out.print("enter employee no to delete: ");
				empno = sc.nextInt();
				emp = service.searchEmployeeByNo(empno);
				
				if(emp != null) {
					System.out.println(emp);
					System.out.print("do you want to delete this employee[Y/N]: ");
					String req = sc.next();
					if(req.equalsIgnoreCase("Y"))
						service.deleteEmployeeByNo(empno);
				}else {
					System.err.println("@@@--- NO MATCHING EMPLOYEE FOUND ---@@@");
				}
				break;
			 case 5:
				service.getAllEmployees(); 
				break;
			 case 6:
				System.out.println("^^^--- Application Closed ---^^^");
				sc.close();
				System.exit(0);
				break;
			 default:
				System.err.println("%%%--- INVALID OPTION --- TRY AGAIN ---%%%");				
			}//switch
			System.out.println("\n-----------------------------------------------------------------------");						
						
		}//while
		
	}
	
	private static Employee getEmployee() {
		System.out.print("enter employee no: ");
		int eno = sc.nextInt();
		sc.nextLine();
		
		System.out.print("enter employee name: ");
		String name = sc.nextLine();
		
		System.out.print("enter employee salary: ");
		float sal = sc.nextFloat();
		
		return new Employee(eno, name, sal);		
	}		

}
