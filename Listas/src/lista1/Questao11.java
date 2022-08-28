package lista1;
import java.util.*;

public class Questao11 {
	
//	Verifique se A é maior que 10 se não for verifique se A mais B é igual a
//	20, imprima: "A + B == 20''. Caso A não seja maior que 10 e A mais B
//	for diferente de 20, imprima: "número não válido".
	
	public static void main(String[] args) {
		
		
		System.out.println("Digite o valor de A: ");
		Scanner variavel1= new Scanner(System.in);
		int A=variavel1.nextInt();

		System.out.println("Digite o valor de B: ");
		Scanner variavel2=new Scanner(System.in);
		int B=variavel2.nextInt();
		System.out.println("");
		
		if (A>10) {
			System.out.println("numero valido");
		}else if(A+B==20) {
			System.out.println("A + B == 20");
		}else
			System.out.println("número não válido");
		
		
		variavel1.close();
		variavel2.close();
	
	}
}

