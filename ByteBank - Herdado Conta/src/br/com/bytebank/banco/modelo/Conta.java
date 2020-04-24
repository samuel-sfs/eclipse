package br.com.bytebank.banco.modelo;
public abstract class Conta  {
	
	/**
	 * Classe representa a moldura de uma conta
	 * 
	 */
	
	
	public double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	/**
	 * Construtor para inicializar o objeto Conta a partir da agencia e numero
	 * 
	 * @param agencia
	 * @param numero
	 */
	

	
	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		
	}
		
	public void saca(double valor) throws SaldoInsificienteException{
		if (this.saldo < valor) {
			throw new SaldoInsificienteException("O saldo:" + this.saldo + ", valor: " + valor);
			} 
		this.saldo -=valor;
	}
		
	public void transfere(double valor, Conta destino) throws SaldoInsificienteException{
		this.saca(valor);
		destino.saldo += valor;
	}
	
		
	
			
	public abstract void  deposita(double valor);
	
	/**
	 * Valor precisa ser menor que o saldo
	 * @return
	 */
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
		
	}
	
	public int getNumero() {
		return numero;
		
	}

	public void setAgencia (int agencia) {
		this.agencia = agencia;
	}
	
	@Override
	public String toString() {
		return "Numero: " + this.getNumero() + this.agencia + this.saldo;
	}
}
