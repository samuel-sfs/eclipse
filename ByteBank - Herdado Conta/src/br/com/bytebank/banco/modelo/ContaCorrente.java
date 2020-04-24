package br.com.bytebank.banco.modelo;
public class ContaCorrente extends Conta implements Tributavel {
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor) throws SaldoInsificienteException {
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}
	



	
	public double getValorImposto() {
		return super.saldo * 0.01;
	}

	@Override
	public void deposita(double valor) {
		this.saldo += valor;
		
	}	
	
	@Override
	public String toString() {
		return "Conta Corrente " + super.toString();
	}
	
	
}
