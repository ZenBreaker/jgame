package towergame;

import jgame.GContainer;
import java.awt.Color;

public class TGLevelOneView extends GContainer {
	
	private LOnePlayArea pal1 = new LOnePlayArea();
	private l1InfoArea ia = new l1InfoArea();
	private MenuArea mal1 = new MenuArea();
	
	public TGLevelOneView(){
		setSize(900,700);
		
		pal1.setAnchorTopLeft();
		pal1.setLocation(100, 0);
		add(pal1);
		
		ial1.setAnchorTopLeft();
		ial1.setLocation(0, 600);
		add(ial1);
		
		mal1.setAnchorTopLeft();
		mal1.setLocation(0, 0);
		add(mal1);
		setBackgroundColor(Color.BLACK);
	}
	
	public void initializeTurret() {
		TurretOne t1 = new TurretOne(ImageCache.getImage("turrets/dta1.png");
		this.pal1.addAtCenter(t1);
	}
}
