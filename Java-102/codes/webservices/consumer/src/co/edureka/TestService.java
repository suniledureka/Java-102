package co.edureka;

import co.edureka.services.Nums;
import co.edureka.services.NumsServiceLocator;

public class TestService {

	public static void main(String[] args) throws Exception{
		NumsServiceLocator locator = new NumsServiceLocator();
		Nums ref = locator.getNums();
		
		System.out.println("10 + 20 = " + ref.add(10, 20));
		System.out.println("10.2 + 20.1 = " + ref.sub(10.2f, 20.1f));
	}
}