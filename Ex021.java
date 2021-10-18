package aulas;

import java.util.Scanner;

public class Ex021 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		double notas=0,media;
		
		for (int c = 1; c < 6; c++) {
			System.out.println("Calculando média do " + c + "º aluno. ");
			for (int a = 1; a < 3; a++) {
				System.out.print("Digite a " + a + "ª nota: ");
				media = teclado.nextDouble();
				notas = notas + media;
			}
			media = notas/2;
			System.out.println("A média do " + c + "º aluno: " + media);
			media = 0;
			notas = 0;
		}
		
		teclado.close();		
	}

}
