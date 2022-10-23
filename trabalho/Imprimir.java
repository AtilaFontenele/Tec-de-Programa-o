package trabalho;

public class Imprimir {
	public static void imprimirM(char[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
                System.out.println(" ");
	}

}
	public static void imprimir(String goleiro,String time,int id) {
		System.out.println("O goleiro "+ goleiro +"de id "+id+ " do time "+
				time+" obteve os seguintes resultados: ");
	}
	public static void imprimirResultChutes(int gav,int cf,int cte,int cts,int ctd,double g,double d,int aag,double g1,double d1) {
		System.out.println("A AAG do goleiro é de : "+aag);
		System.out.println("A media de gols foi de : "+g+"%");
		System.out.println("A media de defesas foi de : "+d+"%");
		System.out.println("O numero de gols recebido foi de : "+g1);
		System.out.println("O numero de defesas foi de : "+d1);
		System.out.println("O numero de chutes nao defendidos fora foi de : "+ cf);
		System.out.println("O numero de chutes nao defendidos na trave esquerda foi de : "+cte);
		System.out.println("O numero de chutes nao defendidos na trave superior foi de : "+cts);
		System.out.println("O numero de chutes nao defendidos na trave direita foi de : "+ctd);
		System.out.println("O numero de gols na gaveta foi de :"+gav);
		System.out.println(" ");
		
	}
}
