package lista1;

import java.util.Scanner;

public class Questao02 {

//	Verifique se A é menor que 10, se verdade imprima: "A < 10", e verifique
//	se o A mais B é igual a 20, se verdade imprima: "A + B == 20". Caso
//	nenhumas das afirmação não seja verdadeira, imprima: "número não
//	válido", (obs: apenas uma impressão é permitida na saída do programa).

	public static void main(String[] args) {

		System.out.println("Digite o valor de A: ");
		Scanner variavel1 = new Scanner(System.in);
		int A = variavel1.nextInt();

		System.out.println("Digite o valor de B: ");
		Scanner variavel2 = new Scanner(System.in);
		int B = variavel2.nextInt();
		System.out.println("");

		if (A < 10) {
			System.out.println("A < 10");
			System.exit(0);
		}
		if ((A + B) == 20) {
			System.out.println("A + B == 20");
		} else
			System.out.println("numero não válido");

		variavel1.close();
		variavel2.close();
	}
}