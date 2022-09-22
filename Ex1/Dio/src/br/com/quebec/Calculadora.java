
package br.com.quebec;

public class Calculadora {
	/*Declaração dos métodos*/
	public int som(int num1, int num2) {
		System.out.println("Soma: "+(num1+num2));
		return num1 + num2;
	}
	public static void  sub(int num1, int num2){
	   
		double resultado =  num1 - num2;
		System.out.println("Subtração: "+ resultado);
	}
	public static void  div(int num1,int num2){
	    
		double resultado =  num1 / num2;
		System.out.println("Divisão: "+ resultado);

	}
	public static void  mult(int num1, int num2){
	     
		double resultado =  num1 * num2;
		System.out.println("Multiplicação: "+ resultado);

	}
	

}
	    