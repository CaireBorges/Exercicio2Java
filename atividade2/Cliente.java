package atividade2;

public class Cliente {
	
	private String cpf;
	private String nome;
	
	public Cliente(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
		
	}
	
	@Override
	
	public String toString() {
		
		return "Cpf: '" + this.cpf + '\'' + "\n" + 
		       "Nome: '" + this.nome + '\'';
	}
	
	

}
