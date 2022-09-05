package lista1;

import java.util.Scanner;

public class Questao07 {
//
//	Verifique se A é maior que 10 ou se o A mais B é igual a 20, caso sejam
//	verdadeiras as afirmações imprima: "números válidos”. Caso a primeira
//	afirmação não seja verdadeira, imprima: "número não válido".

	public static void main(String[] args) {

		System.out.println("Digite o valor de A: ");
		Scanner variavel1 = new Scanner(System.in);
		int A = variavel1.nextInt();

		System.out.println("Digite o valor de B: ");
		Scanner variavel2 = new Scanner(System.in);
		int B = variavel2.nextInt();
		System.out.println("");

		if (A <= 10) {
			System.out.println("numero nao válido");
			System.exit(0);
		}
		if (A > 10 && (A + B) == 20) {
			System.out.println("números válidos");
		} else
			System.out.println("numero nao válido");

		variavel1.close();
		variavel2.close();
	}
}