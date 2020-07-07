package exercicio1;

public class TestarContas {

	public static void main(String[] args) {
		
		Conta c = new Conta(100);
		Conta cc = new ContaCorrente(100);
		Conta cp = new ContaPoupanca(100);
		
		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);
		
		AtualizarContas abc = new AtualizarContas(0.01);
		
		abc.roda(c);
		abc.roda(cc);
		abc.roda(cp);
		
		System.out.println("Saldo Total: " + abc.getSaldoTotal());					
	}

}
