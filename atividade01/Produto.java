package atividade01;

public class Produto {
	
	private String nome;
	private Data dataDeValidade;
	
	public Produto(String nome,int dia, int mes, int ano) {
		this.nome = nome;
		this.dataDeValidade = new Data(dia,mes,ano);
	}

	@Override
	
	public String toString() {
		return "Nome: '" + this.nome + '\'' + 
			   "\n" + "Data de Validade: '" + this.dataDeValidade + '\'';
	}
}
