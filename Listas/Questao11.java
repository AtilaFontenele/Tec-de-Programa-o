package lista2;

public class Questao11 {

	public static void main(String[] args) {
	int i=0;
	int j=0;
	int a=0;
	for(i=0;i<=3;i++) {
		for(a=0;a<5;a++) {
			if(a%2==0)
				j=0;
				else
					j=1;
			if(a==4)
				j=2;			
		
		System.out.println(i + " - "+ j + "\n");
	}

	}

}
}