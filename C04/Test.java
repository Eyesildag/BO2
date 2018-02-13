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
		Schülerliste sl = new Schülerliste();
		Schüler s1 = new Schüler("Name", "Name");
		Schüler s2 = new Schüler("Vorname18", "Nachname18", "Klasse18");
		
		for(int i = 0; i<20; i++) {
			Schüler s = new Schüler("Vorname"+i,"Nachname"+i);
			s.setKlasse("Klasse"+i);
			sl.add(s);
		}
		
		sl.print();
		
		//s1 und s2 haben den gleichen Inhalt aber nicht den gleichen Speicherort deswegen wird für s2 false ausgegeben.
		s1 = sl.getElement(18);
		System.out.println(sl.contains(s1));
		System.out.println(sl.contains(s2));
		
		
		System.out.println("///////////////////////////////////////////////////");
		//Neue Liste für SchülerExtended
		Schülerliste sl2 = new Schülerliste();
		for(int i = 0; i < 30; i++) {
			SchülerExtended se1 = new SchülerExtended("Vorname"+i, "Nachname"+i,"Klasse"+i);
			sl2.add(se1);
		}
		
		sl2.print();
		//Das gleiche Objekt ist in der Liste + am gleichen Speicherort = true
		SchülerExtended se2 = new SchülerExtended("Vorname0","Nachname0","Klasse0");
		se2 = (SchülerExtended) sl2.getElement(0);
		System.out.println(se2.equals(sl2.getElement(0)));
		
		//Der gleiche Inhalt aber nicht der gleiche Speicherort = true
		SchülerExtended se3 = new SchülerExtended("Vorname0" , "Nachname0" , "Klasse0");
		System.out.println(se3.equals(sl2.getElement(0)));
		
	}
}
