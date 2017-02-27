package dev.codenmore.tilegame.entities.creatures;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import dev.codenmore.tilegame.Handler;
import dev.codenmore.tilegame.gfx.Animation;
import dev.codenmore.tilegame.gfx.Assets;

public class Player extends Creature {
	
	//Animations
	private Animation animDown;
	private Animation animUp;
	private Animation animLeft;
	private Animation animRight;
	
	public Player(Handler handler, float x, float y) {
		super(handler, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);
		bounds.x = 4;
		bounds.y = 8;
		bounds.height = 16;
		bounds.width = 10;
		
		//Animations
		animDown = new Animation(500, Assets.wolf_walking_down);
		animUp = new Animation(500, Assets.wolf_walking_up);
		animLeft = new Animation(500, Assets.wolf_walking_left);
		animRight = new Animation(500, Assets.wolf_walking_right);
	}

	@Override
	public void tick() {
		//Animations
		animDown.tick();
		animUp.tick();
		animLeft.tick();
		animRight.tick();
		
		//Movement
		getInput();
		move();
		handler.getGameCamera().centerOnEntity(this);
	}
	
	private void getInput() {
		xMove = 0;
		yMove = 0;
		
		if (handler.getKeyManager().up) {
			yMove = -speed;
		}
		if (handler.getKeyManager().down) {
			yMove = speed;
		}
		if (handler.getKeyManager().left) {
			xMove = -speed;
		}
		if (handler.getKeyManager().right) {
			xMove = speed;
		}
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(
				getCurrentAnimationFrame(), 
				(int) (x - handler.getGameCamera().getxOffset()), 
				(int) (y - handler.getGameCamera().getyOffset()), 
				width, 
				height, 
				null);
		
//		g.setColor(Color.red);
//		g.fillRect(
//				(int)(x + bounds.x - handler.getGameCamera().getxOffset()), 
//				(int)(x + bounds.y - handler.getGameCamera().getyOffset()), 
//				bounds.width, 
//				bounds.height);
	}
	
	private BufferedImage getCurrentAnimationFrame() {
		if (xMove < 0) {
			return animLeft.getCurrentFrame();
		} else if (xMove> 0) {
			return animRight.getCurrentFrame();
		} else if (yMove < 0) {
			return animUp.getCurrentFrame();
		} else if (yMove > 0) {
			return animDown.getCurrentFrame();
		} else {
			return Assets.wolf_front_still;
		}
	}
}