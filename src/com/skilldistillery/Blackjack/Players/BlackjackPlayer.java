package com.skilldistillery.Blackjack.Players;

import com.skilldistillery.Blackjack.Hand.BlackjackHand;
import com.skilldistillery.Blackjack.Hand.Hand;


public class BlackjackPlayer extends Player {

//	private Hand hand;
	private int handValue;

	public BlackjackPlayer() {
		hand = new BlackjackHand();

	}

	public int getHandValue() {
		handValue = hand.getHandValue();
		return handValue;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}

}
