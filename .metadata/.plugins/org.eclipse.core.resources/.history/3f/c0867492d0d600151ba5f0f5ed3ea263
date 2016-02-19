package gamesrc;

import java.awt.Color;
import java.awt.image.BufferedImage;

import jgame.GContainer;
import jgame.GSprite;
import jgame.ImageCache;

public class MenuArea extends GContainer {
	
	public MenuArea() {
		setSize(800, 600);
		this.setBackgroundColor(Color.black);
		BufferedImage bgi = ImageCache.forClass(TowerGame.class).get("images.png");
		GSprite gs = new GSprite(bgi);
		setBackgroundSprite(gs);
	}

}
