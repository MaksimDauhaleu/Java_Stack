package com.codingdojo.phones;

public class Galaxy extends Phone implements Ringable {

	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);

	}

	@Override
	public String ring() {
		System.out.println(getRingTone());
		return getRingTone();
	}

	@Override
	public String unlock() {
		System.out.print("Unlocked via finger print");
		return null;
	}

	@Override
	public void displayInfo() {
		System.out.println("Galaxy Model: " + getVersion() + ", " + "Charge Level: " +getBattery() + "%, " + "Carrier: " +getCarrier() + ", " + "RingTone: " + getRingTone());
	}

}
