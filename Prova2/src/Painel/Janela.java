package Painel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Botoes.*;
import cenario.Gol;
import Jogo.Resultados;


public class Janela extends JFrame {
	private static final long serialVersionUID = 1L;
	private LabelBotoes label;
	private Gol gol;
	private Resultados resultados;
	
	public Janela(String titulo,Gol gol,ActionListener actionListener,Resultados resultados) {
		setTitle(titulo);
		setLayout(new BorderLayout());
		setSize(1280, 720);
		setLocation(100, 50);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		this.gol=gol;
		this.resultados = resultados;
		this.label = new LabelBotoes(gol, actionListener);
		addLabelSuperior();
	}
	public void addLabelSuperior() {
		setTitle("PENALTIS");
		JPanel labelSuperior = new JPanel();
		labelSuperior.setVisible(false);
		labelSuperior.setPreferredSize(new Dimension(100, 50));
		labelSuperior.add(new Botao( "Start",new BotaoStart(this)));
		labelSuperior.add(new Botao("Stop",new BotaoStop()));
		add(BorderLayout.NORTH, labelSuperior);
		labelSuperior.setVisible(true);
	}

	public void addlabel(LabelBotoes label) {
		this.label = label;
		this.label.setVisible(false);
		add(BorderLayout.CENTER, this.label);
		this.label.setVisible(true);
	}

	public void addLabel() {
		label.setVisible(false);
		add(BorderLayout.CENTER, label);
		label.setVisible(true);
	}

	public Resultados getResultados() {
		return resultados;
	}

}
