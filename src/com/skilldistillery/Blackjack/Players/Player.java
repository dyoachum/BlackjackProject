package com.skilldistillery.Blackjack.Players;

import com.skilldistillery.Blackjack.Hand.Hand;

public class Player {
	private String name;

//	private Hand hand;
	public Player() {

	}

	@Override
	public String toString() {
		return "Player [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
