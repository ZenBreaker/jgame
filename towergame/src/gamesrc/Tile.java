package gamesrc;

import jgame.ButtonState;
import jgame.GButton;
import jgame.GSprite;
import jgame.ImageCache;

public class Tile extends GButton {
	public Tile() {
		setSize(90, 90);
		
		GSprite sNone = ImageCache.getSprite("tilenone.jpg");
		GSprite sHover = ImageCache.getSprite("tilehover.jpg");
		GSprite sPressed = ImageCache.getSprite("tilepressed.jpg");
		
		setStateSprite(ButtonState.NONE, sNone);
		setStateSprite(ButtonState.HOVERED, sHover);
		setStateSprite(ButtonState.PRESSED, sPressed);
		
	}

}
