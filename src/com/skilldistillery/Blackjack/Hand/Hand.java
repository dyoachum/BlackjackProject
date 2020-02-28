package com.skilldistillery.Blackjack.Hand;

import java.util.*;

import com.skilldistillery.Blackjack.cards.Card;

public abstract class Hand {
	
	public List<Card> cards;
	
	public Hand() {
		cards = new ArrayList<>();
		
	}
	public void addCard(Card card) {
		cards.add(card);
	}
	public void clear() {
		cards = new ArrayList<Card>();
		
	}
	
	
	public abstract int getHandValue();
	
	public List<Card> getCards(){
		return cards;
	}
	@Override
	public String toString() {
		return "" + cards;
	}
	public abstract boolean isBlackjack();
	
	public abstract boolean isBust();
	
	
	
	
	

}
