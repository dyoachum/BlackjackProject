package com.skilldistillery.Blackjack.Hand;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.Blackjack.cards.Card;

public class BlackjackDealerHand extends BlackjackHand {
	public BlackjackDealerHand(List<Card> cards) {
		super(cards);
		// TODO Auto-generated constructor stub
	}
	private List<Card> dealerHand = new ArrayList<>();

	public void displayDealerHand() {
		
	}
	public List<Card> Deck(){
		return dealerHand;
	}
	public List<Card> getDealerHand() {
		return dealerHand;
	}
	public void setDealerHand(List<Card> dealerHand) {
		this.dealerHand = dealerHand;
	}
	@Override
	public String toString() {
		return "BlackjackDealerHand [dealerHand=" + dealerHand + "]";
	}


	

}
