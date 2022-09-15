package lista3;
import java.util.*;

public class lista {

	public static int[] vetorIntAleatorio(int tam){
		
			Random gerar = new Random();
			int []vetor = new int[tam];
			
			for(int i = 0;i < vetor.length ; i++){
				vetor[i] = gerar.nextInt(10);
			}
			return vetor;
		}
	
	public static int[] VetorBinario(int tam){
		
		Random gerar = new Random();
		int []vetor = new int[tam];
		
		for(int i = 0;i < vetor.length ; i++){
			vetor[i] = gerar.nextInt(2);
		}
		return vetor;
	}

	public static int Pesquisa(int num,int[] v){
	
	for(int i = 0; i < v.length ; i++){
		if (v[i] == num){
			return i;}
	}
	return -100;
	}
	
	public static int PesquisaPorIndice(int indice,int[] vet){
		if(indice<=vet.length)
				return vet[indice];
		 
		return -1001;
	}
	
	public static int[] SeparacaoPositivoNegativo(int[] vet){
		int[] vetor=new int[vet.length];
		int j=0;
		int k=0;
		for(int i = 0;i < vet.length;i++){
			if(vet[i]<0){
				vetor[j]=vet[i];
				j++;
			}
			if(vet[i]>0){
				vetor[vet.length-1-k]=vet[i];
			k++;
		}
		}
		System.out.println(Arrays.toString(vet));
		return vetor;
	}

	 public static int Somatorio(int[] vet){
		 int soma=0;
		 for(int i = 0; i < vet.length;i++){
			 soma=soma+vet[i];
		 }
		 return soma;
	 }
	
	 public static int[] JuncaoVetor(int[] vet1,int[] vet2){
		 int[] vetor= new int[vet1.length+vet2.length];
		 int j = 0;
		 for(int i = 0;i < vetor.length;i++ ){
			 if(i<=vet1.length-1)
				 vetor[i]=vet1[i];
			 else{
				 vetor[i]=vet2[j];
				 j++;
			 }
		 }
		 return vetor;
	 }
	
	 public static int[] InversaOrdem(int[] vet){
		 int j=0;
		 for(int i = 0; i < vet.length/2;i++){
			 j=vet[i];
			 vet[i]=vet[vet.length-1-i];
			 vet[vet.length-1-i]=j;
		 }
		 return vet;
	 }

	 public static String InversaVetor(int[] vet1,int[] vet2){
		 int[] vetor = new int[vet1.length];
		 for(int i = 0;i < vet1.length; i++){
			 vetor[i]=vet1[i];
			 vet1[i]=vet2[i];
			 vet2[i]=vetor[i];
		 }
		 System.out.println("vet1: " + Arrays.toString(vet1));
		 System.out.println("vet2: " + Arrays.toString(vet2));
		 return " ";
	 }
	 
	 public static int[] Priorizacao(int[] vet1){
		int[] vetor = new int[vet1.length];
		int media=0;
		int aux = 0;
		
		for(int i = 0;i < vet1.length; i++){
			media += vet1[i];
		}
		media=media/vet1.length;
		for(int i = 0 ;i < vet1.length;i++){
			if(vet1[i]>media){
				vetor[aux]=vet1[i];
				aux++;
			}
		}
		return vetor;
	 }
	 
	 public static int[] Compactacao(int[] vet1){
		 int tam = 1;
		 for (int i = 1;i<vet1.length;i++) {

			 if(vet1[i]!=vet1[i-1])
				 tam++;
		 }

		 int[] vetor = new int[2*tam];

		 int aux1 = 1;
		 int aux2 = 0;
		 for(int i = 1;i < vet1.length ;i++){

			 if(i==1 && vet1[0]!=vet1[1] ){
				 vetor[aux2]=aux1;
				 aux2++;
				 aux1=1;

				 
			 }
			 if(vet1[i]==vet1[i-1])
				 aux1++;
				 
			 if(i+1==vet1.length){
				 vetor[aux2]=vet1[i];
				 aux2++;
				 vetor[aux2]=aux1;
				 aux2++;
				 aux1=1;
				 return vetor;
			 }
			 if(vet1[i]!=vet1[i+1]){
				 if(aux2>0) {
				 vetor[aux2]=vet1[i];
				 aux2++;
				 vetor[aux2]=aux1;
				 aux2++;
				 aux1=1;
			  }
				 else {
				 vetor[aux2]=vet1[i-1];
				 aux2++;
				 vetor[aux2]=aux1;
				 aux2++;
				 aux1=1;
			 }
			 }
			  
			 
			 }
		 return vetor;
	 }

	 public static int[] Complementacao(int[] vet1,int[] vet2){
		 int[] vetor= new int[vet1.length];
		 int aux=0;
		 
		 for(int i = 0; i<vet1.length;i++){
			 aux=-1*(vet1[i]+vet2[i]-10);
			 vetor[i]=aux;
		 }
		 return vetor;
	 }
	 
	 public static int[] Polarizacao(int[] vet1){
		 int[] vetor=new int[vet1.length];
			int j=0;
			int k=0;
			for(int i = 0;i < vet1.length;i++){
				if(vet1[i]%2!=0){
					vetor[j]=vet1[i];
					j++;
				}
				if(vet1[i]%2==0){
					vetor[vet1.length-1-k]=vet1[i];
				k++;
			}
			}
			System.out.println(Arrays.toString(vet1));
			return vetor;
		}
	 
	 public static int[] Explosao(int[] vet1){
		 int tam=0;
		 for(int i = 0;i<vet1.length;i++){
			 tam+=vet1[i];
		 }
		 int[] vetor = new int[tam];
		 int aux=0;
		 for(int i = 0; i<vet1.length;i++){
			 for(int j=0;j<vet1[i];j++){
				 vetor[aux]=vet1[i];
				 aux++;
			 }
		 }
	 return vetor;
	 }
	 
	 public static int[] Organizacao(int[] vet1){
		 int aux=0;
		 for (int i = 0; i < vet1.length; i++) {

			for (int j = 0; j < vet1.length; j++) {
				if(vet1[i]<vet1[j]) {
					aux=vet1[i];
					vet1[i]=vet1[j];
					vet1[j]=aux;

				}

				}
			}
		
	 return vet1;
	 }
	 
	 public static int[] Descompactacao(int[] vet1) {
		 
		 int[] vetor = new int[2*vet1.length];
		 int aux=0;
		 int aux2=0;
		 for(int i = 0; i<vet1.length;i+=2) {
			 if(i==0)
			 aux=vet1[1];
			 else
				 aux=vet1[i+1];
			 for(int j = 0;j<aux;j++) {
				 vetor[aux2]=vet1[i];
				 aux2++;
			 }
		 }
		 
		 return vetor;
	 }
	 
	 public static void main(String[] args){
		
	//	int[] vet1 = vetorIntAleatorio(10);
	//	int[] vet2 = vetorIntAleatorio(10);
		int[] vetBin = VetorBinario(10);
		System.out.println(Arrays.toString(vetBin));
		System.out.println(Arrays.toString(Compactacao(vetBin)));
	//	System.out.println(Arrays.toString(vet2));
		System.out.println(Arrays.toString(Descompactacao(Compactacao(vetBin))));
	}
}
