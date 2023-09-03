package co.edureka.java.oops;

import java.util.Scanner;

public class DrawingApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Shape sh;
		//sh = new Shape("Red"); //Cannot instantiate the type Shape
		
		System.out.print("which shape do you want to work with? [1.Rect | 2.Circle]: ");
		int shapeType = sc.nextInt();
		
		switch(shapeType) {
		 case 1:
			 sh = new Rectangle("Yellow", 12, 6);
			 break;
		 case 2:
			 sh = new Circle("Blue", 12.5f);
			 break;			 
		 default:
			 System.err.println("INVALID SHAPE TYPE SELECTION ---- TRY AGAIN");
			 return; //System.exit(0);
		}//switch
		System.out.println();
		
		System.out.println("=================== SHAPE SELECTED :: "+ sh.getClass().getSimpleName().toUpperCase() + " ===================");
		
		System.out.println("color of " + sh.getClass().getSimpleName() + " = " + sh.getColor());
		sh.setColor("Red");
		System.out.println("color of " + sh.getClass().getSimpleName() + " = " + sh.getColor());
		
		sh.area(); 
	}
}
