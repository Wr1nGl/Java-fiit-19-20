package composite_a_strategy;

import java.util.*;

public class CastMesta implements Cast {
	   List <Cast> casti;

	   public void pridajCast(Cast cast) {
		   this.casti.add(cast);
	   }
	   
	   public void odstranCast(Cast cast) {
		   this.casti.remove(cast);
	   }
	   public void odstranCast(int i) {
		   this.casti.remove(i);
	   }
	   public void info() {
	      //vypis informaci� o �asti mesta
	      
	      //v�pis inform�ci� o v�etk�ch �astiach a budov�ch tejto �asti mesta
	      for (Cast e : casti)
	         e.info();
	   }
	}