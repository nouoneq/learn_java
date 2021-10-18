package aulas;

import java.util.Scanner;

public class Ex026 {
		
	public static void main(String[] args) {

		double c=0,i=0,n1,n2;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		n1 = teclado.nextDouble();
		System.out.print("Digite outro número: ");
		n2 = teclado.nextDouble();
		i = n2;
		while (n2 > 0) {
			c = n1 + c;
			n2--;
		}
		System.out.println(n1 + " * " + i + " = " + c);
		
		teclado.close();
		
		
	}

}
