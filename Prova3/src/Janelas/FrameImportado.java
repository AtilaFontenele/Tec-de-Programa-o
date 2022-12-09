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
                JOptionPane.showMessageDialog(null, "Successfully read the file!", "INFORMATION", JOptionPane.PLAIN_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "An error occurred!", "INFORMATION", JOptionPane.WARNING_MESSAGE);
            }
        }
        new Menu();
    }
}