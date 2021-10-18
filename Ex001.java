package aulas;

import java.util.Scanner;

public class Ex001 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);		
		
		System.out.println("Digite 2 números para fazer sua divisão: ");
		int n1 = teclado.nextInt();
		int n2 = teclado.nextInt();
		
		float r = n1/n2;
		
		System.out.println(r);
		
		teclado.close();
		
		
	}

}
