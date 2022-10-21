package trabalho;
import java.util.*;
public class Gol {
	public  int d=0;
	public int g=0;
	public int f=0;
	public int t1=0;
	public int t2=0;
	public int t3=0;
	private char[][] gol= new char[10][18];
	private Chute chute;
	private Goleiro goleiro;
	ArrayList<Integer> NumGols = new ArrayList<>();
	ArrayList<String> ChutesFora = new ArrayList<>();
//	ArrayList<String> ChutesGol = new ArrayList<>();
//	ArrayList<String> ChutesTrave = new ArrayList<>();
//	ArrayList<String> ChutesCanto = new ArrayList<>();
//	ArrayList<String> ChutesDefesa = new ArrayList<>();
		public Gol() {
			for (int x = 0; x <= 9; x++){
				for (int y = 0; y <= 17; y++){
					//trave
					if((x<=9&&x>1&&y==1)||(x<=9&&x>1&&y==16)) {
					gol[x][y]='|';
					//travessao
					}else if((x==1&&y<=16&&y!=0)) {
						gol[x][y]='-';
					//Fora
					}else if ((x==0&&y<=17)||(x<=9&&y==0)||(x<=9&&y==17)) {
					gol[x][y]='X';
					//Gaveta 
					} else if((x==2&&y==2)||(x==2&&y==15)) {
					gol[x][y]='#';
					//Gol
					} else {
					gol[x][y]='O';
					}
					}
					
				}
			
		}
	
		public void modificarGol(int x, int y, char c) {
			gol[x][y] = c;
		}
		
		public char [][] getGol() {
			return gol;
		}
		public boolean LimQuadr(int quad,int x,int y) {
			if(quad==1){
				if(x<0||x>4||y<0||y>8)
					return true;
				
			}if(quad==2){
				if(x<0||x>4||y<=9||y>17)
					return true;
				
			}if(quad==3){
				if(x<5||x>9||y<0||y>8)
					return true;
				
			}if(quad==4){
				if(x<5||x>9||y<9||y>17)
					return true;
			}
		return false;
		}
		public void ChecarChute(int x ,int y ,Gol gol) {
			
		
			if(gol.getGol()[x][y]=='X')
				f++;

			if(y==1) {
			if(gol.getGol()[x][y]=='|')
				t1++;

		}
			if(y==17) {
			if(gol.getGol()[x][y]=='|')
					t2++;

		}
			if(gol.getGol()[x][y]=='-')
					t3++;
		}
		public int MediaDef(int n,int d) {
			return (d);
		}
		public int MediaGols(int n,int d) {
			return(d);
		}
		public char[][] LimparGol() {
			for (int x = 0; x <= 9; x++){
				for (int y = 0; y <= 17; y++){
					//trave
					if((x<=9&&x>1&&y==1)||(x<=9&&x>1&&y==16)) {
					gol[x][y]='|';
					//travessao
					}else if((x==1&&y<=16&&y!=0)) {
						gol[x][y]='-';
					//Fora
					}else if ((x==0&&y<=17)||(x<=9&&y==0)||(x<=9&&y==17)) {
					gol[x][y]='X';
					//Gaveta 
					} else if((x==2&&y==2)||(x==2&&y==15)) {
					gol[x][y]='#';
					//Gol
					} else {
					gol[x][y]='O';
					}
					}
					
				}
			return gol;
			
		}
}

