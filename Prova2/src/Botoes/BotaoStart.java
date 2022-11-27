package Botoes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Painel.Janela;

public class BotaoStart implements ActionListener {
	private Janela label;
	public BotaoStart(Janela janela) {
		this.label=janela;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String name = JOptionPane.showInputDialog(null,"Digite seu nome",null,1);
		label.addLabel();
	}

}
