package lista4;
import java.util.*;
public class Questao07 {
	public static void reverterString(String string){
		char[] ch = string.toCharArray();
	    char temp;
	    for (int fim = ch.length-1,inicio=0; fim > inicio; fim--,inicio++) {
			temp = ch[inicio];
	        ch[inicio] = ch[fim];
	        ch[fim] = temp;

	}
	    System.out.println(Arrays.toString(ch));
		string= new String(ch);
		System.out.println(string);
}
	
	public static void main(String[] args){
		String string = "Programacao";
		reverterString(string);
	}
}