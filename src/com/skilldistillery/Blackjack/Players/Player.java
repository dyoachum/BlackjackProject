package com.skilldistillery.Blackjack.Players;

import com.skilldistillery.Blackjack.Hand.Hand;
import com.skilldistillery.Blackjack.cards.Card;

public abstract class Player {
	

	public Hand hand;

	public Hand getHand() {
		return hand;
	}
	public void hitMe(Card card) {
		hand.addCard(card);
	}
	public void setHand(Hand hand) {
		this.hand = hand;
	}

	

}
