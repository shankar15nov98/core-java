package com.heraize.cj.game;

public class GameMain {
	public static void main(String[] arg) {

		Game[] gamesArr = new Game[10];

		int min = 1;
		int max = 3;
		for (int i = 0; i < 10; i++) {
			int random_int = (int) (Math.random() * (max - min + 1) + min);

			if (random_int == 1) {
				gamesArr[i] = new Car();

			}
			if (random_int == 2) {
				gamesArr[i] = new Bike();

			}

			if (random_int == 3) {
				gamesArr[i] = new Bicycle();

			}

		}

		for (Game game : gamesArr) {
			game.play();
			game.start();
			game.stop();
			System.out.println("--------------------------------------------------------");
		}

	}
}
