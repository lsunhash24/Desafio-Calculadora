package cl.desfiolatam;

public class Calculadora {
	
	
	// m�todo sumar
	public int sumar(int a, int b) {

		return a + b;
	}
	
	// m�todo restar
	public int restar(int a, int b) {

		return a - b;
	}
	
	// m�todo multiplicar
	public int multiplicar(int a, int b) {

		return a * b;
	}
	
	// m�todo dividir
	public float dividir(float a, float b) {

		try {
			if (b == 0) {

				System.out.println("Divisor debe ser distinto de 0");
				
			} else {

			}

		} catch (ArithmeticException e) {
			System.out.println("Error al dividir por 0");
		}

		return a / b;
	}

}
