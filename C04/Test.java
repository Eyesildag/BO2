package yesildag;
/**
 * Hier werden alle erstellten Klassen getestet
 * @author Emre Yesildag
 * @version 11/07/2017
 */
public class Test {
	
	/**
	 * Die main
	 * @param args
	 * @since 11/07/2017
	 */
	public static void main(String[] args) {
		Sch�lerliste sl = new Sch�lerliste();
		Sch�ler s1 = new Sch�ler("Name", "Name");
		Sch�ler s2 = new Sch�ler("Vorname18", "Nachname18", "Klasse18");
		
		for(int i = 0; i<20; i++) {
			Sch�ler s = new Sch�ler("Vorname"+i,"Nachname"+i);
			s.setKlasse("Klasse"+i);
			sl.add(s);
		}
		
		sl.print();
		
		//s1 und s2 haben den gleichen Inhalt aber nicht den gleichen Speicherort deswegen wird f�r s2 false ausgegeben.
		s1 = sl.getElement(18);
		System.out.println(sl.contains(s1));
		System.out.println(sl.contains(s2));
		
		
		System.out.println("///////////////////////////////////////////////////");
		//Neue Liste f�r Sch�lerExtended
		Sch�lerliste sl2 = new Sch�lerliste();
		for(int i = 0; i < 30; i++) {
			Sch�lerExtended se1 = new Sch�lerExtended("Vorname"+i, "Nachname"+i,"Klasse"+i);
			sl2.add(se1);
		}
		
		sl2.print();
		//Das gleiche Objekt ist in der Liste + am gleichen Speicherort = true
		Sch�lerExtended se2 = new Sch�lerExtended("Vorname0","Nachname0","Klasse0");
		se2 = (Sch�lerExtended) sl2.getElement(0);
		System.out.println(se2.equals(sl2.getElement(0)));
		
		//Der gleiche Inhalt aber nicht der gleiche Speicherort = true
		Sch�lerExtended se3 = new Sch�lerExtended("Vorname0" , "Nachname0" , "Klasse0");
		System.out.println(se3.equals(sl2.getElement(0)));
		
		System.out.println("Hello World");
	}
}
