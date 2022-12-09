package Janelas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import Controle.BolaoDAO;
import Modelo.Bolao;
import Modelo.Placar;

public class Boloes extends JFrame implements ActionListener{
    private JPanel tablePanel;
    private JButton btnBack;
    private JTable table;
    private JScrollPane scrollPane;
    
	public Boloes() {
        super("Bolao ON THE DATABASE");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(900, 600);
        this.setBackground(Color.WHITE);
        this.setLayout(null);
        
        String[] columnNames = { "Jogador", "Quartas de final", "Semi final", "Final", "Vencedor" };
        ArrayList<Bolao> bolaoList = new BolaoDAO().findAll();
        Object[][] data = new Object[bolaoList.size()][5];
        int index = 0;
        for(Bolao bolao : bolaoList)  {
            data[index][0] = bolao.getJogador().toUpperCase();
            data[index][1] = bolao.PlacarQfString();
            data[index][2] = bolao.PlacarSfString();
            data[index][3] = bolao.PlacarFString();
            data[index][4] = bolao.getPlacarF().Vencedor();
            index++;
        }

        table = new JTable(data, columnNames);
        table.setPreferredScrollableViewportSize(new Dimension(500, 300));
        table.setFillsViewportHeight(true);
    
	
        table.setRowHeight(100);

        // Create the scroll pane and add the table to it.
        JScrollPane scrollPane = new JScrollPane(table);


        // Add the scroll pane to this panel.
        tablePanel = new JPanel(new GridLayout(1, 0));
        tablePanel.setBounds(100, 25, 700, 500);
        tablePanel.add(scrollPane);
        
        // Creating the Button Back to Main Menu
        btnBack = new JButton("BACK TO MAIN MENU");
        btnBack.setBounds(350, 530, 200, 30);
        btnBack.setBackground(Color.blue);
        btnBack.setForeground(Color.white);
        btnBack.setFocusable(false);
        btnBack.addActionListener(this);
        
        this.add(btnBack);
        this.add(tablePanel);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
