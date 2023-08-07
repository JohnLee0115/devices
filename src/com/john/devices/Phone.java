package com.john.devices;

public class Phone extends Device {

	public Phone() {
		super();
	}
	
	public void makeCall() {
		System.out.println("Making a phone call");
		battery -= 5;
		displayBattery();
		
	}
	
	public void playGame() {
		System.out.println("Playing phone game");
		battery -= 20;
		displayBattery();
	}
	
	public void charging() {
		System.out.println("Charging Phone");
		battery += 50;
		displayBattery();
	}
	

}
