package calculadoraBasica;
import static org.junit.Assert.*;
import org.junit.Test;
public class test {

	@Test
	public void testSuma() {
		principal principal = new principal(5f,3f);
		long resultado = (long) principal.sumar();
		long esperado = (long) 8f;
		assertEquals(esperado, resultado);
	}

	
	
	@Test
	public void testResta() {
		principal principal1 = new principal(5f,3f);
		long resultado = (long) principal1.restar();
		long esperado = (long) 2f;
		assertEquals(esperado, resultado);
	}
	
	
	@Test
	public void testMultiplicar() {
		principal principal2 = new principal(5f,3f);
		long resultado = (long) principal2.multiplicar();
		long esperado = (long) 15f;
		assertEquals(esperado, resultado);
	}
	
	
	@Test
	public void testAbsoluto() {
		principal principal3 = new principal(5f,3f);
		long resultado = (long) principal3.absoluto();
		long esperado = (long) 5f;
		assertEquals(esperado, resultado);
	}
	
	
	@Test
	public void testElevar() {
		principal principal4 = new principal(5f,3f);
		long resultado = (long) principal4.elevar();
		long esperado = (long) 125f;
		assertEquals(esperado, resultado);
	}
	
	
	@Test
	public void testPositivo() {
		principal principal5 = new principal(5f,3f);
		boolean resultado = principal5.esPositivo();
		boolean esperado = false;
		assertEquals(esperado, resultado);
	}
}
