package Questao1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Botao extends JFrame implements ActionListener{
	JButton jb1 = new JButton("amarelo");
	JButton jb2 = new JButton("Verde");
	JButton jb3 = new JButton("Azul");
	JPanel panel1;
	JPanel panel2;
	
	public Botao() {
		jb1.addActionListener(this);
		jb1.setBounds(100,50,80,50);
		jb2.addActionListener(this);
		jb2.setBounds(200,50,80,50);
		
		jb3.addActionListener(this);
		jb3.setBounds(300,50,80,50);
		
		panel1 = new JPanel();
		panel1.setBounds(10, 10, 500, 100);
		panel1.setLayout(new FlowLayout());
		panel1.setBackground(Color.LIGHT_GRAY);
		
		
		panel1.add(jb1);
		panel1.add(jb2);
		panel1.add(jb3);
		
		panel2 = new JPanel();
		panel2.setBounds(10, 120, 500, 330);
		panel2.setBackground(Color.white);
		setTitle("Questao 1");
		setSize(500,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		this.setVisible(true);
		this.setResizable(false);
		this.setLayout(null);
		this.add(panel1);
		this.add(panel2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == jb1)
		panel2.setBackground(Color.YELLOW);
		else if(e.getSource()== jb2)
			panel2.setBackground(Color.GREEN);
		else
			panel2.setBackground(Color.BLUE);
		
	}
}
