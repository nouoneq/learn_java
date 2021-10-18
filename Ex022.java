package aulas;

import java.util.Scanner;

public class Ex022 {

	public static void main(String[] args) {

		double num,imp=0;
		
		Scanner teclado = new Scanner(System.in);
		
		for (int c = 1 ; c < 6 ; c++) {
		
			System.out.println("Digite o " + c + "º número: ");
			num = teclado.nextDouble();
			
			if (num % 2 != 0) {
				imp = num + imp;
			}
		}
		
		if (imp == 0) {
			System.out.println("Nenhum número ímpar foi digitado! ");
		} else {
			System.out.println("A soma de todos os números impares digitados foi de: " + imp);
		}
		
		teclado.close();
				
	}

}
