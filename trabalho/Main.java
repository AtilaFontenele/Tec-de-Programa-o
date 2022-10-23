package trabalho;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;



public class Main {
	public static Gol gol = new Gol();
	public static ArrayList<Chute> Tab_Chutes;
	public static ArrayList<Goleiro>Tab_Goleiros;
	public static ArrayList<Time> Tab_Times;
	
	public static void Chutes() {
		int quant,id,forca,quadr,px,py;
		File arquivo;
		Scanner LerArquivo;
		Tab_Chutes = new ArrayList<Chute>();
		
		try {
			arquivo = new File("Tab_Chutes.txt");
			LerArquivo = new Scanner(arquivo);
			quant = LerArquivo.nextInt();
			
			for(int i = 0; i< quant;i++) {
				id=LerArquivo.nextInt();
				forca=LerArquivo.nextInt();
				quadr=LerArquivo.nextInt();
				px=LerArquivo.nextInt();
				py=LerArquivo.nextInt();
			
			Tab_Chutes.add(new Chute(id,forca,quadr,px,py));
			}
		LerArquivo.close();
	}catch ( FileNotFoundException e ) {
		System.out.println("Ocorreu um erro.");
		e.printStackTrace();
	}
	}
	public static void Goleiros() {
		int quant,id,vel,flex,agi,coord,forca,equi;
		String NomeGoleiro1, NomeGoleiro2;
		File Arquivo;
		Scanner LerArquivo;
		Tab_Goleiros = new ArrayList<Goleiro>();
		
		try {
			Arquivo = new File("Tab_Goleiros.txt");
			LerArquivo = new Scanner(Arquivo);
			quant = LerArquivo.nextInt();
			
			for(int i = 0; i< quant;i++) {
				id=LerArquivo.nextInt();
				NomeGoleiro1=LerArquivo.next().toString();
				NomeGoleiro2=LerArquivo.next().toString();
				vel=LerArquivo.nextInt();
				flex=LerArquivo.nextInt();
				agi=LerArquivo.nextInt();
				coord=LerArquivo.nextInt();
				forca=LerArquivo.nextInt();
				equi=LerArquivo.nextInt();
			
			Tab_Goleiros.add(new Goleiro(id,NomeGoleiro1+ " " +NomeGoleiro2,vel,flex,agi,coord,forca,equi));
			}
		LerArquivo.close();
	}catch ( FileNotFoundException e ) {
		System.out.println("Ocorreu um erro.");
		e.printStackTrace();
	}
	}
		public static void Times() {
			Time Italia= new Time(1,"Italia");
			Time Argentina= new Time(2,"Argentina");
			Time Brasil= new Time (3," Brasil");
			Time Belgica= new Time (4,"Belgica");
			Time Alemanha= new Time(5,"Alemanha");
			Time Portugal= new Time (6,"Portugal");
			Tab_Times = new ArrayList<Time>();
			Tab_Times.add(Italia);
			Tab_Times.add(Argentina);
			Tab_Times.add(Brasil);
			Tab_Times.add(Belgica);
			Tab_Times.add(Alemanha);
			Tab_Times.add(Portugal);
			
			int j=0;
			
			for(Time time : Tab_Times) {
				for(int i = 0; i<4; i++) {
					time.addGoleiro(Tab_Goleiros.get(j));
					j++;
				}
			}
		}
	
	public static void main(String args[]){
		Chutes();
		Goleiros();
		Times();
		Resultados r= new Resultados();
	

		for (Time t : Tab_Times) {
			System.out.println("MUDOU DE TIME");
			for (Goleiro g : t.getGoleiros()) {
				for(Chute c : Tab_Chutes) {
					System.out.println("Goleiro: "+g.getNome());
					System.out.println("Time: "+t.getTime());
					Imprimir.imprimirM(g.AreaDef(g.AAG(),g.PGoleiroX(c),g.PGoleiroY(c),gol,c));
					
					gol.LimparGol();
				}
				System.out.println(" ");
				Imprimir.imprimir(g.getNome(),t.getTime(),g.getId());
				Imprimir.imprimirResultChutes(r.GolsGav(),r.ChutesF(),r.ChutesTE(),r.ChutesTS(),r.ChutesTD(),Math.round(10*r.Gols()/3),Math.round(10*r.Defs()/3),g.AAG(),r.Gols(),r.Defs());
				
				System.out.println("O melhor goleiro do time "+t.getTime()+" e o "+r.getMelhor(g.getNome(),r.Defs(),g.getForca()));
				
				r.LimparResultados();
			}
			r.LimparMelhor();
		}
		

}
	
}