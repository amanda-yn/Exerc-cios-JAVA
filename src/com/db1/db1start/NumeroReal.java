package com.db1.db1start;

public class NumeroReal {
	public static double menorValor2(Double numero1, Double numero2) {
		if (numero1 < numero2) {
			return numero1;
		}
		else if (numero2 < numero1) {
			return numero2;
		}
		else if (numero1 == numero2) {
			System.out.println("OS NUMEROS SÃO IGUAIS");
		}
		return 0;
		
	}
	
	public static double menorValor3(Double numero1, Double numero2, Double numero3) {
		if (numero1 < numero2 && numero1 < numero2) {
			return numero1;
		}
		else if (numero2 < numero1 && numero2 < numero3) {
			return numero2;
		}
		else if (numero3 < numero1 && numero3 < numero2) {
			return numero3;
		}
		else if ((numero1 == numero2) && (numero1 == numero3)) {
			System.out.println("OS NUMEROS SAO IGUAIS");
		}
		return 0;
	}
}
