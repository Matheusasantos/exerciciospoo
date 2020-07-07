package Teste;

import exercicio1.ContaCorrente;
import exercicio1.GerenciadorDeImpostoDeRenda;
import exercicio1.SeguroDeVida;

public class TesteTributavel {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(100);
		System.out.println(cc.getSaldo());
		
		SeguroDeVida sgv = new SeguroDeVida();
		
		GerenciadorDeImpostoDeRenda girenda = new GerenciadorDeImpostoDeRenda();
		
		girenda.adiciona(cc);
		girenda.adiciona(sgv);
		
		System.out.println(girenda.getTotal());
		
	}

}
