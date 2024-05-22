package Formativa;

import java.util.Scanner;

public class Formativa1 {

	public static void main(String[] args) {
			
		double c,f;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira quantos °farenheit: ");
		f = ler.nextDouble();
		
		c = ((f-32)*5)/9;
		
		System.out.println(f+"°Farenheits são: "+c+ "°Celcius");
		
		ler.close();
		
		
	}

}
