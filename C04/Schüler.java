package yesildag;
/**
 * Diese Klasse beschreibt einen Schüler mit den Attributen wie zum Beispiel Namen und Klasse.
 * @author Emre Yesildag
 * @version 11/7/2017
 *
 */
public class Schüler {
	private String vorname, nachname, klasse;
	
	/**
	 * Konstruktor mit 3 parametern.
	 * Initialisiert die 3 Attriubute.
	 * @param vorname
	 * @param nachname
	 * @param klasse
	 * @since 11/07/2017
	 */
	public  Schüler(String vorname,String nachname,String klasse) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.klasse = klasse;
	}
	
	/**
	 * Konstruktor mit 2 parametern.
	 * Initialisiert nur den Vor- und Nachnamen.
	 * @param vorname
	 * @param nachname
	 * @since 11/07/2017
	 */
	public Schüler(String vorname,String nachname) {
		this.vorname = vorname;
		this.nachname = nachname;
	}
	
	/**
	 * Gibt das momentane Objekt als  String aus.
	 * @since 11/07/2017
	 */
	public String toString() {
		return "Vorname: " + vorname + " Nachname: " + nachname + " Klasse: " + klasse;
	}
	
	/**
	 * @return the vorname
	 * @since 11/07/2017
	 */
	public String getVorname() {
		return vorname;
	}

	
	/**
	 * @return the nachname
	 * @since 11/07/2017
	 */
	public String getNachname() {
		return nachname;
	}


	/**
	 * @return the klasse
	 * @since 11/07/2017
	 */
	public String getKlasse() {
		return klasse;
	}

	/**
	 * @param klasse the klasse to set
	 * @since 11/07/2017
	 */
	public void setKlasse(String klasse) {
		this.klasse = klasse;
	}
	
	
}
