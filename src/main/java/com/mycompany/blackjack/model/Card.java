package com.mycompany.blackjack.model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 * Represents a playing card with a suit, rank, and value.
 */
public class Card {
    private final String suit;
    private final String rank;
    private final int value;

    /**
     * Constructs a Card with the specified suit, rank, and value.
     *
     * @param suit the suit of the card
     * @param rank the rank of the card
     * @param value the value of the card
     */
    public Card(String suit, String rank, int value) {
        this.suit = suit;
        this.rank = rank;
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
