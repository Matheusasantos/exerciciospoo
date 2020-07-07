package exercicio1;

public class ContaCorrente extends Conta implements Tributavel{

	public ContaCorrente(double saldo) {
		super(saldo);
	}
	
	@Override
	public void atualiza(double taxa) {
		
		this.saldo += saldo*taxa*2;
	}

	@Override
	public double calcularTributos() {
		return getSaldo()*0.01;
	}
	
}
