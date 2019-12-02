package com.codingdojo.objectmaster;

public class HumanTest {

	public static void main(String[] args) {
		Human test = new Human();
		Human ninja1 = new Human("Kobe");
		Human samurai1 = new Human("Shaq");
		Human wizard1 = new Human("Phil");
		Wizard w = new Wizard();
		ninja1.attack(samurai1);
		w.heal(samurai1);
		System.out.println(samurai1.getHealth());
	}

}
