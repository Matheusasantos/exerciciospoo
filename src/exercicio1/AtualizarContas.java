package exercicio1;

public class AtualizarContas {
	
	private double saldoTotal = 0;
	private double selic;
	
	public AtualizarContas(double selic) {
		this.selic = selic;		
	}

	public void roda(Conta c) {		
		
		System.out.println("Saldo Anterior: " + c.getSaldo());
		c.atualiza(selic);
		System.out.println("Saldo Final: " + c.getSaldo());
		saldoTotal += c.getSaldo();
	}
	
	public double getSaldoTotal() {
		return saldoTotal;
	}

}
