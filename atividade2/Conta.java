package atividade2;

public class Conta {
	
	private int numero;
	private Cartao cartao;
	private int senha;
	private double saldo;
	
	public Conta(int numero, int numCartao, Cliente titular, int senha, double saldo ) {
		
		this.numero= numero;
		this.cartao = new Cartao(numCartao, titular);
		this.senha = senha;
		this.saldo = saldo;
	}
	
	public Cartao getCartao() {
		return this.cartao;
	}
	
	public void alteraCartao(int numeroDoCartao, Cliente titular) {
		this.cartao = new Cartao(numeroDoCartao, titular);
	}
	
	 @Override
	    public String toString() {
	        return "Conta{" +
	               "numero=" + numero +
	               ", titular=" + (cartao != null ? cartao.toString() : "null") +
	               ", senha=" + senha +
	               ", saldo=" + saldo +
	               '}';
	    }
	
	

}
