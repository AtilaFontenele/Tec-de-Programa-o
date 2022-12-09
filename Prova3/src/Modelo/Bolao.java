package Modelo;

public class Bolao {
	private int ID;
	private String Jogador;
	private Placar[] placarQf;
	private Placar[] placarSf;
	private Placar placarF;
	public Bolao(String Jogador) {
		this.Jogador=Jogador;
		placarQf = new Placar[4];
		placarSf = new Placar[2];
	}
	
	public Placar getPlacarF() {
		return placarF;
	}
	
	public String getJogador() {

		return Jogador;
	
	}
	public Placar getPlacarQfIndex(int i) {

		return placarQf[i];
	}
	public Placar getPlacarSfIndex(int i) {

		return placarSf[i];
}
}
