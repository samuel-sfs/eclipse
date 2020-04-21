package br.com.bytebank.banco.modelo;
public class ContaPoupanca extends Conta {
	
	
	public ContaPoupanca( int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor) throws SaldoInsificienteException {
		double valorASacar = valor + 1.0;
		System.out.println("Você está sacando R$ " + valorASacar + " da Conta Poupança");
		super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		this.saldo += valor;
		
		
	}

}
