package co.edureka.java.except;

public class Except6 {

	public static void main(String[] args) {
	     try{
	 		int x = Integer.parseInt(args[0]);
	 		int y = Integer.parseInt(args[1]);
	 		int z = x / y;
	 		System.out.printf("%d / %d = %d\n", x,y,z);
	       }
	 	  catch(Exception ex){
	 		  System.out.println("exception occured!!!");
	 		  System.out.println("message = " + ex.getMessage());
	 		  System.out.println("toString() = " + ex.toString());
	 		  System.out.println();
	 		  ex.printStackTrace(); //toString() + callstack
	 		  System.out.println();

	 		  if(ex instanceof NumberFormatException){
	 			  System.out.println("------- PLEASE PROVIDE INT TYPE DATA AS CMD ARGS -------");
	 		  }
	 	  }
	 	  
	 	  System.out.println("----- done -----");

	}

}
