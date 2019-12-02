package com.codingdojo.phones;

public abstract class Phone {
    private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;
    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }
    // abstract method. This method will be implemented by the subclasses
    public abstract void displayInfo();
    
    
    
    //Getters
    public String getVersion() {
		return this.versionNumber;
    }
    
    public Integer getBattery() {
		return this.batteryPercentage;
    }
    
    public String getCarrier() {
		return this.carrier;
    }
    
    public String getRingTone() {
		return this.ringTone;
    }
    //Setters
    
    public void setVersion(String var) {
    	this.versionNumber = var;
    }
    
    public void setBattery(int var) {
    	this.batteryPercentage = var;
    }
    
    public void setCarrier(String var) {
    	this.carrier = var;
    }
    
    public void setRingTone(String var) {
    	this.ringTone = var;
    }
}
