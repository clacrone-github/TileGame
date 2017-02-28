package dev.codenmore.tilegame.gfx;

import java.awt.image.BufferedImage;

public class Animation {

	private int speed, index;
	private BufferedImage[] frames;
	private long lastTime;
	private long timer;
	
	public Animation(int speed, BufferedImage[] frames) {
		// TODO Auto-generated constructor stub
		this.speed = speed;
		this.frames = frames;
		index = 0;
		lastTime = System.currentTimeMillis();
		timer = 0;
	}
	
	public BufferedImage getCurrentFrame() {
		return frames[index];
	}

	public void tick() {
		timer += System.currentTimeMillis() - lastTime;
		lastTime = System.currentTimeMillis();
		
		if (timer > speed) {
			index++;
			timer = 0;
			if (index >= frames.length) {
				index = 0;
			}
		}
	}
}
