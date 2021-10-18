package aulas;

import java.util.Scanner;

public class Ex006 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		// 100/((180*(ºC+32)))
		System.out.print("Digite uma temperatura em °C para converter para fahrenheit: ");
		float celcius = teclado.nextFloat();
		
		float conversao = celcius * 1.8f + 32;
		
		System.out.println(conversao);
		
		teclado.close();
		
	}

}
