package dev.codenmore.tilegame.states;

import java.awt.Graphics;

import dev.codenmore.tilegame.Handler;
import dev.codenmore.tilegame.entities.creatures.Player;
import dev.codenmore.tilegame.entities.statics.Log;
import dev.codenmore.tilegame.entities.statics.Rock;
import dev.codenmore.tilegame.entities.statics.StaticEntity;
import dev.codenmore.tilegame.entities.statics.Tree;
import dev.codenmore.tilegame.worlds.World;

public class GameState extends State {

//	private Player player;
	private World world;
//	private StaticEntity tree;
//	private StaticEntity rock;
//	private StaticEntity log;
	
	public GameState(Handler handler) {
		super(handler);
		world = new World(handler, "res/worlds/world1.txt");
		handler.setWorld(world);
//		player = new Player(handler, 100, 100);
//		tree = new Tree(handler, 200, 200);
//		rock = new Rock(handler, 300, 300);
//		log = new Log(handler, 400, 400);
	}
	
	public void tick() {
		world.tick();
//		player.tick();
//		tree.tick();
	}

	public void render(Graphics g) {
		world.render(g);
//		player.render(g);
//		tree.render(g);
//		rock.render(g);
//		log.render(g);
//		Tile.tiles[0].render(g, 0, 0);
//		Tile.tiles[1].render(g, 0, 64);
//		Tile.tiles[2].render(g, 64, 0);
//		Tile.tiles[3].render(g, 64, 64);
//		Tile.tiles[4].render(g, 64, 128);
		
	}
}
