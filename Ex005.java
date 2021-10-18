package aulas;

import java.util.Scanner;

public class Ex005 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int c;
		
		System.out.print("Digite um valor para a: ");
		int a = teclado.nextInt();
		System.out.print("Digite um valor para b: ");
		int b = teclado.nextInt();
	
		System.out.println("a = " + a + "  |  b = " + b);
		
		System.out.println("Realizando a troca.......");
		
		c = a;
		a = b;
		b = c;
		
		System.out.println("a = " + a + "  |  b = " + b);

		
		teclado.close();
		
	}

}
