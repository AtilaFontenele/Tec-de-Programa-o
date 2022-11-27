package Botoes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotaoStop implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}

}
