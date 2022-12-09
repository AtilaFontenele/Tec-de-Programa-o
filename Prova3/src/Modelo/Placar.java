package Modelo;

public class Placar {
	private String TimeEsq;
	private String TimeDir;
	private int golsTimeEsq;
	private int golsTimeDir;
	public Placar(String timeEsq,String timeDir) {
		this.TimeEsq=timeEsq;
		this.TimeDir=timeDir;
		
	}
	
	public Placar(String timeEsq,String timeDir,int golsTimeEsq,int golsTimeDir) {
		this.TimeEsq=timeEsq;
		this.TimeDir=timeDir;
		this.golsTimeEsq=golsTimeEsq;
		this.golsTimeDir=golsTimeDir;
	}
	public void setTimeEsq(String TimeEsq) {
		this.TimeEsq = TimeEsq;
	}
	public void setTimeDir(String TimeDir) {
		this.TimeDir = TimeDir;
	}
	public void setGolsTimeEsq(int golsTimeEsq) {
		this.golsTimeEsq = golsTimeEsq;
	}
	public void setGolsTimeDir(int golsTimeDir) {
		this.golsTimeDir = golsTimeDir;
	}
	public String getTimeEsq() {
		return TimeEsq;
	}
	
	public String getTimeDir() {
		return TimeDir;
	}
	
	public int getGolsTimeEsq() {
		return golsTimeEsq;
	}
	
	public int getGolsTimeDir() {
		return golsTimeDir;
	}
	

}
