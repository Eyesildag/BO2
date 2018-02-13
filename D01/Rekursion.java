package yesildag;

/**
 * In dieser Klasse sind einige Beispiele für Rekursionen enthalten.
 * @author Emre Yesildag
 * @version 1/9/2018
 */
public class Rekursion {
	
	/**
	 * Faktorielle mit long Zahlen berechnen.
	 * @return gibt das Ergebnis zurück
	 * @since 1/9/2018
	 */
	public long faktor(long z) throws RuntimeException {
		if(z<0) throw new RuntimeException();
		if(z == 0) return 0;
		if (z == 1) return 1;
		
		long min1 = faktor(z-1);
		//if(z * min1> Long.MAX_VALUE) {
		if(min1 > Long.MAX_VALUE/z) {
			throw new StackOverflowError();
		} else {
			return z* min1;
		}
	}
	
	/**
	 * Faktorielle mit double Zahlen berechnen.
	 * @return gibt das Ergebnis zurück
	 * @since 1/9/2018
	 */
	public double faktor(double z) throws RuntimeException {
		if(z<0) throw new RuntimeException();
		if(z == 0) return 0;
		if (z == 1) return 1;
		
		double min1 = faktor(z-1);
		//if(z * min1> Double.MAX_VALUE) {
		if(min1 > Double.MAX_VALUE/z) {
			throw new StackOverflowError();
		} else {
			return z* min1;
		}
			
	}
	
	/**
	 * Berechnet eine Fibonacci Zahl.
	 * @param z
	 * @return gibt die Fibonacci Zahl zurück
	 * @since 1/9/2018
	 */
	public long fibonacci(long z) throws RuntimeException {
		
		if(z<1) return 0;
		if(z == 1) return 1;
		if(fibonacci(z-2) + fibonacci(z-1) > Long.MAX_VALUE) {
			throw new StackOverflowError();
		} else {
			return fibonacci(z-2) + fibonacci(z-1);
		}
		
	
	}
}
