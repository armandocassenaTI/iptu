package testes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import src.calculo.Simulador;



public class TesteIptu	 {
	
	
	private Simulador simulador;
	
	@Before
	public void setUp() {
		this.simulador = new Simulador();
		
	}
	@Test 
	public void CalcularIptu(){
		double res = Simulador.calcularIPTU("1", 95450.00 , 0);
				double valorEsperado = 572.70;
		assertEquals(valorEsperado, res,0);
	


}
	@Test 
	public void CalcularIptu2(){
		double res = Simulador.calcularIPTU("1",  180000.00 , 0);
				double valorEsperado =  1164.55;
		assertEquals(valorEsperado, res,0);
	


}
	@Test 
	public void CalcularIptu3(){
		double res = Simulador.calcularIPTU("3",   430000.00 , 0);
				double valorEsperado =   6881.90;
		assertEquals(valorEsperado, res,0);
	
}
	@Test 
	public void CalcularIptu4(){
		double res = Simulador.calcularIPTU("2", 35793.00 , 0);
				double valorEsperado =   429.526;
		assertEquals(valorEsperado, res,0.1);
	
}
	@Test 
	public void CalcularIptu5(){
		double res = Simulador.calcularIPTU("3", 47724.00 , 0);
				double valorEsperado =   477.24;
		assertEquals(valorEsperado, res,0.1);
	
}
}