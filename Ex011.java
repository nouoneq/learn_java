package aulas;

import java.util.Scanner;
public class Ex011 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num = teclado.nextInt();
		
		if (num % 2 == 0) {
			System.out.print("O número " + num + " é PAR!");
		} else {
			System.out.print("O número " + num + " é IMPAR!");
		}
		
		
		
		teclado.close();
		
	}

}
