package towergame;

import java.awt.Color;
import java.awt.image.BufferedImage;

import jgame.GContainer;
import jgame.GSprite;
import jgame.ImageCache;

public class LevelOnePlayArea extends GContainer{
	
	public LevelOnePlayArea(){
		setSize(800, 600);
		this.setBackgroundColor(Color.black);
		
	    BufferedImage bg = ImageCache.forClass(TowerGame.class).get("dream.jpg");
	    GSprite gs = new GSprite(bg);
	    setBackgroundSprite(gs);
	}	
}