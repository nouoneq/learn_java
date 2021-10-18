package aulas;

import java.util.Scanner;

public class Ex015 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o valor de 'A': ");
		int a = teclado.nextInt();
		System.out.print("Digite o valor de 'B': ");
		int b = teclado.nextInt();
		System.out.print("Digite o valor de 'C': ");
		int c = teclado.nextInt();
		
		int delta = (b*b) - 4 * (a*c) ;
		
		System.out.println("O valor de delta: " + delta);
		
		float x1 = (float) (-b + Math.sqrt(delta)) / 2 * a;
		float x2 = (float) (-b - Math.sqrt(delta)) / 2 * a;
		
		if (x1 == x2) {
			System.out.print("O valor das duas raízes são iguais: " + x1);
		} else {
			System.out.println("O valor da raiz_1: " + x1);
			System.out.println("O valor da raiz_2: " + x2);
		}
		
		
		teclado.close();
		
	}

}
