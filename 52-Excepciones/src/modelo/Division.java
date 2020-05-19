package modelo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import utilidades.LecturaDatos;

/*
 * @author Nino Casinelli
 */
public class Division {

	private static Logger logger;
	private int numero1, numero2;
	private boolean resultado = false;

	static {
		try {
			logger = LogManager.getLogger(Division.class);
		} catch (Throwable e) {
			System.out.println("Logger Doesn't work");
		}
	}

	public Division() {

	}

	public Division(int numero1, int numero2, boolean resultado, Logger logger) {

		this.numero1 = numero1;
		this.numero2 = numero2;
		this.resultado = resultado;
		Division.logger = logger;
	}

	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}

	public boolean isResultado() {
		return resultado;
	}

	public void setResultado(boolean resultado) {
		this.resultado = resultado;
	}

	public void leerNumeros(int numero1, int numero2) {

		logger.info("Inicio de la aplicacion-----");

		System.out.println("Introduce un número entre 0-10:");

		this.setNumero1(LecturaDatos.leerInteger());

		System.out.println("Introduce otro número entre 0-10:");

		this.setNumero2(LecturaDatos.leerInteger());

	}

	public boolean divisionByZero() {

		double division;

		try {

			logger.trace("Comprobando si funciona el try-catch");
			logger.debug("Valor del denominador: " + numero2);

			if (numero1 >= 0 && numero1 < 11) {

				resultado = true;

				if (numero2 >= 0 && numero2 < 11) {

					resultado = true;
				}
				division = (numero1 / numero2);
				System.out.println("La división es: " + division);
				logger.debug("Valor de la division: " + division);
			}

			else {
				System.out.println("Los números no están dentro del rango");
				resultado = false;
			}

		} catch (ArithmeticException e) {

			// System.out.println("\nAlerta: Algo falla: " + "División " + e.getMessage());
			logger.error("Alerta: Algo falla");
			logger.error("División" + e.getMessage());
		} finally {
			// cuidado. el trace no tiene porque aparecer
			logger.trace("Mensaje en Finally");
			logger.debug("Mensaje en Finally");

		}

		logger.info("Fin de la aplicación");
		return resultado;
	}

	public static Logger getLog() {
		return logger;
	}
}
