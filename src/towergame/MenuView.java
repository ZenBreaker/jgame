package towergame;

import jgame.ButtonState;
import jgame.GButton;
import jgame.GContainer;
import jgame.GSprite;
import jgame.ImageCache;

public class MenuView extends GContainer {
	public MenuView() {
		setSize(900, 700);
		
		MenuBackground mbg = new MenuBackground();
		addAtCenter(mbg);
		
		GSprite none_img = new GSprite(ImageCache.getImage("buttons/none_img.png"));
		GSprite hover_img = new GSprite(ImageCache.getImage("buttons/hover_img.png"));
		GSprite pressed_img = new GSprite(ImageCache.getImage("buttons/pressed_img.png"));
		
		GButton play_btn = new GButton();
		play_btn.setStateSprite(ButtonState.NONE, none_img);
		play_btn.setStateSprite(ButtonState.HOVERED, hover_img);
		play_btn.setStateSprite(ButtonState.PRESSED, pressed_img);
		
		addAt(play_btn, 100, 100);
	}
}
