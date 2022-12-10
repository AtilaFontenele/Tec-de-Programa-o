package Janelas;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

import Controle.BolaoDAO;
import Modelo.*;


public class Janela extends JFrame implements ActionListener {
	private JPanel painelTimes;
	private JLabel painelTitulo,Vencedor;
	private JButton botaoVoltar;
	private String Nome;
    private JButton btnSave,btnSave2,btnSave3;
    private Partida partida1,partida2,partida3,partida4,partida5,partida6,partida7;
    Bolao bolao;
    
	Janela(String nome) {
		this.Nome = nome;
		bolao = new Bolao(nome);
		painelTitulo = new JLabel("Quartas de finais");
		painelTitulo.setFont(new Font(null, Font.BOLD, 20));
		painelTitulo.setBounds(290,0,200,100);
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
	
	Janela(ArrayList<Partida> partidasList,Bolao bolao) {
		this.bolao=bolao;
		
		painelTitulo = new JLabel("Semi final");
		painelTitulo.setFont(new Font(null, Font.BOLD, 20));
		painelTitulo.setBounds(320,0,200,100);
		this.add(painelTitulo);
		
		btnSave2 = new JButton("Salvar");
		btnSave2.setFont(new Font(null, Font.BOLD, 10));
		btnSave2.setBounds(340,460,75,25);
		btnSave2.addActionListener(this);
		this.add(btnSave2);
		
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
	Janela(int A,ArrayList<Partida> partidasList,Bolao bolao) {
		this.bolao=bolao;
		painelTitulo = new JLabel("Final");
		painelTitulo.setFont(new Font(null, Font.BOLD, 20));
		painelTitulo.setBounds(340,0,200,100);
		this.add(painelTitulo);
		
		btnSave3 = new JButton("Salvar");
		btnSave3.setFont(new Font(null, Font.BOLD, 10));
		btnSave3.setBounds(340,460,75,25);
		btnSave3.addActionListener(this);
		this.add(btnSave3);
		
		partida5 = partidasList.get(0);
		partida6 = partidasList.get(1);
			
		partida7 = new Partida(0,50,new Placar(partida5.getVencedor(),partida6.getVencedor()));

		this.add(partida7);

		setTitle("Bolão de "+ Nome);
		setSize(800,540);
		setLayout(null);
		this.setResizable(false);
        this.setVisible(true);
	}
	Janela(Partida partida,Bolao bolao)	{
	this.bolao=bolao;
	JLabel iconlabel = new JLabel();
	ImageIcon imagem = new ImageIcon("icones/"+partida.getVencedor()+ ".png");
	iconlabel.setIcon(imagem);
	iconlabel.setBounds(300,75,52,35);
	iconlabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	this.add(iconlabel);
	
	Vencedor= new JLabel("O vencedor do bolão foi : " + partida.getVencedor());
	Vencedor.setFont(new Font(null, Font.BOLD, 20));
	Vencedor.setBounds(0,50,400,100);
	this.add(Vencedor);

	
	botaoVoltar = new JButton("Voltar ao menu");
	botaoVoltar.setFont(new Font(null, Font.BOLD, 10));
	botaoVoltar.setBounds(200,180,150,50);
	botaoVoltar.addActionListener(this);
	this.add(botaoVoltar);
	
	setTitle("Bolão de "+ Nome);
	setSize(600,300);
	setLayout(null);
	this.setResizable(false);
    this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		ArrayList<Partida> partidas = new ArrayList<Partida>();
		if(e.getSource() == btnSave) {
		this.dispose();
		bolao.setPlacarQfIndex(0, partida1.getPlacar());
		bolao.setPlacarQfIndex(1, partida2.getPlacar());
		bolao.setPlacarQfIndex(2, partida3.getPlacar());
		bolao.setPlacarQfIndex(3, partida4.getPlacar());
		partidas.add(partida1);
		partidas.add(partida2);
		partidas.add(partida3);
		partidas.add(partida4);
		new Janela(partidas,bolao);
		}
		if(e.getSource() == btnSave2) {
			this.dispose();
			bolao.setPlacarSfIndex(0, partida5.getPlacar());
			bolao.setPlacarSfIndex(1, partida6.getPlacar());
			partidas.add(partida5);
			partidas.add(partida6);
			new Janela(1,partidas,bolao);
		}
		if(e.getSource() == btnSave3) {
			this.dispose();
			bolao.setPlacarF(partida7.getPlacar());
			partidas.add(partida7);
			new Janela(partida7,bolao);
			
		}
		if(e.getSource() == botaoVoltar) {

		BolaoDAO bolaoDAO = new BolaoDAO();
		bolaoDAO.inserir(bolao);
		this.dispose();
		Menu menu = new Menu();
	}
	}
		}
	


