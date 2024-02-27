package prjMdc;

public class MetRecursivoMdc {
	 
	public static int calcularMdc(int a, int b) {

	        if (a == b) {
	            return a;
	        }

	        if (a > b) {
	            return calcularMdc(a - b, b);
	        }

	        return calcularMdc(a, b - a);
	    }

}
