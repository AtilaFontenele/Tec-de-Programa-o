package trabalho;

import java.util.*;

public class Goleiro {

	private int posicaox;
	private int posicaoy;
	Random aleatorio = new Random();
	private int id;
	private String nome;
	private int velocidade;
	private int flexibilidade;
	private int agilidade;
	private int coordenacao;
	private int forca;
	private int equilibrio;
	private int numDef;
	private int numGol;
	Resultados resultados= new Resultados();

	public Goleiro(int id, String nome, int velocidade, int flexibilidade, int agilidade, int coordenacao, int forca,
			int equilibrio) {
		this.id = id;
		this.nome = nome;
		this.velocidade = velocidade;
		this.flexibilidade = flexibilidade;
		this.agilidade = agilidade;
		this.coordenacao = coordenacao;
		this.forca = forca;
		this.equilibrio = equilibrio;
		this.numDef = 0;
	}

	public int AAG() {
		int aag = ((velocidade * 3) + (flexibilidade * 2) + (agilidade * 3) + (coordenacao * 2) + (forca)
				+ (equilibrio * 2)) / 8;
		return aag;
	}

	public int PGoleiroX(Chute chute) {
		if (chute.getQuadrante() == 1) {
			posicaox = aleatorio.nextInt(5);

		}
		if (chute.getQuadrante() == 2) {
			posicaox = aleatorio.nextInt(5);
		}
		if (chute.getQuadrante() == 3) {
			posicaox = aleatorio.nextInt(5) + 5;

		}
		if (chute.getQuadrante() == 4) {
			posicaox = aleatorio.nextInt(5) + 5;

		}
		return posicaox;
	}

	public int PGoleiroY(Chute chute) {
		if (chute.getQuadrante() == 1) {
			posicaoy = aleatorio.nextInt(9);

		}
		if (chute.getQuadrante() == 2) {
			posicaoy = aleatorio.nextInt(9) + 9;

		}
		if (chute.getQuadrante() == 3) {
			posicaoy = aleatorio.nextInt(9);

		}
		if (chute.getQuadrante() == 4) {
			posicaoy = aleatorio.nextInt(9) + 9;
		}
		return posicaoy;
	}

	public char[][] AreaDef(int aag, int x, int y, Gol gol, Chute chute) {
		while(aag>1) {
			int x1=x;
			for(int j = 0;j<4;j++) {
				if((aag)<1)
					continue;
				if(gol.LimQuadr(chute.getQuadrante(), x1, y) == true) {
					x1--;
					aag--;	
				continue;
			}else {
				gol.modificarGol(x1,y,' ');
			}
				x1--;
				aag--;
			
			}
			y++;
		}
		resultados.VerfChute(chute.getPosicaox(), chute.getPosicaoy(),gol);
		return gol.getGol();
	}

	
	public int getDef(int def) {
		return this.numDef+=def;
	}
	public int getGol() {
		return this.numGol;
	}

	public String getNome() {
		return this.nome;
	}

	public int getId() {
		return this.id;
	}
	public int getForca() {
		return this.forca;
	}
}
