package lista1;

import java.util.*;

public class Questao09 {
//	Verifique se A é maior que 10 e verifique se A mais B é igual a 20, se
//	verdadeiro, imprima: "A + B == 20''. Caso as afirmações não forem
//	verdadeiras imprima: "número não válido".

	public static void main(String[] args) {

		System.out.println("Digite o valor de A: ");
		Scanner variavel1 = new Scanner(System.in);
		int A = variavel1.nextInt();

		System.out.println("Digite o valor de B: ");
		Scanner variavel2 = new Scanner(System.in);
		int B = variavel2.nextInt();
		System.out.println("");

		if (A > 10 && (A + B) == 20) {
			System.out.println("A + B == 20");
		} else
			System.out.println("numero não válido");

		variavel1.close();
		variavel2.close();
	}
}