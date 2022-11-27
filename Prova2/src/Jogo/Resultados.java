package Jogo;

import Botoes.*;
import Painel.Janela;
import cenario.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Resultados{
	int defesa;
	int gols;
	Gol gol = new Gol(9,17);
	public int getDefesas() {
		return defesa;
	}
	public int getGols() {
		return gols;
	}
	public void addGols() {
		gols++;
	}
	public void addDef() {
		defesa++;
	}
}
