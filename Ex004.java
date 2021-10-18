package aulas;

import java.util.Scanner;

public class Ex004 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o valor de um cateto: ");
		int c1 = teclado.nextInt();
		System.out.print("Digite o valor do outro cateto: ");
		int c2 = teclado.nextInt();
		
		float hipo = (float) Math.sqrt(Math.pow(c1, 2) + (float) Math.pow(c2, 2)) ; 
		
		System.out.println(hipo);
		
		teclado.close();
		
		
	}

}
