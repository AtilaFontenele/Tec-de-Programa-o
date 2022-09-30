package laboratorio;

public class Cliente {
	private int id;
	private String nome;
	private int cpf;
	
	public Cliente(int cpf){
		this.cpf=cpf;

	}
	public int getcpf(){
		return this.cpf;
	}
	public void setId(int id){
		if(id>0)
		this.id=id;
	}
	public int getId(){
		return this.id;
	}

	public void setNome(String nome){
		if(nome.length()>=3)
		this.nome=nome;

	}
	public String getNome(){
		return this.nome;
}
}
