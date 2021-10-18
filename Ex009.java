package aulas;

import java.util.Scanner;

public class Ex009 {

	public static void main(String[] args) {

		float media ;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite a média do aluno: ");
		media = teclado.nextFloat();
		
		if (media >= 7 ) {
			System.out.print("O aluno foi aprovado!");
		} else {
			System.out.print("O aluno foi REPROVADO!!!" );
			}
		
		teclado.close();
		
		
	}

}
