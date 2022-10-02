package lista4;
import java.util.*;
public class Questao02 {
	public static double calcAlug(String dia,String tipo,double preco){
		double precofinal=preco;
		if(dia.equals("segunda") || dia.equals("terca") || dia.equals("quinta"))
			 precofinal=preco-(preco*(0.40));
		if(tipo.equals("nova"))
			precofinal=precofinal+((0.15)*preco);
		return precofinal;
	}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Insira o dia da semana:");
		String dia = input.nextLine();
		
		System.out.printf("Insira o tipo de ferramenta:");
		String tipo = input.nextLine();
		
		System.out.printf("Insira o valor do aluguel:");
		Double preco = input.nextDouble();
		
		double precoFinal = calcAlug(dia, tipo, preco);
		
		System.out.printf("Preco final do aluguel:R$%.2f", precoFinal);
		
		input.close();
	}
}
