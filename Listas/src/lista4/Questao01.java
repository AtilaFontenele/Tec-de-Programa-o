package lista4;
import java.util.*;

public class Questao01 {
	public static double impostoBruto(double salarioMin,double salario){
		if(salario>salarioMin*12)
			return salario*(2/10);
	 else if(salario>salarioMin*5){
		return salario*(8/100);
	}else
		return 0;
}
	
	public static double salarioLiq(double salarioMin,double salario,double dependentes,double taxa){
		double salarioFinal=impostoBruto(salarioMin,salario)-(dependentes * (2 / 100 * (salario - impostoBruto(salarioMin, salario))))
				+ (4 / 100 * impostoBruto(salarioMin, salario))-taxa;
		return salarioFinal;
	}
	
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.printf("Insira o salario minimo:");
	double salarioMin=input.nextDouble();
	System.out.printf("Insira o numero de dependentes:");
	int dependentes=input.nextInt();
	System.out.printf("Insira o salario do funcionario?");
	double salario=input.nextDouble();
	System.out.printf("Insira a taxa ja paga:");
	double taxa=input.nextDouble();
	System.out.printf("Imposto a ser pago:"+salarioLiq(salarioMin, salario, dependentes, taxa)+" R$");
	input.close();
	}
}