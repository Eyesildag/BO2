package yesildag;
/**
 * Eine Erweiterung zu Sch�ler welche eine equals Methode enth�llt.
 * @author Emre Yesildag
 * @version 11/07/2017
 */
public class Sch�lerExtended extends Sch�ler {
	
	/**
	 * Kontruktor mit 3 parametern.
	 * Initialisiert die Attribute der Superklasse.
	 * @param vorname
	 * @param nachname
	 * @param klasse
	 * @since 11/07/2017
	 */
	public Sch�lerExtended(String vorname, String nachname, String klasse) {
		super(vorname, nachname, klasse);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Gibt true zur�ck wenn Vorname und Nachname gleich sind sonst false
	 * @param s1
	 * @param s2
	 * @return
	 * @since 11/07/2017
	 */
	public boolean equals(Object o) {
		if(!(o instanceof Sch�lerExtended)) {
			return false;
		}
		Sch�lerExtended se = (Sch�lerExtended) o;
		if(this.getVorname().equals(se.getVorname()) && this.getNachname().equals(se.getNachname())) {
			return true;
		}
			return false;
	}
}
