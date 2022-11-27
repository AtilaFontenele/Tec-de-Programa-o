package Painel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Jogo.Resultados;
import cenario.ElementosDoGol;
import cenario.Gol;



public class Painel extends JPanel {
	private static final long serialVersionUID = 1L;
	private Resultados resultados;
	private Gol gol = new Gol(9,17);

	public Painel(Resultados resultados, Gol gol) {
		this.resultados = resultados;
		this.gol = gol;
		setLayout(new BorderLayout());
		addLabelSuperior();

	}

	private void addLabelSuperior() {
		JPanel superior = new JPanel();
		superior.setPreferredSize(new Dimension(100, 100));
		superior.setLayout(new GridLayout(3, 1, 0, 0));
		superior.setAlignmentX(CENTER_ALIGNMENT);
		add(BorderLayout.NORTH, superior);
		
	}
}
