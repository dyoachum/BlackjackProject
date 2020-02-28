package com.skilldistillery.Blackjack.Players;

import java.util.List;


import com.skilldistillery.Blackjack.Hand.Hand;
import com.skilldistillery.Blackjack.cards.Card;
import com.skilldistillery.Blackjack.cards.Deck;

public class BlackjackDealer extends BlackjackPlayer {

	private Deck deck;
	
	
	public BlackjackDealer() {
		super();
		deck = new Deck();

	}

	public Deck getDeck() {
		
		return deck;
	}
	//create Deck
	
	public Hand newBlackjackGame(Hand pHand) {
			// shuffle
		deck.shuffle();
			
			//deal cards to player and dealer
			pHand.addCard(deck.dealCard());
			
			hand.addCard(deck.dealCard());
			
			pHand.addCard(deck.dealCard());
			
			hand.addCard(deck.dealCard());
			
			return pHand;
	}

	

	

	public void getBJdHand() {
		List<Card> bjDHand = hand.getCards();
		System.out.println("The Dealer has: ");
		for (int i = 0; i < bjDHand.size(); i++) {
			if (i == 0) {
				System.out.println("Card face down");

			} else {
				System.out.println(bjDHand.get(i));
			}
		}
	}

//	public void getDealersHand() {
////		List<Card> bjDHand = hand.getCards();
////		System.out.println("The Dealer has: ");
////		for (int i = 0; i < bjDHand.size(); i++) {
////			System.out.println(bjDHand.get(i) + " ");
////
////		}
//		List<Card> bjDHand = hand.getCards();
//		System.out.println("The Dealer has: ");
//		for (int i = 0; i < bjDHand.size(); i++) {
//			if (i == 0) {
//				System.out.println(bjDHand.get(i));
//
//			} else {
//				System.out.println(bjDHand.get(i));
//			}
//		}
//	}
	}

	

