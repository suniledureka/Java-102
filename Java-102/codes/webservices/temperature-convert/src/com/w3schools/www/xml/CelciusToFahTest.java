package com.w3schools.www.xml;

public class CelciusToFahTest {

	public static void main(String[] args) throws Exception {
		TempConvertLocator locator = new TempConvertLocator(); 
		TempConvertSoap ref = locator.getTempConvertSoap();
		
		String cel = "35";
		String fah = ref.celsiusToFahrenheit(cel);
		
		System.out.printf("%sC = %sF", cel, fah);
	}
}