package com.skilldistillery.Blackjack.cards;

import java.util.*;


public class Deck {
	private List<Card> cards;

	  public Deck() {
	    cards = createDeck();
	  }
	  
	  private List<Card> createDeck(){
	    List<Card> deck = new ArrayList<>(52);
	    for(Suit s : Suit.values()) {
	      for(Rank r : Rank.values()) {
	        deck.add(new Card(r, s));
	      }
	    }
	    return deck;
	  }
	  
	  public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	public int checkDeckSize() {
	    return cards.size();
	  }
	  
	  public void shuffle() {
	    Collections.shuffle(cards);
	  }
	  
	  public Card dealCard() {
	    return cards.remove(0);
	  }
}
