package Painel;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

import Jogo.AreaGoleiro;
import cenario.ElementosDoGol;
import cenario.Gol;


public class LabelBotoes extends JPanel {
	private static final long serialVersionUID = 1L;
	private ActionListener action;

	public LabelBotoes(Gol gol, ActionListener action) {
		this.action = action;
		setLayout(new GridLayout(9, 17));
		addBotoes(gol.getListaElementos(),action);
	}

	public LabelBotoes(ArrayList<ElementosDoGol> celulas) {
		setLayout(new GridLayout(9, 17));
		addBotoes(celulas,null);
	}

	private void addBotoes(ArrayList<ElementosDoGol> celulas,ActionListener action) {
		for (int x = 0; x < 9; x++) {
			for (int y = 0; y < 17; y++) {
				ordenar(x, y, celulas,action);
			}
		}
	}

	private void ordenar(int x, int y, ArrayList<ElementosDoGol> celulas,ActionListener action) {
		for (ElementosDoGol botao : celulas) {
			if (botao.getPosicaoX() == x && botao.getPosicaoY() == y) {
				botao.addActionListener(action);
				add(botao);
			}
		}
	}
}
