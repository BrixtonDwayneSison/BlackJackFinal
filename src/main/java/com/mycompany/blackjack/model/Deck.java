package com.mycompany.blackjack.model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author 97798
 */
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private final ArrayList<Card> cards;

    public Deck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};

        cards = new ArrayList<>();

        for (String suit : suits) {
            for (int j = 0; j < ranks.length; j++) {
                cards.add(new Card(suit, ranks[j], values[j]));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card drawCard() {
        return cards.remove(0);
    }
}

