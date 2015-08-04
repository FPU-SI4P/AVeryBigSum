package br.fpu.si.hackerrank;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Before;
import org.junit.Test;

public class AVeryBigSumTest {

	private AVeryBigSum aVeryBigSum;
	
	@Before
	public void setUp(){
		this.aVeryBigSum = new AVeryBigSum();
	}
	
	@Test
	public void somaVazia(){
		assertThat(aVeryBigSum.bigSum(), is(0l));
	}
	
	@Test
	public void somaUnicoNumero(){
		assertThat(aVeryBigSum.bigSum(7l), is(7l));
	}
	
	@Test
	public void somaDoisNumeros(){
		assertThat("A soma de 6 + 5",aVeryBigSum.bigSum(6l,5l), is(11l));
	}
	
	@Test
	public void somaTresNumeros(){
		assertThat(aVeryBigSum.bigSum(6l,5l,9l), is(20l));
	}
	
	@Test
	public void somaComNumeroNegativo(){
		assertThat(aVeryBigSum.bigSum(-6l,5l,9l), is(8l));
	}
}
