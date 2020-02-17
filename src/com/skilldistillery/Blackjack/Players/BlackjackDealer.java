package com.skilldistillery.Blackjack.Players;

import java.util.Collections;
import java.util.List;

import com.skilldistillery.Blackjack.Hand.BlackjackHand;
import com.skilldistillery.Blackjack.cards.Card;
import com.skilldistillery.Blackjack.cards.Deck;

public class BlackjackDealer extends Player {

	private Deck cards;
	private BlackjackHand dHand;

	

	public BlackjackDealer() {
		super();
		
	}

	public Card dealCard() {
		return cards.dealCard();
	}

	public void addCard(Card card) {
		dHand.addCard(card);
	}

	public int getHandValue() {
		int handValue = dHand.getHandValue();
		return handValue;
	}

	@SuppressWarnings("unchecked")
	public void shuffle() {
		Collections.shuffle((List<Card>) cards);
	}

	public void getBJdHand() {
		List<Card> bjDHand = dHand.getCards();
		System.out.println("The Dealer has: ");
		for (int i = 0; i < bjDHand.size(); i++) {
			if (i == 0) {
				System.out.println("Card face down");

			} else {
				System.out.println(bjDHand.get(i) + " ");
			}
		}
	}

	public void dealersHand() {
		List<Card> bjDHand = dHand.getCards();
		System.out.println("The Dealer has: ");
		for (int i = 0; i < bjDHand.size(); i++) {
			System.out.println(bjDHand.get(i) + " ");

		}
	}

	public void isBust() {
		// TODO Auto-generated method stub
		
	}
}
