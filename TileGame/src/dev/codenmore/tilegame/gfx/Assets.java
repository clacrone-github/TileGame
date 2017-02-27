package dev.codenmore.tilegame.gfx;

import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;

public class Assets {

	private static final int WIDTH = 16;
	private static final int HEIGHT = 24;
	
	public static BufferedImage wolf_front_step_right;
	public static BufferedImage wolf_front_still;
	public static BufferedImage wolf_front_step_left;
	public static BufferedImage wolf_back_step_left;
	public static BufferedImage wolf_back_still;
	public static BufferedImage wolf_back_step_right;
	public static BufferedImage wolf_side_step_right;
	public static BufferedImage wolf_side_still;
	
	public static BufferedImage wolf_side_step_left;
	public static BufferedImage wolf_side_kneel;
	public static BufferedImage wolf_side_step_right_stair;
	public static BufferedImage wolf_side_step_right_kick;
	public static BufferedImage wolf_side_still_2;
	public static BufferedImage wolf_side_shuffle;
	public static BufferedImage wolf_side_jump_step;
	public static BufferedImage wolf_side_jump;
	
	public static BufferedImage wolf_side_thinking;
	public static BufferedImage wolf_side_thinking_2;
	public static BufferedImage wolf_laying_stomach;
	public static BufferedImage wolf_laying_back;
	public static BufferedImage wolf_front_still_2;
	public static BufferedImage wolf_laying_side;
	public static BufferedImage wolf_front_jump;
	public static BufferedImage wolf_back_jump;
	
	public static BufferedImage wolf_front_still_3;
	public static BufferedImage wolf_front_right_arm_raised;
	public static BufferedImage wolf_front_right_head_wipe;
	public static BufferedImage wolf_back_right_head_wipe;
	public static BufferedImage wolf_back_right_head_wipe_2;
	public static BufferedImage wolf_front_still_eyes_closed_mouth_open;
	public static BufferedImage wolf_front_still_eyes_closed;
	public static BufferedImage wolf_front_still_sweating;
	
	public static BufferedImage wolf_front_still_crying;
	public static BufferedImage wolf_back_still_2;
	public static BufferedImage wolf_side_still_crying;
	public static BufferedImage wolf_front_still_face_contort;
	public static BufferedImage wolf_front_still_left_fist;
	public static BufferedImage wolf_front_still_left_fist_2;
	public static BufferedImage blank_space;
	public static BufferedImage tent;
	
	
	public static BufferedImage grass;
	public static BufferedImage dirt;
	public static BufferedImage stone;
	public static BufferedImage water;
	public static BufferedImage snow;
	
	public static BufferedImage[] wolf_walking_down;
	public static BufferedImage[] wolf_walking_up;
	public static BufferedImage[] wolf_walking_right;
	public static BufferedImage[] wolf_walking_left;
	
	public static BufferedImage tree;
	public static BufferedImage rock;
	public static BufferedImage log;
	
	public static void init() {
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/lone_wolf.png"));
		SpriteSheet environment = new SpriteSheet(ImageLoader.loadImage("/textures/environment.png"));
		SpriteSheet environment2 = new SpriteSheet(ImageLoader.loadImage("/textures/environment2.jpg"));
		wolf_front_step_right = sheet.crop(WIDTH * 0, HEIGHT * 0, WIDTH, HEIGHT);
		wolf_front_still = sheet.crop(WIDTH * 1, HEIGHT * 0, WIDTH, HEIGHT);
		wolf_front_step_left = sheet.crop(WIDTH * 2, HEIGHT * 0, WIDTH, HEIGHT);
		wolf_back_step_left = sheet.crop(WIDTH * 3, HEIGHT * 0, WIDTH, HEIGHT);
		wolf_back_still = sheet.crop(WIDTH * 4, HEIGHT * 0, WIDTH, HEIGHT);
		wolf_back_step_right = sheet.crop(WIDTH * 5, HEIGHT * 0, WIDTH, HEIGHT);
		wolf_side_step_right = sheet.crop(WIDTH * 6, HEIGHT * 0, WIDTH, HEIGHT);
		wolf_side_still = sheet.crop(WIDTH * 7, HEIGHT * 0, WIDTH, HEIGHT);
		
		wolf_side_step_left = sheet.crop(WIDTH * 0, HEIGHT * 1, WIDTH, HEIGHT);
		wolf_side_kneel = sheet.crop(WIDTH * 1, HEIGHT * 1, WIDTH, HEIGHT);
		wolf_side_step_right_stair = sheet.crop(WIDTH * 2, HEIGHT * 1, WIDTH, HEIGHT);
		wolf_side_step_right_kick = sheet.crop(WIDTH * 3, HEIGHT * 1, WIDTH, HEIGHT);
		wolf_side_still_2 = sheet.crop(WIDTH * 4, HEIGHT * 1, WIDTH, HEIGHT);
		wolf_side_shuffle = sheet.crop(WIDTH * 5, HEIGHT * 1, WIDTH, HEIGHT);
		wolf_side_jump_step = sheet.crop(WIDTH * 6, HEIGHT * 1, WIDTH, HEIGHT);
		wolf_side_jump = sheet.crop(WIDTH * 7, HEIGHT * 1, WIDTH, HEIGHT);
		
		wolf_side_thinking = sheet.crop(WIDTH * 0, HEIGHT * 2, WIDTH, HEIGHT);
		wolf_side_thinking_2 = sheet.crop(WIDTH * 1, HEIGHT * 2, WIDTH, HEIGHT);
		wolf_laying_stomach = sheet.crop(WIDTH * 2, HEIGHT * 2, WIDTH, HEIGHT);
		wolf_laying_back = sheet.crop(WIDTH * 3, HEIGHT * 2, WIDTH, HEIGHT);
		wolf_front_still_2 = sheet.crop(WIDTH * 4, HEIGHT * 2, WIDTH, HEIGHT);
		wolf_laying_side = sheet.crop(WIDTH * 5, HEIGHT * 2, WIDTH, HEIGHT);
		wolf_front_jump = sheet.crop(WIDTH * 6, HEIGHT * 2, WIDTH, HEIGHT);
		wolf_back_jump = sheet.crop(WIDTH * 7, HEIGHT * 2, WIDTH, HEIGHT);
		
		wolf_front_still_3 = sheet.crop(WIDTH * 0, HEIGHT * 3, WIDTH, HEIGHT);
		wolf_front_right_arm_raised = sheet.crop(WIDTH * 1, HEIGHT * 3, WIDTH, HEIGHT);
		wolf_front_right_head_wipe = sheet.crop(WIDTH * 2, HEIGHT * 3, WIDTH, HEIGHT);
		wolf_back_right_head_wipe_2 = sheet.crop(WIDTH * 4, HEIGHT * 3, WIDTH, HEIGHT);
		wolf_front_still_eyes_closed_mouth_open = sheet.crop(WIDTH * 5, HEIGHT * 3, WIDTH, HEIGHT);
		wolf_front_still_eyes_closed = sheet.crop(WIDTH * 6, HEIGHT * 3, WIDTH, HEIGHT);
		wolf_front_still_sweating = sheet.crop(WIDTH * 7, HEIGHT * 3, WIDTH, HEIGHT);
		
		wolf_front_still_crying = sheet.crop(WIDTH * 0, HEIGHT * 4, WIDTH, HEIGHT);
		wolf_back_still_2 = sheet.crop(WIDTH * 1, HEIGHT * 4, WIDTH, HEIGHT);
		wolf_side_still_crying = sheet.crop(WIDTH * 2, HEIGHT * 4, WIDTH, HEIGHT);
		wolf_front_still_face_contort = sheet.crop(WIDTH * 3, HEIGHT * 4, WIDTH, HEIGHT);
		wolf_front_still_left_fist = sheet.crop(WIDTH * 4, HEIGHT * 4, WIDTH, HEIGHT);
		wolf_front_still_left_fist_2 = sheet.crop(WIDTH * 5, HEIGHT * 4, WIDTH, HEIGHT);
		blank_space = sheet.crop(WIDTH * 6, HEIGHT * 4, WIDTH, HEIGHT);
		tent = 	sheet.crop(WIDTH * 7, HEIGHT * 4, WIDTH, HEIGHT);
		
		grass = environment.crop(64 * 4, 96 * 2 + 32, 64, 64);
		dirt = environment.crop(64, 96 * 3 + 32, 64, 64);
		stone = environment.crop(64 * 2, 96 * 3 + 32, 64, 64);
		water = environment.crop(64 * 7, 96 * 3 + 32, 64, 64);
		snow = environment.crop(64 * 4, 96 * 3 + 32, 64, 64);
		
		wolf_walking_down = new BufferedImage[3];
		wolf_walking_down[0] = wolf_front_step_right;
		wolf_walking_down[1] = wolf_front_still;
		wolf_walking_down[2] = wolf_front_step_left;
		
		wolf_walking_up = new BufferedImage[3];
		wolf_walking_up[0] = wolf_back_step_left;
		wolf_walking_up[1] = wolf_back_still;
		wolf_walking_up[2] = wolf_back_step_right;
		
		wolf_walking_right = new BufferedImage[3];
		AffineTransform at = AffineTransform.getScaleInstance(-1, 1);
		at.translate(-wolf_side_step_right.getWidth(null), 0);
		AffineTransformOp op = new AffineTransformOp(at, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
		BufferedImage wolf_walking_right_1 = op.filter(wolf_side_step_right, null);
		wolf_walking_right[0] = wolf_walking_right_1;
		
		at = AffineTransform.getScaleInstance(-1, 1);
		at.translate(-wolf_side_still.getWidth(null), 0);
		op = new AffineTransformOp(at, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
		BufferedImage wolf_walking_right_2 = op.filter(wolf_side_still, null);
		wolf_walking_right[1] = wolf_walking_right_2;
		
		at = AffineTransform.getScaleInstance(-1, 1);
		at.translate(-wolf_side_step_left.getWidth(null), 0);
		op = new AffineTransformOp(at, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
		BufferedImage wolf_walking_right_3 = op.filter(wolf_side_step_left, null);
		wolf_walking_right[2] = wolf_walking_right_3;
		
		wolf_walking_left = new BufferedImage[3];
		wolf_walking_left[0] = wolf_side_step_right;
		wolf_walking_left[1] = wolf_side_still;
		wolf_walking_left[2] = wolf_side_step_left;
			
		tree = environment2.crop(130, 390, 90, 120);
		rock = environment2.crop(448, 0, 32, 32);
		log = environment2.crop(225, 417, 32, 32);
	}
}
