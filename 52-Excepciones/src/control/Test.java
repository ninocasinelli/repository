package control;
import modelo.Division;
/*
 * @author Nino Casinelli
 */
public class Test {

	public static void prueba1() {
		
		int num1 = 0; 
		int num2 = 0;
		Division num=new Division();
		
		num.leerNumeros(num1,num2);
		num.divisionByZero();
		
	}
}
