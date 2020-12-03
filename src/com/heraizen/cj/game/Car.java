package com.heraize.cj.game;

public class Car implements Game {

	@Override
	public void play() {

		System.out.println("Car Game play");
	}

	@Override
	public void start() {

		System.out.println("Car Game start");
	}

	@Override
	public void stop() {

		System.out.println("Car Game stop");
	}

}