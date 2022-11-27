package Botoes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Painel.Janela;


public class Botao extends JButton{
	private static final long serialVersionUID = 1L;
	
	public Botao(String text,Janela janela) {
		setText(text);
		addActionListener(new BotaoStart(janela));
	}
	
	public Botao(String text,ActionListener actionButton) {
		setText(text);
		addActionListener(actionButton);
	}
}
