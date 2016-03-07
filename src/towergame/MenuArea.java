package towergame;

import java.awt.Image;
import java.util.List;
import jgame.GContainer;
import jgame.GSprite;
import jgame.ImageCache;

public class MenuArea extends GContainer{
	public MenuArea() {
		setSize(100, 600);
		setBackgroundSprite(new GSprite(ImageCache.getImage("cosmo.jpg")));
		
		for(int i = 0; i < 5; i++){
			setTile(i);
		}
	}
	
	List <Image> tileImages = ImageCache.getSequentialImages("tiles/d", 1, 5, ".png");
	
	private void setTile(int i){
		Image x = tileImages.get(i);
		Tile tile = new Tile(x.getScaledInstance(100, 100, 0),  i);
		tile.setAnchorTopLeft();
		tile.setScale(0.9);
		tile.setX(4);
		tile.setY(110 * i + 25);
		add(tile);	
	}
}