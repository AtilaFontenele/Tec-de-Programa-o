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
}
