package Questao2;

import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Botao extends JButton {
	String nome;
	public Botao(String nome,int posX, int posY, ActionListener e) {
		setBounds(posX,posY,100,50);
		this.addActionListener(e);
		this.nome=nome;
		this.setText(nome);
		
	
}
	public String getNome() {
		return nome;
	}
}
