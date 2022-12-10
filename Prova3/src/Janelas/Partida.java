package Janelas;

import java.awt.*;

import javax.swing.*;

import Modelo.Placar;

public class Partida extends JPanel{
		JTextField textFieldEsq,textFieldDir;
		JLabel selecao1,selecao2;
		Placar placar;
		Partida(int x, int y,Placar placar){
			this.placar= placar;
			textFieldEsq = new JTextField();
			textFieldEsq.setBounds(160,40,50,25);
			this.add(textFieldEsq);
			
			textFieldDir = new JTextField();
			textFieldDir.setBounds(620,40,50,25);
			this.add(textFieldDir);
			
			this.setBounds(x,y,800,100);
			
			selecao1 = new JLabel("Seleção:   "+placar.getTimeEsq());
			selecao1.setFont(new Font(null, Font.BOLD, 15));
			selecao1.setBounds(0,0,200,100);
			this.add(selecao1);
			
			selecao2 = new JLabel("Seleção:   "+placar.getTimeDir());
			selecao2.setFont(new Font(null, Font.BOLD, 15));
			selecao2.setBounds(450,0,200,100);
			this.add(selecao2);
			
			this.setLayout(null);


			JLabel simbolo = new JLabel("X");
			simbolo.setFont(new Font(null, Font.BOLD, 40));
			simbolo.setBounds(350,0,200,100);
			this.add(simbolo);
			
		}
		public String getVencedor() {
			if(Integer.parseInt(textFieldEsq.getText())>Integer.parseInt(textFieldDir.getText())) {
				return placar.getTimeEsq();
				}
			else
				return placar.getTimeDir();
		}

		public Placar getPlacar() {
			placar.setGolsTimeEsq(Integer.parseInt(textFieldEsq.getText()));
			placar.setGolsTimeDir(Integer.parseInt(textFieldDir.getText()));
			return this.placar;
		}
}
