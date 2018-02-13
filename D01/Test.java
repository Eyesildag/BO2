package yesildag;

/**
 * Die Testklasse
 * @author Emre Yesildag
 * @version 1/9/2018
 */
public class Test {
	
	/**
	 * Alle Methoden werden bis zum Wurf einer Exception ausgeführt.
	 * @since 1/9/2018
	 */
	public static void berechnealles() {
		Rekursion r = new Rekursion();
		int i = 0;
		double ii = 0.0;
		while(true) {
			
			System.out.println("Fibonacci von " + i + ": " +  r.fibonacci(i));
			System.out.println("Faktorielle long von " + i + ": " +  r.faktor(i));
			System.out.println("Faktorielle double von " + i + ": " +  r.faktor(ii));
			i++;
			ii++;
		}
	}
	
	/**
	 * Die Main
	 * @param args
	 * @since 1/9/2018
	 */
	public static void main(String[] args) {
		berechnealles();

	}

}
