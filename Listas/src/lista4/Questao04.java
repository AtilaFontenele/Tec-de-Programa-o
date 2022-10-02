package lista4;

public class Questao04 {
	public static void checarLetra(String[] vetor){
		for(String palavra: vetor){
			for(int i = 0;i<palavra.length();i++){
				char c = palavra.charAt(i);
				if(c == "a".charAt(0) || c == "e".charAt(0) || c == "i".charAt(0) || c == "o".charAt(0) || c == "u".charAt(0))
					System.out.println(c + " é vogal");
				else
					System.out.println(c + " é consoante");
					
		
	}
		}
	}
	public static void main(String[] args){
		String vetor[]= {"carro","predio","quarto"};
		checarLetra(vetor);
	}
}
