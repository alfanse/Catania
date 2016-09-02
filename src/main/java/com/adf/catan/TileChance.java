package com.adf.catan;

/**
 * Created by alex on 02/09/2016.
 */
public enum TileChance {
    Two(2, 1),
    Three(3, 2),
    Four(4, 3),
    Five(5, 4),
    Six(6, 5),
    Seven(7, 6),
    Eight(8, 5),
    Nine(9, 4),
    Ten(10, 3),
    Eleven(11, 2),
    Twelve(12, 1);

    private final int number;
    private final int combinations;

    TileChance(int number, int combinations) {
        this.number = number;
        this.combinations = combinations;
    }
}
