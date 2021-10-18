package aulas;

import java.util.Scanner;

public class Ex020 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		double fah,celcius;
		
		
		System.out.println("Conversão:\n[1]  ºC --> ºF \n[2]  ºF --> ºC");
		System.out.println("~$ ");
		int opc = teclado.nextInt();
		
		switch (opc) {
		
		case 1: 
			System.out.print("Digite a temperatura em Celcius: ");
			celcius = teclado.nextDouble();
			fah = celcius * 1.8 + 32;
			System.out.printf(celcius + "°C convertido para Fahrenheit: %.2fºF", (fah) );
			break;
			
		case 2: 
			System.out.println("Digite a temperatura em Fahrenheit");
			fah = teclado.nextDouble();
			celcius = (fah-32)/1.8 ;
			System.out.printf(fah + "ºF convertido para Celcius: %.2fºC", (celcius) );
			break;
		
		default:
			System.out.println("Opção inválida!");
		
		}
		
		teclado.close();
		
	}

}
