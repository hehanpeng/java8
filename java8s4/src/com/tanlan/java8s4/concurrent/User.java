package com.tanlan.java8s4.concurrent;

public class User {
	private String name;
	volatile int score;
	volatile Group group;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
