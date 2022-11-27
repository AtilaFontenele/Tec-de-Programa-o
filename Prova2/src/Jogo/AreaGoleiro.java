package Jogo;

import java.util.Random;

public class AreaGoleiro {
		public static double sinal(Chute p1, Pixel p2, Pixel p3) {
			return (p1.getPx() - p3.getPx()) * (p2.getPy() - p3.getPy())
					- (p2.getPx() - p3.getPx()) * (p1.getPy() - p3.getPy());
		}

		public static boolean PontoNoTriangulo(Chute pt) {
			double d1, d2, d3;
			boolean hasNeg, hasPos;
			Random aleatorio = new Random();
			Pixel gpk = new Pixel(8,aleatorio.nextInt(17));
			Pixel lh = new Pixel(aleatorio.nextInt(9),aleatorio.nextInt(9));
			Pixel rh = new Pixel(aleatorio.nextInt(9),aleatorio.nextInt(9)+9);
			d1 = sinal(pt, gpk, lh);
			d2 = sinal(pt, lh, rh);
			d3 = sinal(pt, rh, gpk);

			hasNeg = (d1 < 0) || (d2 < 0) || (d3 < 0);
			hasPos = (d1 > 0) || (d2 > 0) || (d3 > 0);
			return !(hasNeg && hasPos);
		}
	}
