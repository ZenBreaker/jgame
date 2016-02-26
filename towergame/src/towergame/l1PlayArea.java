package towergame;

import java.awt.Color;
import java.awt.image.BufferedImage;

import jgame.GContainer;
import jgame.GSprite;
import jgame.ImageCache;

public class l1PlayArea extends GContainer {
	
	public l1PlayArea(){
		setSize(800, 600);
		this.setBackgroundColor(Color.black);
		BufferedImage bgi = ImageCache.forClass(TowerGame.class).get("l1pa.jpg");
		GSprite gs = new GSprite(bgi);
		setBackgroundSprite(gs);
	}

}
