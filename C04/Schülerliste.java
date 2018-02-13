package yesildag;

import java.util.ArrayList;
/**
 * Diese Klasse verwaltet eine Liste von Sch�lern.
 * @author Emre Yesildag
 * @version 11/07/2017
 *
 */
public class Sch�lerliste {
	private ArrayList<Sch�ler> list;
	private int index;
	
	/**
	 * Parameterloser-Konstruktor der die Attribute initialsiert.
	 * @since 11/07/2017
	 */
	public Sch�lerliste() {
		this.list = new ArrayList<Sch�ler>();
		this.index = 0;
	}
	
	/**
	 * F�gt einen Sch�ler in die Liste hinzu.
	 * @param s = Sch�ler Objekt
	 * @since 11/07/2017
	 */
	public void add(Sch�ler s) {
		this.list.add(s);
	}
	
	/**
	 * Hier wird die Liste ausgegeben.
	 * @since 11/07/2017
	 */
	public void print() {
		for(Sch�ler s : this.list) {
			System.out.println(s.toString());
		}
	}
	
	/**
	 * L�scht ein Element aus der Liste.
	 * @param x = der Index
	 * @since 11/07/2017
	 */
	public void remove(int x) {
		this.list.remove(x);
	}
	
	/**
	 * Gibt die momentane L�nge der Arrayliste zur�ck.
	 * @return die l�nge der Arrayliste
	 * @since 11/07/2017
	 */
	public int getLength() {
		return this.list.size();
	}
	
	/**
	 * Gibt die Arrayliste zur�ck.
	 * @return gibt die Arrayliste zur�ck.
	 * @since 10/07/2017
	 */
	public ArrayList<Sch�ler> getList() {
		return this.list;
	}
	
	/**
	 * Gibt das Element an der Stelle index zur�ck
	 * @param index
	 * @return
	 * @since 11/07/2017
	 */
	public Sch�ler getElement(int index) {
		Sch�ler s = this.list.get(index);
		return s;
	}
	
	/**
	 * �berpr�ft ob das gegebene Objekt in der Liste ist.
	 * @param s = Sch�ler Objekt
	 * @return 
	 * @since 11/07/2017
	 */
	public boolean contains(Sch�ler s) {
		boolean bool = this.list.contains(s);
		return bool;
	}
}
