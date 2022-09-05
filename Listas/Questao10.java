package lista2;

import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {
		System.out.println("Digite o valor de A: ");
		Scanner variavel1 = new Scanner(System.in);
		int i = variavel1.nextInt();

		System.out.println("Digite o valor de B: ");
		Scanner variavel2 = new Scanner(System.in);
		int j = variavel2.nextInt();
		System.out.println("");

	int a=0;
	int b=0;
	for(b=0;b<=i;b++) {
		for(a=0;a<j;a++) {
		System.out.println(b + " - "+ a + "\n");
	}

	}

}
}
