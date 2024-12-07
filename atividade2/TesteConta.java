package atividade2;

public class TesteConta {
	
	public static void main(String[] args) {
		
		Cliente p = new Cliente("123", "Maria");
		
		System.out.println(p);
		
		Conta c = new Conta(2, 300, p, 1234, 0 );
		
		System.out.println(c);
		
	}
	
	

}
