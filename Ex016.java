package aulas;

import java.util.Scanner;

public class Ex016 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o LADO 1: ");
		float L1 = teclado.nextFloat(); 
		System.out.print("Digite o LADO 2: ");
		float L2 = teclado.nextFloat();	
		System.out.print("Digite o LADO 3: ");
		float L3 = teclado.nextFloat();
				
		if (L1 + L2 > L3 && L2 + L3 > L1 && L3 + L1 > L2) {
			System.out.print("O triângulo pode ser formado, e é:  ");
			if (L1 == L2 && L2 == L3) {
				System.out.print("EQUILÁTERO! ");
			} else if(L1 == L2 || L2 == L3 || L3 == L1) {
				System.out.print("ISÓSCELES! ");
			} else {
				System.out.print("ESCALENO! ");
			}
		
		} else {
			System.out.print("O triângulo não pode ser formado! ");
		}
		
		
		teclado.close();
		
		
	}

}
