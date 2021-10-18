package aulas;

import java.util.Scanner;

public class Ex019 {

	public static void main(String[] args) {

		float n1,n2,result=0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite dois números! ");
		System.out.print("n1 = ");
		n1 = teclado.nextInt();
		System.out.print("n2 = ");
		n2 = teclado.nextInt();
		System.out.print("Digite a operação que deseja( + | - | * | / ): ");
		String aux = teclado.next();
		char op = aux.charAt(0);
		
		switch (op) {
		case '+' : 
			result = n1+n2;
			break;
		case '-' : 
			result = n1-n2;
			break;
		case '*' : 
			result = n1*n2;
			break;
		case '/' : 
			if (n2 == 0) {
				System.out.println("O n2 não pode ser igual a '0'!");
				break;
			} else {
				result = n1/n2;
				break;		
			}			
		default : 
			System.out.println("Operação inválida, tente novamente!");		
		}
		
		System.out.println(n1 + " " + op + " " + n2 + " = " + result);

		teclado.close();
	}
}
