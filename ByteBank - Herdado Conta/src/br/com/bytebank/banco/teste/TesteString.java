package br.com.bytebank.banco.teste;

public class TesteString {
	
	public static void main(String[] args) {
		
		String nome = "alura"; //object literal
		String outro = new String("Alura");
		
		System.out.println(nome.toUpperCase());
		
		System.out.println(nome);
		
		nome = nome.replace("u", "U");
		System.out.println(nome);
		
		// StringBuilder é uma classe que otimiza a concatenação da várias Strings
		
		StringBuilder builder = new StringBuilder("Socorram");
		builder.append("-");
		builder.append("me");
		builder.append(", ");
		builder.append("subi ");
		builder.append("no ");
		builder.append("ônibus ");
		builder.append("em ");
		builder.append("Marrocos");
		String texto = builder.toString();
		System.out.println(texto);
		
	}
	
	

}
