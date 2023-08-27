
public class ConditionalOperator {

	public static void main(String[] args) {
		int x = 14;
		int y = 12;
		
		int lar = (x > y) ? x : y;
		System.out.println("largest of (" + x + "," + y + ") is " + lar);
		System.out.printf("largest of (%d,%d) is %d", x, y, lar);
	}
}