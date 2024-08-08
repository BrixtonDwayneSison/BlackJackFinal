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

public class Player {
    private final ArrayList<Card> hand;
    private int score;

    public Player() {
        hand = new ArrayList<>();
        score = 0;
    }

    public void addCard(Card card) {
        hand.add(card);
        score += card.getValue();
    }

    public int getScore() {
        return score;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public boolean isBust() {
        return score > 21;
    }
}

