package pt.upacademy.ScannerUtils;

import java.util.Scanner;

public class ScannerUtils {
	private Scanner sc = new Scanner(System.in);
	
	public int getInt() {
		do {
			if (sc.hasNextInt()) {
				return sc.nextInt();
			} else {
				sc.nextLine();
			}
		} while (true); 

	}

	public String getText() {
		return sc.nextLine();
	}
	
	public int getIntInRange(int min, int max) {
		int  val = getInt();
		if (val>= min && val<= max) {
			return val;
		} else {
			System.out.println("Invalid number, range [ " + min + " , " + max + " ]");
			return getIntInRange(min, max);
		}
	}
}
