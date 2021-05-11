package pt.upacademy.HelloWorld;

import pt.upacademy.ScannerUtils.ScannerUtils;

public class HelloWorld {

	public static void main(String[] args) {
		ScannerUtils scu = new ScannerUtils();

		System.out.println("Hello! What’s your name?");
		String name = scu.getText();
		System.out.println("Name : " + name);

		System.out.println("Hello! What’s your Age?");
		int age = scu.getInt();
		System.out.println("Age : " + age);

	}
}