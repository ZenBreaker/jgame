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
		BufferedImage bgi = ImageCache.forClass(TowerGame.class).get("MainArea.png");
		GSprite gs = new GSprite(bgi);
		setBackgroundSprite(gs);
		for(int i = 0; i < 5; i++){
			setTile(i);
		}
	}
	
	private void setTile(int i){
		Tile tile = new Tile();
		tile.setAnchorTopLeft();
		tile.setScale(0.9);
		tile.setX(4);
		tile.setY(110*i +25);
		add(tile);
	}

}
