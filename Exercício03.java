package atividadesIntrodu��oAJava;

import java.util.Scanner;

public class Exerc�cio03 {

	public static void main(String[] args) {
		
		int horas, mins, segs, segsTotal;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o tempo de dura��o de um evento na f�brica expressa em segundos: ");
		segsTotal = leia.nextInt();
		
		horas = (segsTotal/60)/60;
		mins = (segsTotal/60)%60;
		segs = segsTotal%60;
		
		System.out.println("O evento durou: " + horas + " horas, " + mins + " minutos e " + segs + " segundos");
		
		leia.close();
		
	}

}
