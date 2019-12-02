package com.codingdojo.objectmaster;

public class Human {
	
	int strength = 3;
	int stealth = 3;
	int intelligence = 3;
	int health = 100;
	private String name = "";
	
	public Human(){
    }
	
	public Human(String str) {
		this.name = str;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getStrength() {
		return strength;
	}
	
	public void setStrength(int strength) {
		this.strength = strength;
	}
	
	public int getStealth() {
		return stealth;
	}
	
	public void setStealth(int stealth) {
		this.stealth = stealth;
	}
	
	public int getHealth() {
		return health;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public void attack(Human name) {
		name.setHealth(getHealth() - strength);
		System.out.println(" Human attacked for: " + this.getStrength() + " damage!");
	}
}
