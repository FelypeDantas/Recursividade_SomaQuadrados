package Recursividades;


public class Potencia {
	public static void main(String[] args) {
		int p = 150, i = 0;
		
		System.out.println("o valor: " + Somas(p, i));
	}

	//Somas(5) = 1 + 5 * 5
	//Somas(4) = 26 + 4 * 4
	//Somas(3) = 42 + 3 * 3
	//Somas(2) = 51 + 2 * 2
	//Somas(1) = 55;
	private static int Somas(int p, int i) {
		if(p == 10) {
			return i;
		}
		return i + Somas(p-1, p*p);
	}
}
