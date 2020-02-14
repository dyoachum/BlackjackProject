package com.skilldistillery.Blackjack.Players;

import com.skilldistillery.Blackjack.cards.Deck;

public class BlackjackDealer extends Player {

	private Deck deck;
	
	public BlackjackDealer(Deck deck) {
		super();
		this.deck = deck;
	}
}
