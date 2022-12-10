package Janelas;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import Controle.BolaoDAO;

public class ExportarArquivo {
	public ExportarArquivo() {
		String NomeArquivo;
	        JFileChooser fc = new JFileChooser();

	        if (fc.showDialog(null, "Export") == 0) {
	            File file = new File(fc.getSelectedFile().getPath()+".swpt");
	            BolaoDAO BolaoDAO = new BolaoDAO();
	            if(BolaoDAO.ExportarArquivos(file)) {
	                JOptionPane.showMessageDialog(null, "O arquivo foi criado corretamente!", "INFORMATION", JOptionPane.PLAIN_MESSAGE);
	            } else {
	                JOptionPane.showMessageDialog(null, "ERROR!", "INFORMATION", JOptionPane.WARNING_MESSAGE);
	            }
	        }
	        new Menu();
	    }
}
