package fr.but.loopHero.mobs;

import java.awt.Color;

public interface Mobs {
	boolean isDead();
	
	Color getColor();
	
	void takeDamage(int damages);
	
	int health();
	
	boolean equals(Object o);
	
	int hashCode();
	
	int[] getPos();
}
