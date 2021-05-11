package pt.upacademy.FizzBuzz;

import pt.upacademy.ScannerUtils.ScannerUtils;

public class FizzBuzz {
	

	public static void main(String[] args) {
		ScannerUtils scu = new ScannerUtils();

		System.out.println("Number 1 - 40");
		int userInput = scu.getIntInRange(1,40);

		for (int i = 0; i <= userInput; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("Number " + i + " : FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Number " + i + " : Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Number " + i + " : Buzz");
			} else {
				System.out.println("Number " + i);
			}
		}
	}

}
