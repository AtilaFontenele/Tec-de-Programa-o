package lista3;
import java.util.*;


public class lista {

	public static int[] vetorIntAleatorio(int tam){
		
			Random gerar = new Random();
			int []vetor = new int[tam];
			
			for(int i = 0;i < vetor.length ; i++){
				vetor[i] = gerar.nextInt(201)-100;
			}
			return vetor;
		}
	public static int[] vetorIntAleatorio2(int tam){
		
		Random gerar = new Random();
		int []vetor = new int[tam];
		
		for(int i = 0;i < vetor.length ; i++){
			vetor[i] = gerar.nextInt(21)-10;
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

	public static char[] VetorString() {
		char[] vetor = new char[23];
		int aux=0;
		for (char ch = 'a'; ch <= 'z'; ch++) {
		    if(ch=='k' || ch=='y' || ch=='w')
		    	continue;
		    	else
			vetor[aux]=ch;
		    aux++;
		}
	return vetor;
	}
	
	public static char[] VetorChar1() {
		String texto = "%*(-+@#123456789{}!&$?:";
		char[] vetor = new char[23];
		for (int i = 0; i < texto.length(); i++) {
			 vetor[i]=texto.charAt(i);
		 }
		return vetor;
	}

	public static char[] VetorChar2() {
		char[] vetor = new char[90];
		int aux=0;
		for (char ch = '!'; ch <= '}'; ch++) {
		    if(ch=='k' || ch=='y' || ch=='w')
		    	continue;
		    	else
			vetor[aux]=ch;
		    aux++;
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
				 vetor[aux2]=vet1[aux2];
				 aux2++;
				 vetor[aux2]=aux1;
				 aux2++;
				 aux1=1;

				 
			 }
			 if(vet1[i]==vet1[i-1])
				 aux1++;
				 
			 if(i+1==vet1.length){
				 vetor[0]=vet1[0];
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

		 int tam=0;
		 for(int i = 1; i<vet1.length;i+=2) {
			 tam+=vet1[i];
		 }
		 int[] vetor = new int[tam];
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
	 
	 public static char[] Criptografar(char[] vet,char[] vet1) {
		Scanner t = new Scanner(System.in);
		System.out.print("Quantos caracteres quer criptografar: ");
		int tam = t.nextInt();
		char[] vetor = new char[tam];
		char[] vetor1= new char[tam];
		for(int i = 0; i < tam;i++) {
			System.out.println("Digite o caractere: ");
			Scanner charac = new Scanner(System.in);
			char c;
			c = charac.next().charAt(0);
			vetor1[i] = c;

		}
		 for(int i = 0; i< vetor1.length;i++){
			 for (int j = 0; j < vet1.length; j++) {
				 if(vetor1[i]==vet[j])
					 vetor[i]=vet1[j];
			}

		 }
		 t.close();
		 
		 return vetor;
	 }
	 
	 public static char[] Descriptografar(char[] vet,char[] vet1) {
		 Scanner t = new Scanner(System.in);
			System.out.print("Quantos caracteres quer descriptografar: ");
			int tam = t.nextInt();
			char[] vetor = new char[tam];
			char[] vetor1= new char[tam];
			for(int i = 0; i < tam;i++) {
				System.out.println("Digite o caractere: ");
				Scanner charac = new Scanner(System.in);
				char c;
				c = charac.next().charAt(0);
				vetor1[i] = c;

			}
			 for(int i = 0; i< vetor1.length;i++){
				 for (int j = 0; j < vet1.length; j++) {
					 if(vetor1[i]==vet1[j])
						 vetor[i]=vet[j];
				}

			 }
			 t.close();
			 
			 return vetor;
		 }

	 public static void ContarCaracteres() {
		 char aux1;
		 int aux2=1;
		 Scanner t = new Scanner(System.in);
		 System.out.print("Quantos caracteres: ");
		 int tam = t.nextInt();
		 char[] vetor = new char[tam];
		 for(int i = 0; i < tam;i++) {
		 System.out.println("Digite o caractere: ");
			Scanner charac = new Scanner(System.in);
			char c;
			c = charac.next().charAt(0);
			vetor[i] = c;
	 }
		 for(int i = 0; i<vetor.length;i++) {
			 aux1=vetor[i];
			 for(int j = 0; j<vetor.length;j++) {
				 vetor[i]=' ';
				 if(vetor[j]==aux1) {
					 vetor[j]=' ';
					 aux2++;
			 }
			 }
			 if(aux1!=' ')
			 System.out.println(aux1 + "=" + aux2);
			 aux2=1;
		 }
		 
		
		 t.close();

		 
	 }
	 
	 public static void DiferencaAB() {
		 int aux=0;
		 Scanner t = new Scanner(System.in);
		 System.out.print("Quantos caracteres: ");
		 int tam = t.nextInt();
		 char[] vetorA = new char[tam];
		 char[] vetorB = new char[tam];
		 for(int i = 0; i < tam;i++) {
		 System.out.println("Digite o caractere do vetor A: ");
			Scanner charac1 = new Scanner(System.in);
			char c1;
			c1 = charac1.next().charAt(0);
			vetorA[i] = c1;
		 }
			for(int i = 0; i < tam;i++) {
			System.out.println("Digite o caractere do vetor B: ");
			Scanner charac2 = new Scanner(System.in);
			char c2;
			c2 = charac2.next().charAt(0);
			vetorB[i] = c2;
	 }
		 System.out.println("Estao no vetor A e nao no B: ");
		 for(int i = 0; i<vetorA.length;i++) {
			 for(int j = 0; j<vetorB.length;j++) {
				 if(vetorA[i]==vetorB[j]) 
					 aux=1;
			 }
			 if(aux==0)
				 System.out.print(vetorA[i]+" ");
			 aux=0;
		 }		 		
		 t.close();		 
	 }
	 
	 public static void main(String[] args){
		 int a=0;
		 while(a!=1) {
			 
			 System.out.println("Questao 1)Pesquisa");
			 System.out.println("Questao 2)Pesquisa por índice");
			 System.out.println("Questao 3)Separação de valores positivos e valores negativos");
			 System.out.println("Questao 4)Somatório");
			 System.out.println("Questao 5)Junção de vetor");
			 System.out.println("Questao 6) Inversão de ordem");
			 System.out.println("Questao 7) Inversão de vetores");
			 System.out.println("Questao 8) Priorização");
			 System.out.println("Questao 10) Compactação");
			 System.out.println("Questao 11) Descompactação");
			 System.out.println("Questao 12) Criptografia");
			 System.out.println("Questao 13) Descritografia");
			 System.out.println("Questao 14) Contagem de caracteres");
			 System.out.println("Questao 15) Complementação");
			 System.out.println("Questao 16) Polarização");
			 System.out.println("Questao 17) Explosão");
			 System.out.println("Questao 18) Organização");
			 System.out.println("Questao 20) Diferença-A");
			 System.out.println("Digite 21 para sair.");
			 System.out.println("Qual a questao deseja ver: ");
			 Scanner Quest = new Scanner(System.in);
			 int Questao = Quest.nextInt();	 

		 switch (Questao) {
		 case 1:
			 System.out.println("Qual elemento deseja encontrar: ");
			 Scanner n = new Scanner(System.in);
			 int num = Quest.nextInt();
			 System.out.println((Pesquisa(num,vetorIntAleatorio2(20))));
	          System.out.println("Aperte qualquer tecla para continua...");
	          new java.util.Scanner(System.in).nextLine();
			 break;
		 case 2:
			 System.out.println("Qual o indice: ");
			 Scanner n1 = new Scanner(System.in);
			 int num1 = n1.nextInt();
			 System.out.println((PesquisaPorIndice(num1,vetorIntAleatorio(20))));
	          System.out.println("Aperte qualquer tecla para continua...");
	          new java.util.Scanner(System.in).nextLine();
			 break;
		 case 3:
			 System.out.println(Arrays.toString(SeparacaoPositivoNegativo(vetorIntAleatorio(20))));
	          System.out.println("Aperte qualquer tecla para continua...");
	          new java.util.Scanner(System.in).nextLine();
			 break;
		 case 4:
			 System.out.println((Somatorio(vetorIntAleatorio(20))));
	          System.out.println("Aperte qualquer tecla para continua...");
	          new java.util.Scanner(System.in).nextLine();
			 break;
		 case 5:
			 System.out.println(Arrays.toString(JuncaoVetor(vetorIntAleatorio(20),vetorIntAleatorio(10))));
	          System.out.println("Aperte qualquer tecla para continua...");
	          new java.util.Scanner(System.in).nextLine();
			 break;
		 case 6:
			 System.out.println(Arrays.toString(InversaOrdem(vetorIntAleatorio(20))));
	          System.out.println("Aperte qualquer tecla para continua...");
	          new java.util.Scanner(System.in).nextLine();
			 break;
		 case 7:
			 System.out.println((InversaVetor(vetorIntAleatorio(20),vetorIntAleatorio(20))));
	          System.out.println("Aperte qualquer tecla para continua...");
	          new java.util.Scanner(System.in).nextLine();
			 break;
		 case 8:
			 System.out.println(Arrays.toString(Priorizacao(vetorIntAleatorio(20))));
	          System.out.println("Aperte qualquer tecla para continua...");
	          new java.util.Scanner(System.in).nextLine();
			 break;
		 case 10:
			 System.out.println(Arrays.toString(Compactacao(VetorBinario(10))));
	          System.out.println("Aperte qualquer tecla para continua...");
	          new java.util.Scanner(System.in).nextLine();
			 break;
		 case 11:
			 System.out.println(Arrays.toString(Descompactacao(Compactacao(VetorBinario(10)))));
	          System.out.println("Aperte qualquer tecla para continua...");
	          new java.util.Scanner(System.in).nextLine();
			 break;
		 case 12:
			 System.out.println(Arrays.toString(Criptografar(VetorString(),VetorChar1())));
	          System.out.println("Aperte qualquer tecla para continua...");
	          new java.util.Scanner(System.in).nextLine();
			 break;
		 case 13:
			 System.out.println(Arrays.toString(Descriptografar(VetorString(),VetorChar2())));
	          System.out.println("Aperte qualquer tecla para continua...");
	          new java.util.Scanner(System.in).nextLine();
			 break;
		 case 14:
			 ContarCaracteres();
	          System.out.println("Aperte qualquer tecla para continua...");
	          new java.util.Scanner(System.in).nextLine();
			 break;
		 case 15:
			 System.out.println(Arrays.toString(Complementacao(vetorIntAleatorio2(10),vetorIntAleatorio2(10))));
	          System.out.println("Aperte qualquer tecla para continua...");
	          new java.util.Scanner(System.in).nextLine();
			 break;
		 case 16:
			 System.out.println(Arrays.toString(Polarizacao(vetorIntAleatorio2(10))));
	          System.out.println("Aperte qualquer tecla para continua...");
	          new java.util.Scanner(System.in).nextLine();
			 break;
		 case 17:
			 System.out.println(Arrays.toString(Explosao(vetorIntAleatorio2(10))));
	          System.out.println("Aperte qualquer tecla para continua...");
	          new java.util.Scanner(System.in).nextLine();
			 break;
		 case 18:
			 System.out.println(Arrays.toString(Organizacao(vetorIntAleatorio2(10))));
	          System.out.println("Aperte qualquer tecla para continua...");
	          new java.util.Scanner(System.in).nextLine();
			 break;
		 case 20:
			 DiferencaAB();
	          System.out.println("Aperte qualquer tecla para continua...");
	          new java.util.Scanner(System.in).nextLine();
			 break;
		 case 21:
			 System.out.println("Sair do programa");
			 a=1;
		default:
			break;
		 }
		 }
	 }

	}
