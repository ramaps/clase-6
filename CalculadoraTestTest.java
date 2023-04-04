package Actividad6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTestTest {
	Calculadora NuevaCalculadora;

	public void Caluculo() {
		
	NuevaCalculadora = new Calculadora(); 

	  }
	@Test
	public void prueba1 () {
		assertEquals(240, NuevaCalculadora.multiplicar (80,3),0); 
		
}
	@Test
	public void	prueba2 () {
		
		assertEquals(110, NuevaCalculadora.dividir(NuevaCalculadora.sumar (150,180),3),0);
		
	}
	@Test
	public void	prueba3(){
		assertNotEquals(605, NuevaCalculadora.multiplicar(NuevaCalculadora.restar(90,50),15),0);
		
	}
	
	@Test
	public void	prueba4(){
		assertNotEquals(2700, NuevaCalculadora.multiplicar(NuevaCalculadora.sumar(70,40),25),0);
		
	}
	
	
}