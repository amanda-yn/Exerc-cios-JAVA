package com.db1.db1start;

public class Texto {
	
	public static String letrasMaiusculas(String texto1) {
		return texto1.toUpperCase();
	}
	
	public static String letrasMinusculas(String texto1) {
		return texto1.toLowerCase();
	}
	
	public static int quantidadeDeCaracteres(String texto1) {
		if (texto1 != null) {
			return texto1.length();
		}
		else {
			return 0;
		}
	}
}
