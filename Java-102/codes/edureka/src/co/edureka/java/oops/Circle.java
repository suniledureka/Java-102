package co.edureka.java.oops;

final public class Circle extends Shape {
	float radius;
	
	public Circle(String color, float radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	public void area() {
		//System.out.println("area of circle = " + (22.0f/7.0f*radius*radius));
		System.out.printf("area of circle = %.2f", (Math.PI * Math.pow(radius, 2)));
	}
}
