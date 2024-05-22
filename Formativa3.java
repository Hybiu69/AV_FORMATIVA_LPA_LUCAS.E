package Formativa;

import java.util.Scanner;

public class Formativa3 {

	public static void main(String[] args) {
		
	 double a,b,sub,mult,soma;
	 String o;
	 
	 Scanner ler = new Scanner (System.in);
	 
	 System.out.println("Insira o valor 1: ");
	 a = ler.nextDouble();
	 
	 System.out.println("Insira o valor 2:");
	 b = ler.nextDouble();
	 
	 System.out.println("Qual operação você quer realizar ? (+ - ou *)");
	 o = ler.next();
	 
	 if(o.equals("+")) {
		 soma=a+b;
		 
		 System.out.println("O resultado da soma é igual a: "+soma);
	 }
	 else if (o.equals("-")) {
		 sub=a-b;
		 
		 System.out.println("O resultado da subtração é igual a: "+sub);
	 }
	 else if (o.equals("*")) {
		 mult=a*b;
		 
		 System.out.println("O resultado da multiplicação é igual a: "+mult);
	 }
	 else {
		 System.out.println("Operação inválida");
	 }
	 
	 
	 ler.close();
	}

}