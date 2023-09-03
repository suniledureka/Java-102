package co.edureka.java.strings;

public class StringMethod3 {

	public static void main(String[] args) {
		String str = "Java is a Programming Language mainly used to develop platform independent applications"; 
				
		String[] words = str.split(" ");
		System.out.println("no of words = " + words.length);
		
		System.out.println("------------- words present -------------");
		for(String word : words) {
			System.out.println("----> " + word);
		}
		System.out.println();
		
		String str1 = String.join(" * ", words);
		System.out.println(str1);
	}
}
