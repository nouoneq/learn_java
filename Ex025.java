package aulas;

import java.util.Scanner;

public class Ex025 {

	public static void main(String[] args) {

		int c=1;
		double media,n1,n2,n3;
		
		Scanner teclado = new Scanner(System.in);
		
		while (c < 51) {
			System.out.println("Calculando a média do " + c + "º aluno...");
			System.out.print("Digite N1: ");
			n1 = teclado.nextDouble();
			System.out.print("Digite N2: ");
			n2 = teclado.nextDouble();
			System.out.print("Digite N3: ");
			n3 = teclado.nextDouble();
		
			media = (n1 + n2 + n3) / 3;
			
			System.out.println("A média é: " + media);

			c++;
			
		}
		
		
		teclado.close();
		
	}

}
