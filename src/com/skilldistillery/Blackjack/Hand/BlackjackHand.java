package com.skilldistillery.Blackjack.Hand;

import java.util.List;

import com.skilldistillery.Blackjack.cards.Card;

public class BlackjackHand extends Hand {
	private int playersHandValue;
	public BlackjackHand(List<Card> cards) {
		 super(cards);
	 }
	

	@Override
	public int getHandValue() {
		playersHandValue = 0;
		for (Card card : cards) {
			playersHandValue += card.getValue();
		}
		return playersHandValue;
	}
	public boolean isBlackjack() {
		if (getHandValue() == 21)
		{
		return true;
		}
		return false;
	}
	public boolean isBust() {
		if ( getHandValue() > 21) {
			System.out.println("BUST!");
		return true;		
		}
	return false;
}
}

	


