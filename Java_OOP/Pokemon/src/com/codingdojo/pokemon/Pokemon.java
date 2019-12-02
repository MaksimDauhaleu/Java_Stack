package com.codingdojo.pokemon;

public class Pokemon {
	String name;
	Integer health;
	String type;
	private static int count = 0;
	
	
	public void attackPokemon(Pokemon pokemon) {
		pokemon.health -= 10;
	}
	
	
	//getters
	public String getName() {
		return name;
	}
	public Integer getHealth() {
		return health;
	}
	public String getType() {
		return type;
	}
	
	
	//setters
	public void setName(String name) {
		this.name = name;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
