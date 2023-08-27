
public class ArithmeticOperators {

	public static void main(String[] args) {
		int x = 10, y=3;
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y); //3
		
		System.out.println(10 % 3); //1
		System.out.println(-10 % 3); //-1
		System.out.println(10 % -3); //1
		System.out.println(-10 % -3); //-1
		
		System.out.println(10 / 3); //3
		System.out.println(10f / 3); //3.3333333
		System.out.println(10 / 3f); //3.3333333
		System.out.println(10d / 3); //3.3333333333333335
		
		//System.out.println(10 / 0); //java.lang.ArithmeticException
		System.out.println(10f / 0); //Infinity
		System.out.println(10d / 0); //Infinity
		System.out.println(-10f / 0); //-Infinity
		System.out.println(0.0 / 0); //NaN (Not a Number)
	}
}