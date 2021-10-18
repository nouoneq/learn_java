package aulas;

import java.util.Scanner;

public class Ex018 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite a idade do nadador: ");
		int idade = teclado.nextInt();
		
		if (idade <= 10) {
			System.out.print("O nadador ficou na categoria INFANTIL!");
		} else if ( idade >= 11 && idade <= 15 ) {
			System.out.print("O nadador ficou na categoria INFANTO! ");
		} else if ( idade >= 16 && idade <= 18 ) {
			System.out.print("O nadador ficou na categoria JUVENIL! ");
		} else {
			System.out.print("O nadador ficou na categoria ADULTO! ");
		}
		
		teclado.close();
		
	}

}
