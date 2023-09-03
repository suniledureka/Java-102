class Employee 
{
	int empno;
	String name;
	float sal;
	
	void setDetails(){
		name = "Sanjay Patil";
		sal = 8775.5f;
	}

	void getDetails(){
		System.out.println(empno + " | " + name + " | " + sal);
	}

	public static void main(String[] args){
		System.out.println("in Employee class");
	}
} //Employee

class ObjectTest{
	public static void main(String[] args) 
	{
		//-- create an instance of Employee type
		Employee emp = new Employee();

		//-- accessing the state of an object with reference
		System.out.println(emp.empno + " | " + emp.name + " | " + emp.sal);

		//-- accessing the state of an object with reference and method
		emp.getDetails();

		//-- change the state of object with reference
		emp.empno = 101;
		emp.name = "Sanjay";
		emp.sal = 7500f;

		emp.getDetails();

		//-- change the state of object with reference and method
		emp.setDetails();
		emp.getDetails();
	}
}
