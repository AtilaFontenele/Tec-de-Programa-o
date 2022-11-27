package cenario;

import java.util.ArrayList;

import Jogo.Chute;

public class Gol {

	private ArrayList<ElementosDoGol> listaElementos;
	private int numeroLinhas;
	private int numeroColunas;

	public Gol(int numeroLinhas, int numeroColunas) {
		this.numeroLinhas = numeroLinhas;
		this.numeroColunas = numeroColunas;
		listaElementos = new ArrayList<ElementosDoGol>();
		fabricaDeGol();
	}

	public int getNumeroLinhas() {
		return numeroLinhas;
	}

	public int getNumeroColunas() {
		return numeroColunas;
	}

	public void fabricaDeGol() {
		TraveE();
		TraveD();
		TraveS();
		criarPosicoesForaDoGol();
		criarPosicoesDentroDoGol();
		}


	private void TraveE() {

		for (int i = 2; i < numeroLinhas; i++) {
			listaElementos.add(new Trave(i, 1));
		}
	}
	private void TraveD(){
		for (int i = 2; i < numeroLinhas; i++) {
			listaElementos.add(new Trave(i,numeroColunas-1));
		}
	}
	private void TraveS() {
		for (int i = 1; i < numeroColunas-1; i++) {
			listaElementos.add(new Trave(1,i ));
		}
	}

	private void criarPosicoesForaDoGol() {

		// lado esquerdo
		for (int i = 1; i < numeroLinhas; i++) {
			listaElementos.add(new ForaDoGol(i,0));
		}
		// lado direito
		for (int i = 1; i < numeroLinhas; i++) {
			listaElementos.add(new ForaDoGol( i,numeroColunas - 1));
		}

		// superior
		for (int i = 0; i < numeroColunas; i++) {
			listaElementos.add(new ForaDoGol(0,i));
		}
	}
	

	private void criarPosicoesDentroDoGol() {
		for (int i = 2; i < numeroLinhas; i++) {
			for (int j = 2; j < numeroColunas - 2; j++) {
				listaElementos.add(new DentroDoGol(i, j));
			}
		}
	}

	public void AdcChute(int x,int y) {
		for (ElementosDoGol botao : listaElementos) {
			if (botao.getPosicaoX() == x && botao.getPosicaoY() == y) {
				listaElementos.remove(botao);
			}
		}
		listaElementos.add(new Chute(x,y));
	}
	
	public ArrayList<ElementosDoGol> getListaElementos() {
		return listaElementos;
	}

}
