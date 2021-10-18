package aulas;

import java.util.Scanner;


public class Ex003 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o valor de A: ");
		int a = teclado.nextInt();
		System.out.print("Digite o valor de B: ");
		int b = teclado.nextInt();
		System.out.print("Digite o valor de C: ");
		int c = teclado.nextInt();
		
		float delta = (float) Math.pow(b, 2) - 4 * a * c;
		
		System.out.println(delta);
		
		teclado.close();
		
		
	}

}
