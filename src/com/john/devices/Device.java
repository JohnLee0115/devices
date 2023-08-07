package com.john.devices;

public class Device {
	protected int battery;
	
	public Device() {
		this.battery = 100;
	}
	
	protected void displayBattery() {
		System.out.println("Battery Life: " + this.battery + "%");
	}

	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}

}
