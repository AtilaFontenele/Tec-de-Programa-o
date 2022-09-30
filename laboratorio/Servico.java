package laboratorio;

public class Servico {
	private int id;
	private String nome;
	private int valor;
	private String descricao;
	
	public void setId(int id){
		if(id>0)
		this.id=id;
	}
	public int getId(){
		return this.id;
	}

	public void setNome(String nome){
		if(nome.length()>=5)
		this.nome=nome;

	}
	public String getNome(){
		return this.nome;
}
	public void setDesc(String desc){
		if(desc.length()>=10)
		descricao=desc;

	}
	public String getDesc(){
		return descricao;
}
	public void setValor(int valor){
		if(valor>0)
		this.valor=valor;
	}
	public int getValor(){
		return this.valor;
	}
}
