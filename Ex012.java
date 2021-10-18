package aulas;

import java.util.Scanner;
public class Ex012 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int n1,n2,n3;
		
		System.out.print("Digite um número: ");
		n1 = teclado.nextInt();
		System.out.print("Digite um número: ");
		n2 = teclado.nextInt();
		System.out.print("Digite um número: ");
		n3 = teclado.nextInt();
		
		if (n1 == n2 && n2 == n3) {
			System.out.print("Os 3 números são iguais!");
		} else if (n1 == n2 || n1 == n3 || n2 == n3) {
			System.out.print("Apenas 2 números são iguais!");
		} else {
			System.out.print("Nenhum dos números são iguais entre si.");
		}
			
		
		teclado.close();
		
		
	}

}
