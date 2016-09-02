package com.adf.catan;

public class Tile {
    private final int x;
    private final int y;
    private final TileType tileType;
    private TileChance tileChance;

    public Tile(int x, int y, TileType tileType) {
        this.x = x;
        this.y = y;
        this.tileType = tileType;
    }

    public Tile(int x, int y, TileType tileType, TileChance tileChance) {
        this(x, y, tileType);
        this.tileChance = tileChance;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public TileType getTileType() {
        return tileType;
    }

    public TileChance getTileChance() {
        return tileChance;
    }
}
