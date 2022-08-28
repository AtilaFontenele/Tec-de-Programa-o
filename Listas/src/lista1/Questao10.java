package lista1;
import java.util.*;

public class Questao10 {
	
//	    Verifique se A é maior que 10 se não for imprima: "número menor que
//		10". Verifique se A mais B é igual a 20 se não for verdade imprima
//		"número diferente de 20".
	
	public static void main(String[] args) {
		
		
		System.out.println("Digite o valor de A: ");
		Scanner variavel1= new Scanner(System.in);
		int A=variavel1.nextInt();

		System.out.println("Digite o valor de B: ");
		Scanner variavel2=new Scanner(System.in);
		int B=variavel2.nextInt();
		System.out.println("");
		
		if (A<=10)
			System.out.println("número menor que 10");
		if((A+B)!=20) {
			System.out.println("número diferente de 20");
		
		variavel1.close();
		variavel2.close();
	}
}
}
