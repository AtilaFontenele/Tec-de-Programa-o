package Jogo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import cenario.ElementosDoGol;
import cenario.Gol;
import Painel.Janela;
import Painel.LabelBotoes;
import Botoes.*;

public class Apresentacao implements ActionListener{
	private Gol gol;
	private Resultados resultados;
	private Janela janela;

	public Apresentacao() {
		gol = new Gol(9, 17);
		resultados = new Resultados();
		janela = new Janela("Programa", gol, this, resultados);
		
	}
	public void mudarLabel(ElementosDoGol botao) {
		gol.AdcChute(botao.getPosicaoX(), botao.getPosicaoY());
		LabelBotoes label = new LabelBotoes(gol,this);
		janela.addlabel(label);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		ElementosDoGol botao = (ElementosDoGol) e.getSource();
		System.out.println(botao.getPosicaoX()+ "," + botao.getPosicaoY());
		mudarLabel(botao);
		
	}
}
