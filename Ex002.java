package aulas;

import java.util.Scanner;

public class Ex002 {

	public static void main(String[] args) {

		System.out.println("Digite 3 números: ");
		
		Scanner teclado = new Scanner(System.in);
		
		int n1 = teclado.nextInt();
		int n2 = teclado.nextInt();
		int n3 = teclado.nextInt();
		float media = (n1+n2+n3)/(3f);
		
		System.out.print(media);
		
		
		teclado.close();
		
		
		
		
	}

}
