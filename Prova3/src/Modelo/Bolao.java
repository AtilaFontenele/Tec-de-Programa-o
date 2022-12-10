package Modelo;

import java.io.File;

import javax.swing.JFileChooser;

public class Bolao {
	private int ID;
	private String Jogador;
	private Placar[] placarQf;
	private Placar[] placarSf;
	private Placar placarF;

	public Bolao(int ID, String nome) {
		this.Jogador = nome;
		this.ID = ID;
		placarQf = new Placar[4];
		placarSf = new Placar[2];
	}

	public Bolao(String Jogador) {
		this.Jogador = Jogador;
		placarQf = new Placar[4];
		placarSf = new Placar[2];
	}

	public String getJogador() {

		return Jogador;
	}

	public Placar getPlacarF() {
		return placarF;
	}

	public Placar[] getPlacarQF() {
		return placarQf;
	}

	public Placar[] getPlacarSF() {
		return placarSf;
	}

	public Placar getPlacarQfIndex(int i) {
		return placarQf[i];
	}

	public Placar getPlacarSfIndex(int i) {

		return placarSf[i];
	}

	public void setPlacarF(Placar placarF) {
		this.placarF = placarF;
	}

	public void setPlacarQfIndex(int i, Placar placarQf) {
		this.placarQf[i] = placarQf;
	}

	public void setPlacarSfIndex(int i, Placar placarSf) {
		this.placarSf[i] = placarSf;
	}
	
	public String PlacarQfString() {
        String pattern = " %s %d X %s %d<br>";
        String result="<html>";
        for (Placar placar : placarQf) {
            result+=String.format(pattern, placar.getTimeEsq(),placar.getGolsTimeEsq(),placar.getTimeDir(),placar.getGolsTimeDir());
        }
        return result+"</html>";
    }
	public String PlacarSfString() {
        String pattern = " %s %d X %s %d<br>";
        String result="<html>";
        for (Placar placar : placarSf) {
            result+=String.format(pattern, placar.getTimeEsq(),placar.getGolsTimeEsq(),placar.getTimeDir(),placar.getGolsTimeDir());
        }
        return result+"</html>";
    }
	public String PlacarFString() {
        String pattern = " %s %d X %s %d<br>";
        String result="<html>";
            result+=String.format(pattern, placarF.getTimeEsq(),placarF.getGolsTimeEsq(),placarF.getTimeDir(),placarF.getGolsTimeDir());
        return result+"</html>";
    }

    public String ArquivoStringQF(int i){
        return String.format("%s;%d;%s;%d",
                placarQf[i].getTimeEsq(),placarQf[i].getGolsTimeEsq(),placarQf[i].getTimeDir(),placarQf[i].getGolsTimeDir());
}
    public String ArquivoStringSF(int i){
        return String.format("%s;%d;%s;%d",
                placarSf[i].getTimeEsq(),placarSf[i].getGolsTimeEsq(),placarSf[i].getTimeDir(),placarSf[i].getGolsTimeDir());
    }
    public String ArquivoStringF(){
        return String.format("%s;%d;%s;%d",
                placarF.getTimeEsq(),placarF.getGolsTimeEsq(),placarF.getTimeDir(),placarF.getGolsTimeDir());

}
}
