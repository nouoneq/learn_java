package aulas;


import java.util.Scanner;
public class Ex014 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int n1 = teclado.nextInt();
		System.out.print("Digite outro número: ");
		int n2 = teclado.nextInt();
		
		if (n1 % n2 == 0) {
			System.out.print("O número " + n1 + " é divisível por " + n2);
		} else {
			System.out.print("O número " + n1 + " não é divisível por " + n2 );
		}
		
		
		teclado.close();
		
		
	}

}
