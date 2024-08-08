/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.blackjack.game;


import com.mycompany.blackjack.model.Deck;
import com.mycompany.blackjack.model.Player;
import java.util.Scanner;

public class Game {
    private final Deck deck;
    private final Player player;
    private final Player dealer;

    public Game() {
        deck = new Deck();
        player = new Player();
        dealer = new Player();
        deck.shuffle();
    }

    public void start() {
        player.addCard(deck.drawCard());
        player.addCard(deck.drawCard());
        dealer.addCard(deck.drawCard());
        dealer.addCard(deck.drawCard());

        try (Scanner scanner = new Scanner(System.in)) {
            String input;
            
            while (true) {
                System.out.println("Player's hand: " + player.getHand() + " (score: " + player.getScore() + ")");
                System.out.println("Dealer's visible card: " + dealer.getHand().get(0));
                
                if (player.isBust()) {
                    System.out.println("You busted! Dealer wins.");
                    break;
                }
                
                System.out.print("Do you want to hit or stay? ");
                input = scanner.nextLine();
                
                if (input.equalsIgnoreCase("hit")) {
                    player.addCard(deck.drawCard());
                } else if (input.equalsIgnoreCase("stay")) {
                    while (dealer.getScore() < 17) {
                        dealer.addCard(deck.drawCard());
                    }
                    
                    System.out.println("Dealer's hand: " + dealer.getHand() + " (score: " + dealer.getScore() + ")");
                    
                    if (dealer.isBust() || player.getScore() > dealer.getScore()) {
                        System.out.println("You win!");
                    } else if (player.getScore() == dealer.getScore()) {
                        System.out.println("It's a tie!");
                    } else {
                        System.out.println("Dealer wins.");
                    }
                    break;
                }
            }
        }
    }

  
}


