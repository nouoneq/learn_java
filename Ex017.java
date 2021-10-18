package aulas;

import java.util.Scanner;

public class Ex017 {

	public static void main(String[] args) {

		float nota,media = 0;
		int faltas;
		
		Scanner teclado = new Scanner(System.in); 
		
		System.out.print("Digite o nome do aluno: ");
		String nome = teclado.next();
		
		for (int c = 1 ; c <= 3 ; ++c) {
			System.out.print("Digite a " + c + "ª nota: ");
			nota = teclado.nextFloat();
			media = nota + media;
		}
		
		System.out.print("Digite o número de faltas do aluno: ");
		faltas = teclado.nextInt();
		
		if ( media/3 >= 5 && faltas <= 27 ) {
			System.out.print("O aluno " + nome + " foi aprovado! PARABÉNS!!");
		} else if (media/3 < 5 && faltas > 27) {
			System.out.print("O aluno " + nome + " foi reprovado por falta!");
		} else {
			System.out.print("O aluno foi reprovado por média!");
		}
		
		
		teclado.close();
		
		
	}

}
