package composite_a_strategy;

public class Budova implements Cast {
	   // atributy s informaciami o budove
	   int vyska = 20;
	   int sirka = 50;

	   public void info() {
	   //v�pis informaci� o budove
	      System.out.println("Vyska je: " + vyska);
	      System.out.println("Sirka je: " + sirka);
	   }
	}