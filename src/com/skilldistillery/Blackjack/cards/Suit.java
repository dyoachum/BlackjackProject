package com.skilldistillery.Blackjack.cards;

public enum Suit {
Hearts("Hearts"), 
Spades("Spades"), 
Clubs("Clubs"), 
Diamonds("Diamonds");
	
	Suit(String name){
		this.name = name;
	}

private String name;

@Override
public String toString() {
	return name;
}
}
