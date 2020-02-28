package com.skilldistillery.Blackjack.app;

import java.util.Scanner;

import com.skilldistillery.Blackjack.Players.BlackjackDealer;
import com.skilldistillery.Blackjack.Players.BlackjackPlayer;
import com.skilldistillery.Blackjack.Players.Player;
import com.skilldistillery.Blackjack.cards.Deck;

public class BlackjackApp {

	static Scanner kb = new Scanner(System.in);
	private BlackjackDealer bjDealer = new BlackjackDealer();
	private Player player = new BlackjackPlayer();
	private Deck deck = bjDealer.getDeck();

	public static void main(String[] args) {

		BlackjackApp game = new BlackjackApp();
		game.startGame();
	}

//	private void run() {
//		
//		startGame();
//			
//	}

	private void startGame() {
		// game intro
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
		player.setHand(bjDealer.newBlackjackGame(player.getHand()));
		// get players hand value

		System.out.println("Player has " + player.getHand().getHandValue());
		System.out.println(player.getHand());
		bjDealer.getBJdHand();

		if (bjDealer.getHand().isBlackjack()) {
			System.out.println("Dealer has Blackjack!");

		} else if (player.getHand().isBlackjack()) {
			System.out.println("Player has Blackjack!!!");
			bjDealerHit();
		} else {
			hitOrStay();

		}
		player.getHand().clear();
		bjDealer.getHand().clear();
		System.out.println("Would you like to play again?");
		System.out.println("1. Yes");
		System.out.println("2. No");
		int choice = kb.nextInt();
		switch (choice) {
		case 1:
			newBlackjackGame();

		case 2:
			System.out.println("Later Gator!");
			break;
		default:
			System.out.println("Invalid input");
			break;
		}
	}

	public void hitOrStay() {
		int choice = 0;
		while (choice != 2) {
			System.out.println("Press 1 to Hit");
			System.out.println("Press 2 to Stay with current cards");
			choice = kb.nextInt();
			switch (choice) {
			case 1:
				choice = playerHit();
				break;
			case 2:
				System.out.println("You're staying with " + player.getHand().getHandValue());
				if (player.getHand().getHandValue() <= 21 && bjDealer.getHandValue() < 17) {
					System.out.println("Dealer has " + bjDealer.getHand());
					bjDealerHit();
//					bjDealer.getHand().isBust();
					winnerCheck();

				}
				if (player.getHand().getHandValue() == bjDealer.getHand().getHandValue()) {
					System.out.println("Push");
					bjDealer.getHandValue();
				}
			}
		}
	}

	private void bjDealerHit() {
		while (bjDealer.getHandValue() < 17) {
			bjDealer.hitMe(deck.dealCard());
			System.out.println("Dealer has " + bjDealer.hand);
			System.out.println(bjDealer.getHandValue());
			if (bjDealer.getHand().isBlackjack()) {
				System.out.println("Dealer has Blackjack!!!");

			} else if (bjDealer.getHandValue() >= 17) {
				if (bjDealer.getHand().isBust()) {
					System.out.println("Dealer busts");
//				checkWin();

				}

			}
		}

//		System.out.println(bjDealer.getHand().getHandValue());

	}

	private int playerHit() {
		player.hitMe(deck.dealCard());
		System.out.println(player.getHand());
		System.out.println(((BlackjackPlayer) player).getHandValue());
		if (player.getHand().isBlackjack()) {
			System.out.println("Player has Blackjack!!!");
			return 2;
		} else if (player.getHand().isBust()) {
			System.out.println("Player busts");
			return 2;
		}
		return 0;
	}

	private void winnerCheck() {
		if (bjDealer.getHand().getHandValue() > player.getHand().getHandValue()
				&& bjDealer.getHand().getHandValue() <= 21) {
			System.out.println("Dealer wins.");
		} else if (bjDealer.getHand().getHandValue() < player.getHand().getHandValue()
				&& player.getHand().getHandValue() <= 21) {
			System.out.println("Player wins.");
		} else if (bjDealer.getHand().getHandValue() == player.getHand().getHandValue())
			System.out.println("It's a Push Game. No winners. Better Luck next time");
	}
}
