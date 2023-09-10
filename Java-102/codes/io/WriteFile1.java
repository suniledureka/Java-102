package co.edureka.java.io;

import java.io.FileWriter;

public class WriteFile1 {

	public static void main(String[] args) throws Exception {
		//FileWriter fout = new FileWriter("src/co/edureka/java/io/edureka1.txt");
		FileWriter fout = new FileWriter("src/co/edureka/java/io/edureka1.txt", true); //true-appending mode
		
		String str = "Enroll in Edureka's certification courses & give your Tech career a much-needed boost.\n";
		fout.write(str);
		
		System.out.println("file saved!!");
		fout.close();
	}
}