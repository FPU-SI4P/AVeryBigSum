package br.fpu.si.hackerrank;

public class AVeryBigSum {
	public Long bigSum(Long... entradas) {
		
		Long resultado = 0l;
		
		for (Long entrada : entradas) {
			resultado = entrada + resultado;
		}
		
		return resultado;
	}
}
