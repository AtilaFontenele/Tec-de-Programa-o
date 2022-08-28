package lista1;
import java.util.*;

public class Questao13 {
//	Verifique se A é maior que 10, se verdade imprima: "A > 10". Ainda,
//	verifique se o A mais B é igual a 20, se verdade imprima: "A + B == 20”.
//	Caso as afirmações não sejam verdadeiras, imprima: "números não
//	válidos".
	
	public static void main(String[] args) {
		
		
		System.out.println("Digite o valor de A: ");
		Scanner variavel1= new Scanner(System.in);
		int A=variavel1.nextInt();

		System.out.println("Digite o valor de B: ");
		Scanner variavel2=new Scanner(System.in);
		int B=variavel2.nextInt();
		System.out.println("");
		
		if (A>10)
			System.out.println("A > 10");
		if((A+B)==20) 
			System.out.println("A + B == 20");
		if(A<=10 && A + B!=20)
			System.out.println("numeros não válidos");
		
		variavel1.close();
		variavel2.close();
	}
}
