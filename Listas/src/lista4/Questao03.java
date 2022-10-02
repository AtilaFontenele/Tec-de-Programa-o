package lista4;

import java.util.Random;

public class Questao03 {
	public static int[] vetorIntAleatorio(int tam){
		
		Random gerar = new Random();
		int []vetor = new int[tam];
		
		for(int i = 0;i < vetor.length ; i++){
			vetor[i] = gerar.nextInt(101);
		}
		return vetor;
	}

	public static void checarNum(int vetor[]){
	int vetorPosMult3[]    = new int[vetor.length];
	int vetorPosNotMult3[] = new int[vetor.length];
	int vetorNegMult3[]    = new int[vetor.length];
	int vetorNegNotMult3[] = new int[vetor.length];
	int indicePosMult3    = 0;
	int indicePosNotMult3 = 0;
	int indiceNegMult3    = 0;
	int indiceNegNotMult3 = 0;
	for (int i = 0;i<vetor.length;i++) {
		System.out.print("O numero "+ vetor[i] + " é ");
		if (vetor[i] > 0) {
			System.out.print("positivo, ");
		} else {
			System.out.print("negativo, ");
		}
		
		if (vetor[i] % 2 == 0) {
			System.out.print("multiplo de 2, ");
		} else {
			System.out.print("não é multiplo de 2, ");
		}
		
		if (vetor[i] % 3 == 0) {
			System.out.println("multiplo de 3.");
			if (vetor[i] > 0) {
				vetorPosMult3[indicePosMult3] = vetor[i];
				indicePosMult3++;
			} else {
				vetorNegMult3[indiceNegMult3] = vetor[i];
				indiceNegMult3++;
			}
		} else {
			System.out.println("não é multiplo de 3. ");
			if (vetor[i] > 0) {
				vetorPosNotMult3[indicePosNotMult3] = vetor[i];
				indicePosNotMult3++;
			} else {
				vetorNegNotMult3[indiceNegNotMult3] = vetor[i];
				indiceNegNotMult3++;
			}
		}
	}
	}
		public static void main(String[]args){
			checarNum(vetorIntAleatorio(100));
			
		}

}