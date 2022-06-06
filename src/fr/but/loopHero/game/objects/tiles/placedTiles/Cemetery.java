package fr.but.loopHero.game.objects.tiles.placedTiles;

import java.awt.Color;
import fr.but.loopHero.game.LoopHeroGameData;
import fr.but.loopHero.game.objects.Board;
import fr.but.loopHero.game.objects.Cell;
import fr.but.loopHero.game.objects.tiles.Tile;
import fr.but.loopHero.game.objects.tiles.Wasteland;
import fr.but.loopHero.mobs.Mobs;
import fr.but.loopHero.mobs.Skeleton;
import fr.but.loopHero.player.Player;
import fr.umlv.zen5.ApplicationContext;

public class Cemetery extends PlacedTiles{
	
	private int lastSpawn;
	
	private Mobs spawnedMobs;

	public Cemetery() {
		super("Cemetery", new Wasteland(), new Color(0,69,116));
		this.lastSpawn = -1;
		this.spawnedMobs = null;
	}

	@Override
	public Tile generateNew() {
		return new Cemetery();
	}

	@Override
	public void doNewDayEffects(ApplicationContext context, Player hero, Board plateau,LoopHeroGameData datas,Cell cell) {
		if (spawnedMobs == null || spawnedMobs.isDead()) {
			if((lastSpawn == -1 || lastSpawn >= 2)) {
				lastSpawn = 0;
				Mobs squeleton = new Skeleton(cell);
				spawnedMobs = squeleton;
				cell.addMob(squeleton);
				//System.out.println(cell.hasMob());	
			}
			else
				lastSpawn++;
		}
		
	}
}