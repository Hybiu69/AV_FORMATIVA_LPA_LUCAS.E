package Formativa;

import java.util.Scanner;

public class Formativa2 {

	public static void main(String[] args) {
		
		double l,a;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Qual o valor do lado do seu quadrado");
		l=ler.nextDouble();
		
		a=l*l;
		
		System.out.println("A área do quadrado é: "+a);
		
		ler.close();
	}

}