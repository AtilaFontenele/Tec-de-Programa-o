package Questao5;

import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Janela extends JFrame implements ActionListener{

	JLabel label;
	JButton botao;
	JComboBox comboBox;
	JTextField texto;

	public Janela() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(620, 220);

		label = new JLabel("Values:");
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setBounds(20, 40, 160, 40);

		texto = new JTextField();
		texto.setBounds(200, 40, 160, 40);
		texto.setHorizontalAlignment(JTextField.CENTER);

		String[] operations = { "Soma", "Multiplicacao" };

		comboBox = new JComboBox<Object>(operations);
		comboBox.setBounds(200, 120, 160, 40);

		botao = new JButton("Calcular");
		botao.setBounds(420, 120, 160, 40);
		botao.addActionListener(this);

		this.add(label);
		this.add(texto);
		this.add(comboBox);
		this.add(botao);

		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String msg = "";
		if(comboBox.getSelectedItem() == "Soma") {
			msg=String.format("O resultado da soma %d + %d = %d.",Integer.parseInt(texto.getText())%10,(Integer.parseInt(texto.getText())-Integer.parseInt(texto.getText())%10)/10,somarCombo(Integer.parseInt(texto.getText())));
		} else if(comboBox.getSelectedItem() == "Multiplicacao") {
			msg=String.format("O resultado da multiplicacao %d X %d = %d.",Integer.parseInt(texto.getText())%10,(Integer.parseInt(texto.getText())-Integer.parseInt(texto.getText())%10)/10,multiplicarCombo(Integer.parseInt(texto.getText())));
		}
		JOptionPane.showMessageDialog(null, msg, "Result", JOptionPane.INFORMATION_MESSAGE, null);
	}

	public int somarCombo(int num) {
		int num1 = num/10;
		int num2 = num%10;
		int soma = num1 + num2;
		
		return soma;
	}
	
	public int multiplicarCombo(int num) {
		int num1 = num/10;
		int num2 = num%10;
		int resultado = num1 * num2;
		
		return resultado;
	}
}
