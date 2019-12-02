package com.codingdojo.phones;

public class Iphone extends Phone implements Ringable {

	public Iphone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);

	}

	@Override
	public String ring() {
		System.out.println(getRingTone());
		return getRingTone();
	}

	@Override
	public String unlock() {
		System.out.print("Unlocked via facial recognition");
		return null;
	}

	@Override
	public void displayInfo() {
		System.out.println("Iphone Model: " + getVersion() + ", " + "Charge Level: " +getBattery() + "%, " + "Carrier: " +getCarrier() + ", " + "RingTone: " + getRingTone());
	}

}
