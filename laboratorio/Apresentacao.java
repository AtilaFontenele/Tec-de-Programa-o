package laboratorio;
import java.util.*;
public class Apresentacao {


		public static void main(String[] args) {
			Scanner input = new Scanner(System.in); 
			Scanner input1 = new Scanner(System.in); 
			
			Calendar data = Calendar.getInstance();
			System.out.println(data.getTime());
			System.out.println("Informe o cpf do cliente");
			Cliente cliente1 = new Cliente(input.nextInt());
			System.out.println("Informe o cpf do cliente");
			Cliente cliente2 = new Cliente(input.nextInt());
			System.out.println("Informe o cpf do cliente");
			Cliente cliente3 = new Cliente(input.nextInt());
			System.out.println("Informe o Id do cliente");
			cliente1.setId(input.nextInt());
			System.out.println("Informe o Id do cliente");
			cliente2.setId(input.nextInt());
			System.out.println("Informe o Id do cliente");
			cliente3.setId(input.nextInt());
			System.out.println("Informe o nome do cliente");
			cliente1.setNome(input.next());
			System.out.println("Informe o nome do cliente");
			cliente2.setNome(input.next());
			System.out.println("Informe o nome do cliente");
			cliente3.setNome(input.next());

			
			Servico servico1 = new Servico();
			Servico servico2 = new Servico();
			Servico servico3 = new Servico();
			System.out.println("Informe o Id do serviço");
			servico1.setId(input.nextInt());
			System.out.println("Informe o Id do serviço");
			servico2.setId(input.nextInt());
			System.out.println("Informe o Id do serviço");
			servico3.setId(input.nextInt());
			System.out.println("Informe o Nome do serviço");
			servico1.setNome(input.next());
			System.out.println("Informe o Nome do serviço");
			servico2.setNome(input.next());
			System.out.println("Informe o Nome do serviço");
			servico3.setNome(input.next());
			System.out.println("Informe a Descriçao  do serviço");
			servico1.setDesc(input.next());
			System.out.println("Informe a Descriçao do serviço");
			servico2.setDesc(input.next());
			System.out.println("Informe a Descriçao do serviço");
			servico3.setDesc(input.next());
			System.out.println("Informe o valor do serviço");
			servico1.setValor(input.nextInt());
			System.out.println("Informe o valor do serviço");
			servico2.setValor(input.nextInt());
			System.out.println("Informe o valor do serviço");
			servico3.setValor(input.nextInt());

			
			System.out.println("Informe o cpf do cabelereiro");
			int cpf1 = input.nextInt(); 
			System.out.println("Informe o nome do cabelereiro");
			String nome1 = input.next(); 
			Cabelereiro cabelereiro1 = new Cabelereiro(cpf1,nome1);
			System.out.println("Informe o cpf do cabelereiro");
			int cpf2 = input.nextInt(); 
			System.out.println("Informe o nome do cabelereiro");
			String nome2 = input.next(); 
			Cabelereiro cabelereiro2 = new Cabelereiro(cpf2,nome2);
			System.out.println("Informe o cpf do cabelereiro");
			int cpf3 = input.nextInt(); 
			System.out.println("Informe o nome do cabelereiro");
			String nome3 = input.next(); 
			Cabelereiro cabelereiro3 = new Cabelereiro(cpf3,nome3);
			System.out.println("Informe o Id do cabelereiro");
			cabelereiro1.setId(input.nextInt());
			System.out.println("Informe o Id do cabelereiro");
			cabelereiro2.setId(input.nextInt());
			System.out.println("Informe o Id do cabelereiro");
			cabelereiro3.setId(input.nextInt());

			
			Agendamento agendamento1 = new Agendamento(cliente1 , cabelereiro1,data);
			Agendamento agendamento2 = new Agendamento(cliente2 , cabelereiro2,data);
			Agendamento agendamento3 = new Agendamento(cliente3 , cabelereiro3,data);
			System.out.println("Informe o Id do agendamento");
			agendamento1.setId(input.nextInt());
			System.out.println("Informe o Id do agendamento");
			agendamento2.setId(input.nextInt());
			System.out.println("Informe o Id do agendamento");
			agendamento3.setId(input.nextInt());
			System.out.println(agendamento1.getId());
			System.out.println(agendamento2.getId());
			System.out.println(agendamento3.getId());
			
			Atendimento atendimento1 = new Atendimento(cliente1,cabelereiro1);
			Atendimento atendimento2 = new Atendimento(cliente2,cabelereiro2);
			Atendimento atendimento3 = new Atendimento(cliente3,cabelereiro3);
			atendimento1.addServ(servico1);
			atendimento2.addServ(servico2);
			atendimento3.addServ(servico3);
			
			System.out.println(atendimento1.imprimir());
			System.out.println(atendimento2.imprimir());
			System.out.println(atendimento3.imprimir());
			input.close();
			input1.close();
	}
	}