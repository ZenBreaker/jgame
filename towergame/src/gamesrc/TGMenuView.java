package gamesrc;

import jgame.ButtonState;
import jgame.GButton;
import jgame.GContainer;
import jgame.GSprite;
import jgame.ImageCache;
import jgame.listener.ButtonListener;

public class TGMenuView extends GContainer {
	
	public TGMenuView() {
		setSize(900, 700);
		
		MenuBackground mbg = new MenuBackground();
		addAtCenter(mbg);
		
		GSprite none_img = new GSprite(ImageCache.getImage("btnNone.jpg"));
		GSprite hover_img = new GSprite(ImageCache.getImage("btnHover.jpg"));
		GSprite pressed_img = new GSprite(ImageCache.getImage("btnPressed.jpg"));
		
		GButton play_btn = new GButton();
		play_btn.setStateSprite(ButtonState.NONE, none_img);
		play_btn.setStateSprite(ButtonState.HOVERED, hover_img);
		play_btn.setStateSprite(ButtonState.PRESSED, pressed_img);
		
		addAt(play_btn, 100, 100);
		
		ButtonListener play_btn = new ButtonListener(){
			
		}
	}

}
