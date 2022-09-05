package lista1;

import java.util.Scanner;

public class Questao04 {

//	Verifique se A é maior que 10 ou se A mais B é igual a 20, se verdade
//	imprima: "número válido". Caso as afirmações não sejam verdadeiras,
//	Verificar se A é igual B, caso verdade imprima: (A é igual B; A e B são
//	diferentes de 10; A é menor que 10) caso não seja verdade imprima:
//	"número não válido".

	public static void main(String[] args) {

		System.out.println("Digite o valor de A: ");
		Scanner variavel1 = new Scanner(System.in);
		int A = variavel1.nextInt();

		System.out.println("Digite o valor de B: ");
		Scanner variavel2 = new Scanner(System.in);
		int B = variavel2.nextInt();
		System.out.println("");

		if (A > 10 && A + B == 20) {
			System.out.println("numero valido");
		} else {
			if ((A == B)) {
				System.out.println("A é igual B; A e B são diferentes de 10; A é menor que 10");
			} else
				System.out.println("numero nao valido");

			variavel1.close();
			variavel2.close();
		}
	}
}