package com.skilldistillery.Blackjack.Players;

import java.util.List;

import com.skilldistillery.Blackjack.Hand.BlackjackHand;
import com.skilldistillery.Blackjack.Hand.Hand;
import com.skilldistillery.Blackjack.cards.Card;

public class BlackjackPlayer extends Player {
	
	private Hand hand;
	private int handValue;
	
	public BlackjackPlayer() {
		super();
		
	}
	
	public void getHand() {
		List<Card> playersHand = hand.getCards();
		System.out.println(" Player has ");
		for (Card card : playersHand) {
			System.out.println(card + " ");
		}
	}
	
	public int getHandValue() {
		handValue = hand.getHandValue();
		return handValue;
	}
	public void setHand(Hand hand) {
		this.hand = hand;
	}
	public void addCard(Card card) {
		hand.addCard(card);
	}


}
