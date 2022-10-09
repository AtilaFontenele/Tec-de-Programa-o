package lista5;
import java.util.*;

public class ControleRemoto {
	double vol=0;
	double canal=0;
	public ControleRemoto(){
		System.out.println("Deseja ligar a TV aperte s para sim e n para nao");
		Scanner aux = new Scanner(System.in);
			while(aux.next()!="s"){
			System.out.println("voce esta no canal "+vol);
			System.out.println("o volume atual é "+canal);
			System.out.println("deseja mudar de canal digite s ou n");
			if(aux.next().equals("s")){
				System.out.println("Digite right para avançar um canal e left para retornar");
				if(aux.next().equals("right"))
					canal+=1;
				else if(aux.next().equals("left"))
					canal-=1;
				if(canal<0)
					canal=0;
			
			}
			System.out.println("Pressione qualquer tecla para prosseguir");
			aux.next();
			System.out.println("Deseja alterar o volume digite s ou n");
			if(aux.next().equals("s")){
				System.out.println("Digite up para aumentar o volume e down para diminuir");
				if(aux.next().equals("up"))
					vol+=1;
				else if(aux.next().equals("down"))
					vol-=1;
				if(vol<0)
					vol=0;
				}
	
			System.out.println("Pressione qualquer tecla para prosseguir");
			aux.next();
			System.out.println("Deseja desligar a tv s para sim e n para nao");
			aux.next();
			}
	}

	public static void main(String[] args){
		ControleRemoto controle = new ControleRemoto();
	}
}

