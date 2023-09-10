package co.edureka.java.io;

import java.io.File;

public class ListDirectory {

	public static void main(String[] args) throws Exception{
		File dir = new File("e:/Java-102");
		
		if(dir.isDirectory()) {
			String[] fNames = dir.list();
			
			for(int i=0; i<fNames.length; i++) {
				System.out.printf("%3d ---> %s\n", (i+1), fNames[i]);
				Thread.sleep(200);
			}
		}
	}

}
