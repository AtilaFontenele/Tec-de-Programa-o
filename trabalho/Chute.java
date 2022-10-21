package trabalho;

public class Chute {
	public static Gol gol = new Gol();
	private int id;
	private int forca;
	private int quadrante;
	private int posicaox;
	private int posicaoy;
	
	public Chute(int id,int forca,int quadrante,int posicaox,int posicaoy){
		this.quadrante=quadrante;
		this.forca=forca;
		this.posicaox=posicaox;
		this.posicaoy=posicaoy;
		this.id=id;
		gol.modificarGol(posicaox,posicaoy,'*');
	}
	public int getForca(){
		return forca;
	}
	public int getQuadrante(){
		return quadrante;
	}
	public int getPosicaox(){
		return posicaox;
	}
	public int getPosicaoy(){
		return posicaoy;
	}
}
