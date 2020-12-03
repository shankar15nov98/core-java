package com.heraizen.cj.remote;

public class RemoteControlMain {
	public static void main(String[] arg) {
		RemoteControl remote;
		int min = 1;
		int max = 5;
		for (int i = 0; i < 5; i++) {
			double random_value = (int) (Math.random() * (max - min + 1) + min);

			if (random_value == 2 || random_value == 4) {
				remote = new DVD();
			}

			else {
				remote = new TV();
			}

			remote.powerOnOff();
			remote.volumeUp((int) (Math.random() * (max - min + 1) + min));
			remote.volumeDown((int) (Math.random() * (max - min + 1) + min));
			remote.mute();
			System.out.println("------------------------------");
		}

	}
}
