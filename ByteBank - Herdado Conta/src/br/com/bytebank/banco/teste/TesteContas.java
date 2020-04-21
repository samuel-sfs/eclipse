package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.especial.ContaEspecial;
import br.com.bytebank.banco.modelo.*;

import br.com.bytebank.banco.teste.*;

public class TesteContas {
	

	
	public static void main(String[] args) throws SaldoInsificienteException {
		
		
		
		ContaEspecial cs = new ContaEspecial (123, 321);
		cs.saldo += 100;
		
		
		ContaCorrente cc = new ContaCorrente( 001, 1010);
		cc.deposita(100);
		
		ContaPoupanca cp = new ContaPoupanca(001, 2020);
	
		cp.deposita(200);
		
		
		
		cc.transfere(50.0, cp);
		cp.saca(10.0);
		cc.saca(50.0);
		
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
		
		
		
	}
	


}
