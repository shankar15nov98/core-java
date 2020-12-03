package com.heraize.cj.game;

public class Bicycle implements Game {

	@Override
	public void play() {

		System.out.println("Bicycle Game play");
	}

	@Override
	public void start() {

		System.out.println("Bicycle Game start");
	}

	@Override
	public void stop() {

		System.out.println("Bicycle Game stop");
	}

}