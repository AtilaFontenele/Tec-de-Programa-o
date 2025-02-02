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
    private JButton btnNew;
    private JButton btnShow;
    private JButton btnImport;
    private JButton btnExport;
	Menu(){
        super("Bol�o TecProg");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,300);
        this.setBackground(Color.BLACK);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 80, 25));


        btnNew = new JButton("Cadastras novo Bol�o");
        btnShow = new JButton("Mostrar Bol�es Cadastrados");
        btnImport = new JButton("Importar Bol�es");
        btnExport = new JButton("Exportar Bol�es");


        btnNew.addActionListener(this);
        btnShow.addActionListener(this);
        btnImport.addActionListener(this);
        btnExport.addActionListener(this);

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
            new Boloes();
        }
        else if(actionEvent.getSource() == btnImport) {
        	this.dispose();
        	new FrameImportado();
        }
        else if(actionEvent.getSource() == btnExport) {
        	this.dispose();
        	new ExportarArquivo();
        }
    }


}
