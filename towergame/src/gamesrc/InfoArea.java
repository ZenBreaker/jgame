package gamesrc;

import java.awt.Color;
import java.awt.image.BufferedImage;

import jgame.GContainer;
import jgame.GSprite;
import jgame.ImageCache;

public class InfoArea extends GContainer {
	
	public InfoArea() {
		setSize(800, 600);
		this.setBackgroundColor(Color.black);
		BufferedImage bgi = ImageCache.forClass(TowerGame.class).get("instructions.jpg");
		GSprite gs = new GSprite(bgi);
		setBackgroundSprite(gs);
	}

}
