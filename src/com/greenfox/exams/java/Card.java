package com.greenfox.exams.java;

/**
 * Created by aze on 2016.12.07..
 */
public class Card {
    public static final String COLOR_KARO = "karo";

    String color;
    int value;

    public Card(String color, int value) {
        this.color = color;
        if (value > 10) {
            this.value = 10;
        } else {
            this.value = value;
        }
    }

    public int getValue() {
        return value;
    }


    //This was not part of the exam, just an example for using the equals override
    @Override
    public boolean equals(Object o) {
        if (o instanceof Card) {
            Card other = (Card)o;
            return this.color.equals(((Card) o).color) && this.value == other.value;
        } else {
            return false;
        }
    }
}
