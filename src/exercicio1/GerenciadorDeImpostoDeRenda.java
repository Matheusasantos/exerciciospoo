package exercicio1;

public class GerenciadorDeImpostoDeRenda {
	
	private double total;
	
	public void adiciona(Tributavel t) {
		System.out.println("Adicionando Tributavel: " + t);
		this.total += t.calcularTributos();
		
	}
	public double getTotal() {
		return this.total;
	}
}
