package com.skilldistillery.Blackjack.Hand;

import java.util.*;

import com.skilldistillery.Blackjack.cards.Card;

public abstract class Hand {
	
	protected List<Card> cards;
	
	public Hand(List<Card> cards) {
		cards = new ArrayList<Card>();
		this.cards = cards;
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
		StringBuilder builder = new StringBuilder();
		builder.append("Hand [cards=");
		builder.append(cards);
		builder.append("]");
		return builder.toString();
	}
	
	

}
