package cenario;

import java.awt.Component;

import javax.swing.JButton;

import Jogo.Chute;

public abstract class ElementosDoGol extends JButton{
	private static final long serialVersionUID = 1L;
	protected int posicaoX;
	protected int posicaoY;
	protected int quadrante;
	protected boolean defesa;
	protected String simbolo;

	public ElementosDoGol(int posicaoX, int posicaoY) {
		this.posicaoX = posicaoX;
		this.posicaoY = posicaoY;
	}


	public boolean isDefesa() {
		return defesa;
	}

	public void setDefesa(boolean defesa) {
		this.defesa = defesa;
	}

	public int getPosicaoX() {
		return posicaoX;
	}

	public int getPosicaoY() {
		return posicaoY;
	}

}
