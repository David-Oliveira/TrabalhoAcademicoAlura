package br.com.bytebank.banco.test;

import java.util.Iterator;

public class TesteString {
	public static void main(String[] args) {
		
		String nome = "Alura"; //objetos da classe String s�o imut�veis e usamos uma sintaxe literal para criar (object literal)
		//String outro = new String ("Alura"); (m� pr�tica)
		String outra = nome.replace("A", "a"); //(object literal)
		
		String vazio = "      Alura     ";
		String outroVazio = vazio.trim();
		
		System.out.println(vazio.contains("Alu"));
		
//		String vazio = "      Alura     ";
//		String outroVazio = vazio.trim();
//		System.out.println(outroVazio);
		
//		System.out.println(nome.length());
//		for (int i = 0; i < nome.length(); i++) {
//			System.out.println(nome.charAt(i));
//		}
		
//		String sub = nome.substring(1);
//		System.out.println(sub);
				
//		int pos = nome.indexOf("ur");
//		System.out.println(pos);
				
//		char c = nome.charAt(2);
//		System.out.println(c);
		
	}
	
}
