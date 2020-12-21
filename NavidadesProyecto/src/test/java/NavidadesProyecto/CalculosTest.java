package NavidadesProyecto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculosTest {
	private Calculos calculos= new Calculos();
	private int resultadoint;
	private double resultadodouble;
	private int x, y;
	@Test
	public void testsuma() {
		x=4;
		y=7;
		resultadoint=calculos.suma(x,y);
		
		org.junit.Assert.assertEquals(11,resultadoint);
	}
	@Test
	public void testresta() {
		x=4;
		y=7;
		resultadoint=calculos.resta(x,y);
		
		org.junit.Assert.assertEquals(-3,resultadoint);
	}
	@Test
	public void testdivisionDistinto0Divisor() {
		x=4;
		y=7;
		resultadodouble=calculos.division(x,y);
		
		org.junit.Assert.assertEquals(0.57,resultadodouble,0.01);
	}
	@Test
	public void testdivisionIgual0Divisor() {
		x=4;
		y=7;
		resultadodouble=calculos.division(x,y);
		
		org.junit.Assert.assertEquals(-1,resultadodouble,0);
	}

}
