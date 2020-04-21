package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*; 

public class TesteTributavel {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(01,123);
		cc.deposita(100);
		
		SeguroDeVida sv = new SeguroDeVida();
		
		CalculadorDeImposto  calc = new CalculadorDeImposto();
		calc.registra(sv);
		calc.registra(cc);
		
		System.out.println(calc.getTotalImposto());
		

	}

}
