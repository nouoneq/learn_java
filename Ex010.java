package aulas;


import java.util.Scanner;
public class Ex010 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite sua idade: ");
		int idade = teclado.nextInt();
		if (idade >= 18) {
			System.out.print("MAIOR DE IDADE!!");
		} else {
			System.out.print("MENOR DE IDADE!!! ");
		}
		teclado.close();
		
		

	}

}
