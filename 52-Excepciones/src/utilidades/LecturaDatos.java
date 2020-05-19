package utilidades;
import java.util.Scanner;

/*
 * @author Nino Casinelli
 */

public class LecturaDatos {
	 @SuppressWarnings("resource")
	public static String leerString() {
	        return new Scanner(System.in).nextLine();
	    }
	    
	    @SuppressWarnings("resource")
		public static int leerInteger() {
	        return new Scanner(System.in).nextInt();
	    }

	    public static String leerString(String msg) {
	        System.out.println(msg);
	        return leerString();
	    }
	    
	       public static int leerInteger(String msg) {
	        System.out.print(msg);
	        return LecturaDatos.leerInteger();
	    }
	       
	       public static double leerDouble(String msg) {
		        System.out.println(msg);
		        return leerDouble(msg);
		    }
	       
	       @SuppressWarnings("resource")
		public static double leerDouble() {
		        return new Scanner(System.in).nextDouble();
		    }
}