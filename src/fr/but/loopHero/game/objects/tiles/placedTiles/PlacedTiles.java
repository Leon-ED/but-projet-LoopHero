package fr.but.loopHero.game.objects.tiles.placedTiles;

import java.awt.Color;
import java.util.Objects;

import fr.but.loopHero.game.LoopHeroGameData;
import fr.but.loopHero.game.objects.Board;
import fr.but.loopHero.game.objects.tiles.Tile;
import fr.but.loopHero.player.Player;
import fr.umlv.zen5.ApplicationContext;

public abstract class PlacedTiles extends Tile {

	private final Tile parentTile;

	public PlacedTiles(String name, Tile parentTile, Color color) {
		super(name, color);
		this.parentTile = Objects.requireNonNull(parentTile);

	}

	public Tile getParentTile() {
		return parentTile;

	}

	public abstract Tile generateNew();

	public void doEffects(ApplicationContext context, Player hero, Board plateau, LoopHeroGameData datas) {
	}

}
