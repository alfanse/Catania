package com.adf.catan;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alex on 02/09/2016.
 */
public class Board {

    //hex tiles represented as overlapping rectangles (x = horizontal, y = vertical)
    //each tile spans 2x and 1y.
    Tile[][] tiles = new Tile[10][5];
    List<Tile> tileList = new ArrayList<>();

    public Board() {
    }

    public void putTile(Tile tile) {
        tiles[tile.getX()][tile.getY()]=tile;
        tileList.add(tile);
    }
}
