package Questao4;



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;


import javax.swing.*;

public class Janela extends JFrame implements ActionListener {

	JLabel labelTop, labelMax, labelMin, labelMedia;
	JTextField textoAdd, textoMax, textoMin, textoMedia;
	JButton botaoOK, botaoShow;
	ArrayList<Integer> numeros;

	public Janela() {

		numeros = new ArrayList<Integer>();

		botaoOK = new JButton("OK");
		botaoOK.setBounds(300, 100, 160, 40);
		botaoOK.addActionListener(this);

		textoAdd = new JTextField();
		textoAdd.setBounds(140, 100, 160, 40);
		textoAdd.setHorizontalAlignment(JTextField.CENTER);

		textoMax = new JTextField();
		textoMax.setBounds(200, 200, 160, 40);
		textoMax.setHorizontalAlignment(JTextField.CENTER);

		textoMin = new JTextField();
		textoMin.setBounds(200, 260, 160, 40);
		textoMin.setHorizontalAlignment(JTextField.CENTER);

		textoMedia = new JTextField();
		textoMedia.setBounds(200, 320, 160, 40);
		textoMedia.setHorizontalAlignment(JTextField.CENTER);

		labelTop = new JLabel("Digite um numero:");
		labelTop.setHorizontalAlignment(JLabel.CENTER);
		labelTop.setBounds(80, 40, 240, 60);

		labelMax = new JLabel("Max >>>");
		labelMax.setHorizontalAlignment(JLabel.CENTER);
		labelMax.setBounds(40, 200, 160, 40);

		labelMin = new JLabel("Min >>>");
		labelMin.setHorizontalAlignment(JLabel.CENTER);
		labelMin.setBounds(40, 260, 160, 40);

		labelMedia = new JLabel("Media >>>");
		labelMedia.setHorizontalAlignment(JLabel.CENTER);
		labelMedia.setBounds(40, 320, 160, 40);
		
		botaoShow = new JButton("EXIBIR");
		botaoShow.setBounds(400, 260, 160, 40);
		botaoShow.addActionListener(this);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(new Dimension(800, 500));
		this.setResizable(false);
		this.setLayout(null);
		this.setBackground(Color.white);
		this.setVisible(true);

		this.add(labelTop);
		this.add(labelMax);
		this.add(labelMedia);
		this.add(labelMin);

		this.add(textoAdd);
		this.add(textoMax);
		this.add(textoMin);
		this.add(textoMedia);

		this.add(botaoOK);
		this.add(botaoShow);
	}

	private String getMedia() {

		Integer soma = 0;
		for (Integer x : numeros) {
			soma += x;
		}
		Double media = soma / ((1.0) * numeros.size());
		return String.format("%.2f", media);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource().equals(botaoOK)) {
			if (!textoAdd.getText().isEmpty()) {
					numeros.add(Integer.parseInt(textoAdd.getText()));
					textoAdd.setText("");

			}

		} else if (e.getSource().equals(botaoShow)) {
			if (!numeros.isEmpty()) {
				textoMax.setText(Collections.max(numeros).toString());
				textoMin.setText(Collections.min(numeros).toString());
				textoMedia.setText(this.getMedia());
			}
		}

	}

}

