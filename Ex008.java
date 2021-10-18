package aulas;

import java.util.Scanner;

public class Ex008 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o preço de compra de um produto: ");
		float produto = teclado.nextFloat() ;
		
		System.out.print("Digite a porcentagem de lucro: ");
		float lucro = teclado.nextFloat();
		
		System.out.print("O valor de venda do produto ficou por: " + (((lucro/100)*produto)+produto));
		

		
		
		teclado.close();
		
		
		
	}

}
