public class TestaMetodos {
	
	public static void main(String[] args) {
		
		Conta contaDoVinicius = new Conta();
		contaDoVinicius.deposita(500);
		System.out.println(contaDoVinicius.saldo);
		
		contaDoVinicius.saca(50);
		System.out.println(contaDoVinicius.saldo);
		
		Conta contaDaLeticia = new Conta();
		contaDaLeticia.deposita(1500);
		System.out.println(contaDaLeticia.saldo);
		
		contaDaLeticia.transfere(500, contaDoVinicius);
		System.out.println(contaDoVinicius.saldo);
	}
}
