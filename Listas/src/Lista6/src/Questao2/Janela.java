package Questao2;

import javax.swing.JButton;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Janela extends JFrame implements ActionListener {
	JLabel label;
	JButton btn1, btn2, btn3, btn4, btn5, btn6;

	public Janela() {
	label = new JLabel("escolha");
	label.setHorizontalAlignment(JLabel.CENTER);
	label.setVerticalAlignment(JLabel.CENTER);
	label.setBounds(115, 75, 150, 50);
	label.setLayout(null);
	

	btn1 = new Botao("Java", 20, 200, (ActionListener) this);
	btn2 = new Botao("JavaScript", 140, 200, this);
	btn3 = new Botao("Python", 260, 200, this);
	btn4 = new Botao("C++", 20, 270, this);
	btn5 = new Botao("C#", 140, 270, this);
	btn6 = new Botao("C", 260, 270, this);
	
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setSize(new Dimension(380, 390));
	this.setVisible(true);
	this.setResizable(false);
	this.setLayout(null);
	this.add(label);
	this.add(btn1);
	this.add(btn2);
	this.add(btn3);
	this.add(btn4);
	this.add(btn5);
	this.add(btn6);
}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof Botao) {

			label.setText(((Botao) e.getSource()).getNome());
	}
}
}
