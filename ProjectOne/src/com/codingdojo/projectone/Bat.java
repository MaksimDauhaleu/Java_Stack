package com.codingdojo.projectone;

public class Bat extends Mammal{
	
	public Bat() {
		this.energyLevel = 300;
	}
	
	public void fly() {
		System.out.println("Bat is flying");
		super.energyLevel -= 50;
	}
	public void eatHumans() {
		System.out.println("Eating humans");
		super.energyLevel += 25;
	}
	public void attackTown() {
		System.out.println("Attacking a Town");
		super.energyLevel -= 100;
	}
}
