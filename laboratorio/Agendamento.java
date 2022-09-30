package laboratorio;

import java.util.Calendar;


public class Agendamento {
	private int id;
	private Calendar data;
	private Cliente cliente;
	private Cabelereiro cabelereiro;
	
	public Agendamento(Cliente cliente, Cabelereiro cabelereiro,Calendar data){
	this.cliente = cliente;
	this.cabelereiro = cabelereiro;
	this.data = data;
	}
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}
	
}
