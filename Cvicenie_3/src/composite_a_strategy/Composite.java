package composite_a_strategy;

public class Composite {

	public static void main(String[] args) {
		// pou�itie: mesto vytvor�me ako ak�ko�vek in� �as�
		Cast mesto = new Cast();

		// vytvor�me a do mesta prid�me jeho �asti a budovy
		Cast c = new CastMesta();
		c.pridajCast(new Budova());
		mesto.pridaj(c);

		// v�pis v�etk�ch inform�ci� o meste je jednoduch�
		mesto.info();


	}
}
 
