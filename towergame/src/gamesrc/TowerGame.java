package gamesrc;

import java.awt.Color;

import jgame.GRootContainer;
import jgame.Game;

public class TowerGame extends Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public TowerGame(){
		GRootContainer root = new GRootContainer (Color.BLUE);
		setRootContainer(root);
		
		TGLevelOneView tgl1v = new TGLevelOneView();
		root.addView(Views.LEVEL_ONE, tgl1v);
	}

		public enum Views{
			MAIN_MENU, LEVEL_ONE, INSTRUCTIONS;
	}

}
