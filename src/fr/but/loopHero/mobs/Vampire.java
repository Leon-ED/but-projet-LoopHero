package fr.but.loopHero.mobs;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;

import fr.but.loopHero.droppable.Droppable;
import fr.but.loopHero.droppable.Ressource;
import fr.but.loopHero.game.LoopHeroGameData;
import fr.but.loopHero.game.objects.Cell;

public class Vampire extends Mobs{

	public Vampire(Cell cell) {
		super("Vampire",-1,18,5.8,0.5,new Color(143,0,48),0.45,cell,genMobsList(),10);
	}

	@Override
	public void draw(Graphics2D graphics, int taille) {
		graphics.setColor(super.getColor()); // Couleur du mob
		int startingPointx = taille + super.getCurrentCell().j() * taille;
		int startingPointy = taille + super.getCurrentCell().i()* taille;
		graphics.fillOval(startingPointx,startingPointy,taille/2,taille/2);
		
		graphics.setColor(Color.black); // Contour du mob
		graphics.drawOval(startingPointx,startingPointy,taille/2,taille/2);
		
	}

	private static ArrayList<Droppable> genMobsList() {
		ArrayList<Droppable> MOBS_DROPPABLE_ITEMS = new ArrayList<Droppable>();
		MOBS_DROPPABLE_ITEMS.add(new Ressource("pitful_remains")); // Ressources que le mob peut drop
		MOBS_DROPPABLE_ITEMS.addAll(LoopHeroGameData.MOBS_DROPPABLE_ITEMS);
		return MOBS_DROPPABLE_ITEMS;
	}
	
	@Override
	public void drawInCombat(Graphics2D graphics, int taille) {
		graphics.setColor(super.getColor()); // Couleur du mob
		int startingPointx = taille + 15 * taille;
		int startingPointy = taille + 6* taille;
		graphics.fillOval(startingPointx+taille,startingPointy,taille/2,taille/2);
		
		graphics.setColor(Color.black); // Contour du mob
		graphics.drawOval(startingPointx+taille,startingPointy,taille/2,taille/2);
		
		
	}
	
	@Override
	public boolean equals(Object obj) {
		return true;
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}

}
