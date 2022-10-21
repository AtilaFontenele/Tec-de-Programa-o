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
	private int AAG1;
	private int numDef;
	private int numGol;
	private int aux;

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

	public int AAG1() {
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
			posicaoy = aleatorio.nextInt(9) + 8;

		}
		if (chute.getQuadrante() == 3) {
			posicaoy = aleatorio.nextInt(9);

		}
		if (chute.getQuadrante() == 4) {
			posicaoy = aleatorio.nextInt(9) + 8;
		}
		return posicaoy;
	}

	public char[][] AreaDef(int aag, int x, int y, Gol gol, Chute chute) {
		int AAG = aag;
		int x1 = x;
		int x2 = x;
		int x3 = x;
		int x4 = x;
		int j = 0;
		gol.modificarGol(chute.getPosicaox(), chute.getPosicaoy(), '*');
		VerfDef(x, y, gol);
		gol.modificarGol(x, y, ' ');
		if (AAG <= 8) {
			for (int i = 1; i <= 5; i++) {
				j = j + 1;
				if (gol.LimQuadr(chute.getQuadrante(), x1, y)) {
					System.out.println(x1);
					System.out.println(y + "Teste");
					x1 = x--;
					continue;
				}
				VerfDef(x1, y, gol);
				gol.modificarGol(x1, y, ' ');
				x1 = x--;

			}
			x1 = y + 1;

			for (int i = 1; i <= (AAG - j); i++) {
				if (gol.LimQuadr(chute.getQuadrante(), x2, x1)) {
					System.out.println(x2);
					System.out.println(x1 + "Teste");
					x2--;
					continue;
				}
				VerfDef(x2, x1, gol);
				gol.modificarGol(x2, x1, ' ');
				x2--;
			}
		} else if (AAG <= 12) {
			for (int i = 1; i <= 5; i++) {
				if (gol.LimQuadr(chute.getQuadrante(), x1, y) == true) {
					System.out.println(x1);
					System.out.println(y + "Teste");
					x1 = x--;
					continue;
				}
				VerfDef(x1, y, gol);
				gol.modificarGol(x1, y, ' ');
				x1 = x--;

			}
			x1 = y + 1;

			j = 4;
			for (int i = 1; i <= 4; i++) {
				j = j + 1;
				if (gol.LimQuadr(chute.getQuadrante(), x2, x1) == true) {
					System.out.println(x2);
					System.out.println(x1 + "Teste");
					x2--;
					continue;
				}
				VerfDef(x2, x1, gol);
				gol.modificarGol(x2, x1, ' ');

				x2--;

			}

			x1 = y + 2;

			for (int i = 1; i <= (AAG - j); i++) {
				if (gol.LimQuadr(chute.getQuadrante(), x3, x1) == true) {
					System.out.println(x3);
					System.out.println(x1 + "Teste");
					x3--;
					continue;
				}
				VerfDef(x3, x1, gol);
				gol.modificarGol(x3, x1, ' ');
				x3--;
			}
		} else {

			for (int i = 1; i <= 5; i++) {
				if (gol.LimQuadr(chute.getQuadrante(), x1, y) == true) {
					System.out.println(x1);
					System.out.println(y + "Teste");
					x1 = x--;
					continue;
				}
				VerfDef(x1, y, gol);
				gol.modificarGol(x1, y, ' ');
				x1 = x--;

			}
			x1 = y + 1;
			for (int i = 1; i <= 4; i++) {
				if (gol.LimQuadr(chute.getQuadrante(), x2, x1) == true) {
					System.out.println(x2);
					System.out.println(x1 + "Teste");
					x2--;
					continue;
				}
				VerfDef(x2, x1, gol);
				gol.modificarGol(x2, x1, ' ');

				x2--;

			}

			x1 = y + 2;

			j = 8;
			for (int i = 1; i <= 4; i++) {
				j = j + 1;
				if (gol.LimQuadr(chute.getQuadrante(), x3, x1) == true) {
					System.out.println(x3);
					System.out.println(x1 + "Teste");
					x3--;
					continue;
				}
				VerfDef(x3, x1, gol);
				gol.modificarGol(x3, x1, ' ');
				x3--;
			}
			x1 = y + 3;

			for (int i = 1; i <= (AAG - j); i++) {
				if (gol.LimQuadr(chute.getQuadrante(), x4, x1) == true) {
					System.out.println(x4);
					System.out.println(x1 + "Teste");
					x4--;
					continue;
				}
				VerfDef(x4, x1, gol);
				gol.modificarGol(x4, x1, ' ');
				x4--;
			}

		}

		return gol.getGol();
	}

	public void VerfDef(int x, int y, Gol gol) {

		if (gol.getGol()[x][y] == '*')
			this.numDef++;
		else
			aux++;
		if (aux == AAG1()) {
			aux = 0;
			numGol++;
		}
	}
}
