package Janelas;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

import Modelo.Placar;

public class Janela extends JFrame implements ActionListener {
	private JPanel painelTimes;
	private JLabel painelTitulo;
	private JButton botao;
	private String Nome;
    private JButton btnSave;
    private Partida partida1,partida2,partida3,partida4,partida5,partida6,partida7;
    
	Janela(String nome) {
		this.Nome = nome;
		painelTitulo = new JLabel("Jogo");
		painelTitulo.setFont(new Font(null, Font.BOLD, 20));
		painelTitulo.setBounds(340,0,200,100);
		this.add(painelTitulo);
		
		btnSave = new JButton("Salvar");
		btnSave.setFont(new Font(null, Font.BOLD, 10));
		btnSave.setBounds(340,460,75,25);
		btnSave.addActionListener(this);
		this.add(btnSave);
		
		partida1 = new Partida(0,50,new Placar("NED","ARG"));
		partida2 = new Partida(0,150,new Placar("CRO","BRA"));
		partida3 = new Partida(0,250,new Placar("ENG","FRA"));
		partida4 = new Partida(0,350,new Placar("MAR","POR"));
		
		this.add(partida1);
		this.add(partida2);
		this.add(partida3);
		this.add(partida4);
		
		setTitle("Bolão de "+ nome);
		setSize(800,540);
		setLayout(null);
		this.setResizable(false);
        this.setVisible(true);
	}
	
	Janela(ArrayList<Partida> partidasList) {
		painelTitulo = new JLabel("Jogo");
		painelTitulo.setFont(new Font(null, Font.BOLD, 20));
		painelTitulo.setBounds(340,0,200,100);
		this.add(painelTitulo);
		
		btnSave = new JButton("Salvar");
		btnSave.setFont(new Font(null, Font.BOLD, 10));
		btnSave.setBounds(340,460,75,25);
		btnSave.addActionListener(this);
		this.add(btnSave);
		
		partida1 = partidasList.get(0);
		partida2 = partidasList.get(1);
		partida3 = partidasList.get(2);
		partida4 = partidasList.get(3);
			
		partida5 = new Partida(0,50,new Placar(partida1.getVencedor(),partida2.getVencedor()));
		partida6 = new Partida(0,200,new Placar(partida3.getVencedor(),partida4.getVencedor()));
		

		this.add(partida5);
		this.add(partida6);

		
		setTitle("Bolão de "+ Nome);
		setSize(800,540);
		setLayout(null);
		this.setResizable(false);
        this.setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		this.dispose();
		ArrayList<Partida> partidas = new ArrayList<Partida>();
		partidas.add(partida1);
		partidas.add(partida2);
		partidas.add(partida3);
		partidas.add(partida4);
		new Janela(partidas);
	}
		}
	


