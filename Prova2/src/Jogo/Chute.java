package Jogo;

import java.awt.Color;


import cenario.ElementosDoGol;
import cenario.Gol;

public class Chute extends ElementosDoGol{
	private static final long serialVersionUID = 1L;

	public Chute(int posicaoX, int posicaoY) {
		super(posicaoX, posicaoY);
		setBackground(Color.ORANGE);
	}
	public int getPx() {
		return posicaoX;
	}
	public int getPy() {
		return posicaoY;
	}
}
