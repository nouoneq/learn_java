package aulas;

import java.util.Scanner;

public class Ex024 {

	public static void main(String[] args) {

		int num,maior=0,menor=999999999;
		
		Scanner teclado = new Scanner(System.in);
		
		for (int c = 0; c < 20; c++) {
			System.out.println("Digite um número: ");
			num = teclado.nextInt();
			if (num < menor) {
				menor = num;
			}
			if (num > maior) {
				maior = num;
			}
			
		}
		System.out.println(menor + " " + maior);
		
		
		teclado.close();	
		
	}

}
