package lista1;

import java.util.*;

public class Questao12 {
//	Verifique se A é maior que 10 imprima: "A > 10" ou verifique se A mais
//	B é igual a 20, imprima: "A + B == 20'', caso as afirmações não sejam
//	verdadeiras, imprima: "números não válidos". Sejam as afirmações
//	anteriores falsas ou verdadeiras imprima: “Sejam bem-vindos à
//	disciplina de Técnicas de Programação”.

	public static void main(String[] args) {

		System.out.println("Digite o valor de A: ");
		Scanner variavel1 = new Scanner(System.in);
		int A = variavel1.nextInt();

		System.out.println("Digite o valor de B: ");
		Scanner variavel2 = new Scanner(System.in);
		int B = variavel2.nextInt();
		System.out.println("");

		if (A > 10)
			System.out.println("A > 10");
		if ((A + B) == 20)
			System.out.println("A + B == 20");
		if (A <= 10 && A + B != 20)
			System.out.println("numeros não válidos");
		System.out.println("Sejam bem-vindos a disciplina de Técnicas de Programação");
		variavel1.close();
		variavel2.close();
	}
}