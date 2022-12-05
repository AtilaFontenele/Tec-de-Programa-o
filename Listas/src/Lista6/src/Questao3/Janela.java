package Questao3;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Janela extends JFrame implements ActionListener{
	JTextField texto;
	JButton Botao;
	
	public Janela() {
		texto = new JTextField();
		texto.setBounds(30, 20, 150, 30);
		
		Botao = new JButton();
		Botao.setText("SEND");
		Botao.addActionListener(this);
		Botao.setBounds(190, 20, 90, 30);
		Botao.addActionListener(this);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(new Dimension(310, 100));
		this.setResizable(false);
		this.setLayout(null);
		this.setVisible(true);
		this.add(Botao);
		this.add(texto);	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null,"Texto: " + texto.getText());
		
	}

}
