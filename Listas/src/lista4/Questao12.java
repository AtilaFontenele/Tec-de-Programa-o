package lista4;
import java.util.*;

public class Questao12 {
	public static void DesenTriang(){
			System.out.println("A)");
			int a=0;
			int b =0;
		for(a=0;a<6;a++) {
			System.out.println("");
			for(b=0;b<=a;b++) {
				System.out.print("* ");
			}		
		}
		System.out.println(a);
		for(a=6;a>=0;a--) {
			for(b=0;b<=a;b++) {
				System.out.print(" ");
				if(b==a)
					System.out.println("*");
			}
		}
		System.out.println("");
		}

public static void main(String[] args){
	DesenTriang();
}
}