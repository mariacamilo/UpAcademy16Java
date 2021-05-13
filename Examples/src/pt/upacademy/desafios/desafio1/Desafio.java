package pt.upacademy.desafios.desafio1;

public class Desafio {

	int i = 0;
	int tres = 0;
	int cinco = 0;

	public Desafio(int i) {
		this.i = i;
		// TODO Auto-generated constructor stub

	}

	public void run() {
		for (int n = 1; n <= i; n++) {
			if (n % 3 == 0) {
				tres++;
			}
			if (n % 5 == 0) {
				cinco++;
			}
		}
		// TODO Auto-generated method stub

	}

	public int getBig3Count() {
		// TODO Auto-generated method stub
		return tres;
	}

	public int getBig5Count() {
		// TODO Auto-generated method stub
		return cinco;
	}

}
