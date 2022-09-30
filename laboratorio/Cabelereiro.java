package laboratorio;

public class Cabelereiro {
	private int id;
	private String nome;
	private int cpf;
	
	public Cabelereiro(int cpf,String nome){
		this.cpf=cpf;
		if(nome.length()>=3)
			this.nome=nome;

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

	public String getNome(){
		return this.nome;
}
}