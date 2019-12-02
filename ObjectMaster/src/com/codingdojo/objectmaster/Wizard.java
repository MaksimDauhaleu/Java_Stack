package com.codingdojo.objectmaster;

public class Wizard extends Human {

	int health = 50;
	int intelligence = 8;
	
	public void heal(Human name) {
		name.setHealth(getHealth() + this.intelligence);
		System.out.printf("Name:",name.getName(),"Health:",name.getHealth());
	}
}
