package yesildag;

import java.util.ArrayList;
/**
 * Diese Klasse verwaltet eine Liste von Schülern.
 * @author Emre Yesildag
 * @version 11/07/2017
 *
 */
public class Schülerliste {
	private ArrayList<Schüler> list;
	private int index;
	
	/**
	 * Parameterloser-Konstruktor der die Attribute initialsiert.
	 * @since 11/07/2017
	 */
	public Schülerliste() {
		this.list = new ArrayList<Schüler>();
		this.index = 0;
	}
	
	/**
	 * Fügt einen Schüler in die Liste hinzu.
	 * @param s = Schüler Objekt
	 * @since 11/07/2017
	 */
	public void add(Schüler s) {
		this.list.add(s);
	}
	
	/**
	 * Hier wird die Liste ausgegeben.
	 * @since 11/07/2017
	 */
	public void print() {
		for(Schüler s : this.list) {
			System.out.println(s.toString());
		}
	}
	
	/**
	 * Löscht ein Element aus der Liste.
	 * @param x = der Index
	 * @since 11/07/2017
	 */
	public void remove(int x) {
		this.list.remove(x);
	}
	
	/**
	 * Gibt die momentane Länge der Arrayliste zurück.
	 * @return die länge der Arrayliste
	 * @since 11/07/2017
	 */
	public int getLength() {
		return this.list.size();
	}
	
	/**
	 * Gibt die Arrayliste zurück.
	 * @return gibt die Arrayliste zurück.
	 * @since 10/07/2017
	 */
	public ArrayList<Schüler> getList() {
		return this.list;
	}
	
	/**
	 * Gibt das Element an der Stelle index zurück
	 * @param index
	 * @return
	 * @since 11/07/2017
	 */
	public Schüler getElement(int index) {
		Schüler s = this.list.get(index);
		return s;
	}
	
	/**
	 * Überprüft ob das gegebene Objekt in der Liste ist.
	 * @param s = Schüler Objekt
	 * @return 
	 * @since 11/07/2017
	 */
	public boolean contains(Schüler s) {
		boolean bool = this.list.contains(s);
		return bool;
	}
}
