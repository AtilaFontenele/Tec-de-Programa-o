package lista1;

import java.util.Scanner;

public class Questao06 {

//	Verifique se A é maior que 10, se verdade imprima: "A > 10" caso não
//	seja, imprima: "A <= 10". Verifique se A mais B é igual a 20, se
//	verdadeiro, imprima: "A + B == 20”, caso não seja imprima: “A + B !=
//	20”.
	
	public static void main(String[] args) {
		
		
		System.out.println("Digite o valor de A: ");
		Scanner variavel1= new Scanner(System.in);
		int A=variavel1.nextInt();

		System.out.println("Digite o valor de B: ");
		Scanner variavel2=new Scanner(System.in);
		int B=variavel2.nextInt();
		System.out.println("");
		
		if (A>10) {
			System.out.println("A > 10");
		}else
			System.out.println("A <= 10");
		
	
		if((A+B)==20) {
			System.out.println("A + B == 20");
		}else
			System.out.println("A + B != 20");
		
		variavel1.close();
		variavel2.close();
}
}
