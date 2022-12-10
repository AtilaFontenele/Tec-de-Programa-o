package Janelas;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import Controle.BolaoDAO;

public class FrameImportado {

    public FrameImportado() {
        JFileChooser fc = new JFileChooser();

        if (fc.showDialog(null, "Import") == 0) {
            File file = fc.getSelectedFile();

            BolaoDAO bolaoDAO = new BolaoDAO();

            if(bolaoDAO.importFromFile(file)) {
                JOptionPane.showMessageDialog(null, "O arquivo foi lido corretamente!", "INFORMATION", JOptionPane.PLAIN_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "ERROR!", "INFORMATION", JOptionPane.WARNING_MESSAGE);
            }
        }
        new Menu();
    }
}