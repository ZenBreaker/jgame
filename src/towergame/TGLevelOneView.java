package towergame;

import jgame.Context;
import jgame.GContainer;
import jgame.GObject;
import jgame.ImageCache;
import jgame.controller.MouseLocationController;
import jgame.listener.LocalClickListener;

public class TGLevelOneView extends GContainer {

	private LevelOnePlayArea levelOnePlayArea = new LevelOnePlayArea();
	private MenuArea menuArea = new MenuArea();
	private InfoArea infoArea = new InfoArea();

	private boolean settingTurret = false;
	
	public TGLevelOneView() {
		setSize(900, 700);

		menuArea.setAnchorTopLeft();
		menuArea.setLocation(0, 0);
		add(menuArea);

		infoArea.setAnchorTopLeft();
		infoArea.setLocation(0, 600);
		add(infoArea);

		levelOnePlayArea.setAnchorTopLeft();
		levelOnePlayArea.setLocation(100, 0);
		add(levelOnePlayArea);
	}

	public void initializeTurret(int tn) {
		if (settingTurret){
			return;
		}
		settingTurret = true;
		
		Turret t = chooseTurret(tn);
		this.levelOnePlayArea.addAtCenter(t);
	
		final MouseLocationController mouse = new MouseLocationController();
		t.addController(mouse);
		
		final LocalClickListener dropListener = new LocalClickListener(){
			@Override
			public void invoke(GObject target, Context context){
				target.removeController(mouse);
				target.removeListener(this);
				
				settingTurret = false;
			}
		};
		
		t.addListener(dropListener);
	}

	public Turret chooseTurret(int turretNumber) {
		switch (turretNumber) {
		case 0:
			return new TurretOne(ImageCache.getImage("tiles/d1.png"));
		case 1:
			return new TurretTwo(ImageCache.getImage("tiles/d2.png"));
		case 2:
			return new TurretThree(ImageCache.getImage("tiles/d3.png"));
		case 3:
			return new TurretFour(ImageCache.getImage("tiles/d4.png"));
		case 4:
			return new TurretFive(ImageCache.getImage("tiles/d5.png"));
		default:
			return null;
		}
	}
}