package com.heraizen.cj.remote;

public interface RemoteControl {

	boolean powerOnOff();

	int volumeUp(int increment);

	int volumeDown(int decrement);

	void mute();

}
