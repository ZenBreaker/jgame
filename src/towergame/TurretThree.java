package towergame;

import java.awt.Image;

import jgame.ImageCache;

public class TurretThree extends Turret {
	public TurretThree(Image image) {
		super(image);
	}
	
	@Override
	public Bullet createBullet() {
		// TODO Auto-generated method stub
		return new Bullet(ImageCache.getImage("bullets/bullet.png"));
	}

	@Override
	public double getBulletSpeed() {
		// TODO Auto-generated method stub
		return 30;
	}
}
