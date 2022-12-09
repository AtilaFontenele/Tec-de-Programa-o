package Janelas;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.*;



public class Menu extends JFrame implements ActionListener{
	JPanel painelTimes;
	JLabel painelTitulo;
	JButton botao;
	String Nome;
    static Color blackBasic = new Color(0x202124);
    static Color qatarRed = new Color(0x8a1538);
    private JButton btnNew;
    private JButton btnShow;
    private JButton btnImport;
    private JButton btnExport;
	Menu(){
        super("Bolão TecProg");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,300);
        this.setBackground(blackBasic);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 80, 25));


        btnNew = new JButton("Cadastras novo Bolão");
        btnShow = new JButton("Mostrar Bolões Cadastrados");
        btnImport = new JButton("Importar Bolões");
        btnExport = new JButton("Exportar Bolões");


        btnNew.addActionListener(this);
        btnShow.addActionListener(this);
        btnImport.addActionListener(this);
        btnShow.addActionListener(this);

        this.add(btnNew);
        this.add(btnShow);
        this.add(btnImport);
        this.add(btnExport);

        this.setResizable(false);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource() == btnNew) {
            this.dispose();
            String name = JOptionPane.showInputDialog("Nome do Jogador : ");
            new Janela(name);

        } else if(actionEvent.getSource() == btnShow) {
            this.dispose();
        }
    }


}
