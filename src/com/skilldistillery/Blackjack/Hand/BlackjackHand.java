package com.skilldistillery.Blackjack.Hand;

import com.skilldistillery.Blackjack.cards.Card;


public class BlackjackHand extends Hand {
	private int playersHandValue;

	public BlackjackHand() {
		super();
	}

	@Override
	public int getHandValue() {
		playersHandValue = 0;
		for (Card card : cards) {
			playersHandValue += card.getValue();
		}
//		for (Card card : cards) {
//			if (card.getRank().equals(Rank.ACE) && playersHandValue > 11);
//			playersHandValue = playersHandValue + 10;
//		}
		return playersHandValue;
	}

	public boolean isBlackjack() {
		if (getHandValue() == 21) {
			return true;
		}
		return false;
	}

	public boolean isBust() {
		if (getHandValue() > 21) {
			
			return true;
		}
		return false;
	}
	
	
}










