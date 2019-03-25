package gui;

import javafx.scene.control.*;
import stret.*;

public class EnergiaBojovnikov extends TextField implements SledovatelStretu {
	private Stret stret;
	private int energia;

	public EnergiaBojovnikov(Stret stret) {	
		super();
		this.stret = stret;
	}
	
	public void upovedom() {
//		energia = 0;
		
//		for (int i = 0; i < stret.zistiPocetBojovnikov(); ++i)
//			energia += stret.zistiRytiera(i).zistiEnergiu() + stret.zistiObra(i).zistiEnergiu();

		energia = stret.energiaObrov() + stret.energiaRytierov();
		setText(Integer.toString(energia));
	}
}
