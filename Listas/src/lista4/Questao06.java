package lista4;

public class Questao06 {
	public static void meiaVida(double massa){
		System.out.println("A massa inicial é :"+massa);
		int temposeg = 0;
		for(;massa>=0.5;massa/=2){
			temposeg+=50;
		}
		int seg=temposeg%60;
		int min=temposeg/60;
		int hr=min/60;
		System.out.println("A massa final é:"+massa);
		System.out.println("segundos:"+seg);
		System.out.println("minutos:"+min);
		System.out.println("horas:"+hr);
	}
	public static void main(String[] args){
		double massa = 999999999;
		meiaVida(massa);
	}
}