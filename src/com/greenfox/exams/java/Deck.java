package com.greenfox.exams.java;

import java.util.ArrayList;

/**
 * Created by aze on 2016.12.07..
 */
public class Deck {
    private static final String[] COLORS = new String[] {"karo", "treff", "kor", "pikk"};
    ArrayList<Card> cards;
    ArrayList<Card> used;

    public Deck() {
        cards = new ArrayList<>();
        for (String color : COLORS) {
            for (int i = 1; i < 14; i++) {
                cards.add(new Card(color, i));
            }
        }
        used = new ArrayList<>();
    }
}
