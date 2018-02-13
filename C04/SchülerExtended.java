package yesildag;
/**
 * Eine Erweiterung zu Schüler welche eine equals Methode enthällt.
 * @author Emre Yesildag
 * @version 11/07/2017
 */
public class SchülerExtended extends Schüler {
	
	/**
	 * Kontruktor mit 3 parametern.
	 * Initialisiert die Attribute der Superklasse.
	 * @param vorname
	 * @param nachname
	 * @param klasse
	 * @since 11/07/2017
	 */
	public SchülerExtended(String vorname, String nachname, String klasse) {
		super(vorname, nachname, klasse);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Gibt true zurück wenn Vorname und Nachname gleich sind sonst false
	 * @param s1
	 * @param s2
	 * @return
	 * @since 11/07/2017
	 */
	public boolean equals(Object o) {
		if(!(o instanceof SchülerExtended)) {
			return false;
		}
		SchülerExtended se = (SchülerExtended) o;
		if(this.getVorname().equals(se.getVorname()) && this.getNachname().equals(se.getNachname())) {
			return true;
		}
			return false;
	}
}
