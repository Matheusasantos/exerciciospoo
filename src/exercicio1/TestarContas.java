package exercicio1;

public class TestarContas {

	public static void main(String[] args) {
		
		Conta c = new Conta();
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		
		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);
		
		AtualizarContas abc = new AtualizarContas(0.01);
		
		abc.roda(c);
		abc.roda(cc);
		abc.roda(cp);
		
		System.out.println("Saldo Total: " + abc.getSaldoTotal());
		//System.out.println("");
		//System.out.println("");
		
		
		
	}

}
