package trabalho;

public class Resultados {
	private static double defesas;
	private static double gols;
	private static int chutesFora;
	private static int chutesTraveEsq;
	private static int chutesTraveSup;
	private static int chutesTraveDir;
	private static int gaveta;
	public static double aux1=0;
	public static int aux2;
	public static double aux3;
	public static double aux5;
	public static String aux4;

	
	public  void VerfChute(int x, int y ,Gol gol) {
		if (gol.getGol()[x][y] == ' ') {
			gol.modificarGol(x,y,'X');
			Resultados.defesas++;
		}else {
				if (gol.getGol()[x][y] == '|' && y==1) {
					Resultados.chutesTraveEsq++;
		}
				if (gol.getGol()[x][y] == '-') {
					Resultados.chutesTraveSup++;
		}
				if (gol.getGol()[x][y] == '|' && y==16) {
					Resultados.chutesTraveDir++;
		}
				if (gol.getGol()[x][y] == 'F') {
					Resultados.chutesFora++;
		}
				if (gol.getGol()[x][y]== 'O') {
					Resultados.gols++;
				}
				if (gol.getGol()[x][y]=='#') {
					Resultados.gaveta++;
				}
				gol.modificarGol(x,y,'*');
		}
			}
		
	
	public double Defs() {
		return Resultados.defesas;
	}
	public double Gols() {
		return Resultados.gols;
	}
	public int ChutesF() {
		return chutesFora;
	}
	public int ChutesTE() {
		return chutesTraveEsq;
	}
	public int ChutesTS() {
		return chutesTraveSup;
	}
	public int ChutesTD() {
		return chutesTraveDir;
	}
	public int GolsGav() {
		return gaveta;
	}
	public String getMelhor(String nome,double def,int forca) {
		
		if(def>Resultados.aux1) {
		Resultados.aux2=forca;
		Resultados.aux1=def;
		Resultados.aux4=nome;
		}else if(def==Resultados.aux1) {
			if(aux2>forca) {
				Resultados.aux4=nome;
			}
		}
		return aux4;
	}
	
	public void LimparMelhor() {
		Resultados.aux1=0;
		Resultados.aux4="";
	}
	public void LimparResultados() {
		Resultados.defesas=0;
		Resultados.gols=0;
		Resultados.chutesFora=0;
		Resultados.chutesTraveEsq=0;
		Resultados.chutesTraveSup=0;
		Resultados.chutesTraveDir=0;
	}
	public double getMelhorDef() {
		return aux1;
		}
	
	}


