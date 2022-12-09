package Janelas;

import Controle.ConecBanco;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu menu = new Menu();
		ConecBanco conec= new ConecBanco();
				conec.getConnection();
	}

}
