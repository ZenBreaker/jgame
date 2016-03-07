package towergame;

import java.awt.Image;
import jgame.ButtonState;
import jgame.Context;
import jgame.GButton;
import jgame.GSprite;
import jgame.ImageCache;
import jgame.listener.ButtonListener;

public class Tile extends GButton{
	public Tile(Image image, int turretNumber){
		setSize(90, 90);
		
		GSprite sNone = ImageCache.getSprite("buttons/none_img.png");
		GSprite sHover = ImageCache.getSprite("buttons/hover_img.png");
		GSprite sPressed = ImageCache.getSprite("buttons/pressed_img.png");

		setStateSprite(ButtonState.NONE, sNone);
		setStateSprite(ButtonState.HOVERED, sHover);
		setStateSprite(ButtonState.PRESSED, sPressed);
	
		GSprite tIcon = new GSprite(image);
		tIcon.setScale(0.9);
		addAtCenter(tIcon);
		
		addListener(new ButtonListener() {
			@Override
			public void mouseClicked(Context context){
				getFirstAncestorOf(TGLevelOneView.class).initializeTurret(turretNumber);
			}
		});
	}

}
