package fr.but.loopHero.player;

import java.util.ArrayList;
import java.util.Random;

import fr.but.loopHero.droppable.Droppable;
import fr.but.loopHero.game.LoopHeroGameData;

public class Player {

	private int maxHealth;
	private int currentHealth;
	private double regenPerSecond;
	
	private int defensePoints;
	
	private int minDamagePoints;
	private int maxDamagePoints;

	private double counterPercent;
	
	private final ArrayList<Droppable> playerInventory;
	
	private int currentNumOfCell = 0;
	
	
	
	public Player() {
		this.playerInventory = new ArrayList<>();
		
		this.maxHealth = 250;
		this.currentHealth = 250;
		this.regenPerSecond = 0;
		
		this.defensePoints = 0;
		this.counterPercent = 0.0;
	
		this.minDamagePoints = 4;
		this.maxDamagePoints = 6;
		
	}
	
	public boolean isDead() {
		return currentHealth <= 0;
	}
	
	public int getCurrentCellIndex(){
		return (currentNumOfCell == 34 ?  0 :  currentNumOfCell);
	}
	
	public int addCurrentNumOfCell() {
		if (currentNumOfCell >= 34) {
			currentNumOfCell = 0;
			LoopHeroGameData.LEVEL +=1;
		}
		currentNumOfCell++; 
		return currentNumOfCell-1;
	}

	public int attack() {
		Random r = new Random();
		return r.nextInt(maxDamagePoints-minDamagePoints)+maxDamagePoints;
	}

	public void takeDamage(int damages) {
		currentHealth -= damages;
		
	}
	
	public int[] getHealths() {
		int[] vies = new int[2];
		vies[0] = currentHealth;
		vies[1] = maxHealth;
		
		return vies;
	}

	public void addInventory(ArrayList<Droppable> droppedItems) {
		playerInventory.addAll(droppedItems);
		
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
