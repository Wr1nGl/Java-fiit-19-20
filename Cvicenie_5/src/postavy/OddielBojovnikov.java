package postavy;

import java.util.*;

public class OddielBojovnikov implements BojovaZlozka {
	private List<BojovaZlozka> zlozky = new ArrayList<>();
	
	public void pridajBojovuJednotku(BojovaZlozka jednotka) {
		zlozky.add(jednotka);
	}

	public List<BojovaZlozka> vyberBojoveJednotky() {
		return zlozky;
	}
	
	public List<? extends Bojovnik> vyberBojovnikov() {		
		List<Bojovnik> jednotlivci = new ArrayList<>();
		
		for (BojovaZlozka e : zlozky)
			jednotlivci.addAll(e.vyberBojovnikov());
		
		return jednotlivci;
	}
}
