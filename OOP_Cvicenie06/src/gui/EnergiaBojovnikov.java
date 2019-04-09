package gui;

import stret.*;

import javafx.scene.control.*;
import javafx.application.*;

public class EnergiaBojovnikov extends TextField implements SledovatelStretu {
	private Stret stret;
	private int energia;

	public EnergiaBojovnikov(Stret stret) {	
		super();
		this.stret = stret;
	}
	
	public void upovedom() {
		energia = stret.energiaObrov() + stret.energiaRytierov();
		setText(Integer.toString(energia));
	}
}


//Platform.runLater(() -> setText(Integer.toString(energia)));
