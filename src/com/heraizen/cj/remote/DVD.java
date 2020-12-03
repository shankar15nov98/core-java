package com.heraizen.cj.remote;

public class DVD implements RemoteControl {

	private boolean power = false;

	private int minVolume = 0;
	private int maxVolume = 100;
	private int volume = minVolume;

	@Override
	public boolean powerOnOff() {
		power = !power;
		System.out.println("DVD power " + (power ? "on." : "off."));
		return power;
	}

	@Override
	public int volumeUp(int increment) {
		if (!power)
			return 0;

		volume = volume + increment > maxVolume ? maxVolume : volume + increment;
		System.out.println("DVD volume level Up: " + volume);
		return volume;
	}

	@Override
	public int volumeDown(int decrement) {
		if (!power)
			return 0;

		volume = volume - decrement < minVolume ? minVolume : volume - decrement;
		System.out.println("DVD volume level Down: " + volume);
		return volume;
	}

	@Override
	public void mute() {
		if (!power)
			return;

		volume = minVolume;
		System.out.println("DVD volume level mute: " + volume);

	}

}
