package aulas;

import java.util.Scanner;

public class Ex007 {

	public static void main(String[] args) {

		// declarando variaveis
		int qtdCem;
		int qtdCinquenta;
		int qtdVinte;
		int qtdDez;
		int qtdCinco;
		int qtdUm;
		
		int valorSaque;
		int valorTemp;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um valor inteiro: ");
		valorSaque = teclado.nextInt();
		
		qtdCem = valorSaque / 100;
		valorTemp = valorSaque % 100;
		
		qtdCinquenta = valorTemp / 50;
		valorTemp = valorTemp % 50;
		
		qtdVinte = valorTemp / 20;
		valorTemp = valorTemp % 20;
		
		qtdDez = valorTemp / 10;
		valorTemp = valorTemp % 10;
		
		qtdCinco = valorTemp / 5;
		valorTemp = valorTemp % 5;
		
		qtdUm = valorTemp / 1;
		valorTemp = valorTemp % 1;
		
		
		System.out.println("100: " + qtdCem);
		System.out.println("50:  " + qtdCinquenta);
		System.out.println("20:  " + qtdVinte);
		System.out.println("10:  " + qtdDez);
		System.out.println("5:   " + qtdCinco);
		System.out.println("1:   " + qtdUm);
		teclado.close();
		
		
	}

}
