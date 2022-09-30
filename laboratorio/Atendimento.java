package laboratorio;
import java.util.*;

public class Atendimento {
	private Cliente cliente;
	private Calendar data;
	private Cabelereiro cabelereiro;
	private ArrayList<Servico> listaServ = new ArrayList<Servico>();

	
	public Atendimento(Cliente cliente, Cabelereiro cabelereiro){
		this.cliente = cliente;
		this.data= Calendar.getInstance();
		this.cabelereiro = cabelereiro;
		listaServ = new ArrayList<Servico>();
		
	}
	public void setListServ(ArrayList<Servico> lista) {
		listaServ = lista;
	}
	
	public void addServ(Servico servico){
		listaServ.add(servico);
	}
	public String imprimir() {
		String saida = "";

		saida += "----------------------------------------------------\n";
		saida += "\n******* Cliente:  *******";
		saida += "\n id: " + this.cliente.getId();
		saida += "\n Nome: " + this.cliente.getNome();
		saida += "\n CPF:  " + this.cliente.getcpf();

		saida += "\n\n*******  Cabeleiro:  *******  ";
		saida += "\n id: " + this.cabelereiro.getId();
		saida += "\n Nome: " + this.cabelereiro.getNome();
		saida += "\n CPF:  " + this.cabelereiro.getcpf();

		saida += "\n\n*******  Servicos:  *******  ";
		for (Servico servico : listaServ) {
			saida += "\n id: " + servico.getId();
			saida += "\n nome: " + servico.getNome();
			saida += "\n descricao: " + servico.getDesc();
			saida += "\n valor: " + servico.getValor() + "\n";
		}

		saida += "----------------------------------------------------";

		return saida;
	}
}
