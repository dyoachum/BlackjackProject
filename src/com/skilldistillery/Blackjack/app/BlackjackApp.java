package com.skilldistillery.Blackjack.app;

import java.util.Scanner;

import com.skilldistillery.Blackjack.Players.BlackjackDealer;
import com.skilldistillery.Blackjack.Players.BlackjackPlayer;
import com.skilldistillery.Blackjack.cards.Deck;

public class BlackjackApp extends Deck {

	static Scanner kb = new Scanner(System.in);
	private BlackjackDealer bjDealer = new BlackjackDealer();
	private BlackjackPlayer player = new BlackjackPlayer();

	public static void main(String[] args) {
	
	BlackjackApp game = new BlackjackApp();
	game.run();
	}
	private void run() {
		startGame();
	}
	
	private void startGame() {
		//game intro
		System.out.println("Welcome to Blackjack!");
		System.out.println("Enter 1 to play a quick game.");
		System.out.println("Enter 2 to Leave game");
		System.out.println("The Dealer is waiting.....");
		int choice = kb.nextInt();
		switch (choice) {
		case 1:
			newBlackjackGame();
			break;
		case 2:
			System.out.println("So long....Partner");
			break;
			default:
				System.out.println("You didn't read the directions.");
	}
			
		}
	public void newBlackjackGame() {
		// shuffle
		bjDealer.shuffle();
		//deal cards to player and dealer
		player.addCard(bjDealer.dealCard());
		bjDealer.addCard(bjDealer.dealCard());
		player.addCard(bjDealer.dealCard());
		bjDealer.addCard(bjDealer.dealCard());
		//get players hand value
		player.getHand();
		System.out.println("Player has " + player.getHandValue());
		bjDealer.getBJdHand();
		
		isBlackjack(); /* not understanding why it wants me to create another method for this
		if I already have one in the other classes */
		if (player.getHandValue() < 21 && bjDealer.getHandValue() < 21) {
			
			hitOrStay();
		}
		}
		private void isBlackjack() {
		// TODO Auto-generated method stub
		
	}
		public void hitOrStay() {
			System.out.println("Press 1 to Hit");
			System.out.println("Press 2 to Stay with current cards");
			int choice = kb.nextInt();
			switch (choice) {
			case 1:
				playerHit();
				break;
			case 2:
				System.out.println("You're staying with " + player.getHandValue());
				if (player.getHandValue() <= 21 && bjDealer.getHandValue() < 17) {
					bjDealerHit();
					bjDealer.isBust();/* same with this one*/
					newBlackjackGame();
				}
				if ( player.getHandValue() == bjDealer.getHandValue()) {
					System.out.println("Push");
					bjDealer.dealersHand();
				}
				}
			}
		private void bjDealerHit() {
			// TODO Auto-generated method stub
			
		}
		private void playerHit() {
			// TODO Auto-generated method stub
			
		}
		}
		
	





























