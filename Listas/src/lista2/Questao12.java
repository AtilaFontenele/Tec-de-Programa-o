package lista2;
import java.util.*;
public class Questao12 {

	public static void letraA(int C,int L) {
		System.out.println("A)");
		int a=0;
		int b =0;
	for(a=0;a<L;a++) {
		System.out.println("");
		for(b=0;b<=a;b++) {
			System.out.printf("* ");
		}

		
	}
	System.out.println("");
	}

	public static void letraB(int C,int L) {
		System.out.println("B)");
		int a=0;
		int b=0;
	for(a=1;a<=L;a++) {
		System.out.println("");
		
		for(b=1;b<=C;b++) {
			if( a==b || b==(C+1)-a  )
				System.out.printf("# ");
			else
				System.out.printf("* ");
		}

		
	}
	System.out.println("");
	}
	

	public static void letraC(int C,int L) {
		System.out.println("C)");
		int a=0;
		int b=0;
	for(a=0;a<L;a++) {
		System.out.println("");
		for(b=0;b<C;b++) {
			
			if(a%2==0)
				System.out.printf("# ");
			else
				System.out.printf("* ");
		}

		
	}
	System.out.println("");
	}

	public static void letraD(int C,int L) {
		System.out.println("D)");
		int a=0;
		int b=0;
		for(b=0;b<L;b++) {
			System.out.println("");
			for(a=0;a<C;a++) {
				if(b==0 || b==L-1)
					System.out.printf("# ");
				else if(a==0 || a==C-1)
				System.out.printf("# ");
				else if (a>0 && a<C-1)
				System.out.printf("* ");
			}

		}
		System.out.println("");
	}
	

	public static void letraE(int C,int L) {
		System.out.println("E)");
		int a=0;
		int b=0;
	for(b=0;b<L/2;b++) {
		System.out.println("");
		for(a=0;a<C;a++) {
			System.out.printf("* ");
		}

	}
	for(a=0;a<L/2;a++) {
		System.out.println("");
		for(b=0;b<C;b++) {
			if(b%2==0)
		System.out.printf("# ");
			else
		System.out.printf("$ ");
		}
	}
	System.out.println("");
	}

	



public static void main(String[] args) {
	System.out.println("Digite o numero de linhas: ");
	Scanner variavel1 = new Scanner(System.in);
	int L = variavel1.nextInt();

	System.out.println("Digite o numero de colunas: ");
	Scanner variavel2 = new Scanner(System.in);
	int C = variavel2.nextInt();
	System.out.println("");
	letraA(C,L);
	System.out.println("");
	letraB(C,L);
	System.out.println("");
	letraC(C,L);
	System.out.println("");
	letraD(C,L);
	System.out.println("");
	letraE(C,L);
	
	variavel1.close();
	variavel2.close();
	}
}