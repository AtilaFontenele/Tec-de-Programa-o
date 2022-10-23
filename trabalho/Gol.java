package trabalho;

public class Gol {
	public  int d=0;
	public int g=0;
	public int f=0;
	public int t1=0;
	public int t2=0;
	public int t3=0;
	private char[][] gol= new char[10][18];

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
					gol[x][y]='F';
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
				
			}else if(quad==2){
				if(x<0||x>4||y<=9||y>17)
					return true;
				
			}else if(quad==3){
				if(x<5||x>9||y<0||y>8)
					return true;
				
			}else if(quad==4){
				if(x<5||x>9||y<9||y>17)
					return true;
			}
		return false;
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
					gol[x][y]='F';
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

