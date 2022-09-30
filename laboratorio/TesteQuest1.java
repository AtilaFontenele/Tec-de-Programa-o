package laboratorio;
import java.util.*;

public class TesteQuest1 {

	public static void main(String[] args) {
		
		Calendar data = Calendar.getInstance();
		System.out.println(data.getTime());
		Cliente cliente1 = new Cliente(123456);
		Cliente cliente2 = new Cliente(234567);
		Cliente cliente3 = new Cliente(345678);
		cliente1.setId(1);
		cliente2.setId(2);
		cliente3.setId(3);
		cliente1.setNome("jose");
		cliente2.setNome("Carlos");
		cliente3.setNome("Lucas");
		
		Servico servico1 = new Servico();
		Servico servico2 = new Servico();
		Servico servico3 = new Servico();

		servico1.setId(1);
		servico2.setId(2);
		servico3.setId(3);

		servico1.setNome("asdfadsfasdf");
		servico2.setNome("asdfasdfaasdfaa");
		servico3.setNome("asfasfdsfadf");

		servico1.setDesc("sdfasfasfasdfsdf");

		servico2.setDesc("asdfasfasfdsfs");
		servico3.setDesc("werweekfefsdfa");


		Cabelereiro cabelereiro1 = new Cabelereiro(1234455,"Maria");
		Cabelereiro cabelereiro2 = new Cabelereiro(123411234,"Pedro"); 
		Cabelereiro cabelereiro3 = new Cabelereiro(1234132134,"Mario");
		cabelereiro1.setId(1);
		cabelereiro2.setId(2);
		cabelereiro3.setId(3);

		
		Agendamento agendamento1 = new Agendamento(cliente1 , cabelereiro1,data);
		Agendamento agendamento2 = new Agendamento(cliente2 , cabelereiro2,data);
		Agendamento agendamento3 = new Agendamento(cliente3 , cabelereiro3,data);
		agendamento1.setId(1);
		agendamento2.setId(2);
		agendamento3.setId(3);

		
		Atendimento atendimento1 = new Atendimento(cliente1,cabelereiro1);
		Atendimento atendimento2 = new Atendimento(cliente2,cabelereiro2);
		Atendimento atendimento3 = new Atendimento(cliente3,cabelereiro3);
		atendimento1.addServ(servico1);
		atendimento2.addServ(servico2);
		atendimento3.addServ(servico3);
		System.out.println(atendimento1.imprimir());
		System.out.println(atendimento2.imprimir());
		System.out.println(atendimento3.imprimir());
		
}
}
