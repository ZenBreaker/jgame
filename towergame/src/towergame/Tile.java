package towergame;

import jgame.awt.Image;

public class Tile extends GButton {
	
	public Tile(Image image) {
		setSize(80, 80);
		
		GSprite sNone = ImageCache.getSprite("tiles/tilenone.jpg");
		GSprite sHover = ImageCache.getSprite("tiles/tilehover.jpg");
		GSprite sPressed = ImageCache.getSprite("tiles/tilepressed.jpg");
		
		setStateSprite(ButtonState.NONE, sNone);
		setStateSprite(ButtonState.HOVERED, sHover);
		setStateSprite(ButtonState.PRESSED, sPressed);
		
		GSprite tIcon = new GSprite(image);
		tIcon.setScale(0.8);
		addAtCenter(tIcon);
		
		addListener(new ButtonListener() {
			@Override
			public void mouseClicked(Context context) {
				getFirstAncestorOf(TGLevelOneView.class).initializeTurret();
			}
		});
	}

}