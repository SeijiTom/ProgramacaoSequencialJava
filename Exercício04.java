package atividadesIntrodu��oAJava;

import java.util.Scanner;

public class Exerc�cio04 {

	public static void main(String[] args) {
		
		int A, B, C, R, S, D;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite os valores de A, B e C: ");
		A = leia.nextInt();
		B = leia.nextInt();
		C = leia.nextInt();
		
		if (A >= 0 && B >= 0 && C >= 0) {
		
		S = (B+C)*(B+C);
		R = (A+B)*(A+B);
		D = (R+S)/2;
		
		System.out.println("Resultado da express�o: " + D);
		leia.close();
		
		} else {System.out.println("Valores inv�lidos!");}
	}

}
