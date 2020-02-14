package com.skilldistillery.Blackjack.Players;

import com.skilldistillery.Blackjack.Hand.BlackjackHand;
import com.skilldistillery.Blackjack.Hand.Hand;

public class BlackjackPlayer extends Player {
	
	private Hand hand;
	
	public BlackjackPlayer() {
		hand = new BlackjackHand();
	}

}
