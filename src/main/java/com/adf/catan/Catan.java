package com.adf.catan;

/*
 * This Java source file was auto generated by running 'gradle buildInit --type java-library'
 * by 'alex' at '9/2/16 4:01 PM' with Gradle 2.12
 *
 * @author alex, @date 9/2/16 4:01 PM
 */
public class Catan {
    public Board createHarmonyBoard() {
        Board board = new Board();
        //y=0
        board.putTile(new Tile(0,0, TileType.Ocean));
        board.putTile(new Tile(1,0, TileType.Ocean));
        board.putTile(new Tile(2,0, TileType.Wheat, TileChance.Five));
        board.putTile(new Tile(4,0, TileType.Wood, TileChance.Two));
        board.putTile(new Tile(6,0, TileType.Sheep, TileChance.Six));
        board.putTile(new Tile(8,0, TileType.Ocean));
        board.putTile(new Tile(9,0, TileType.Ocean));

        //y=1
        board.putTile(new Tile(0,1, TileType.Ocean));
        board.putTile(new Tile(1,1, TileType.Ore, TileChance.Ten));
        board.putTile(new Tile(3,1, TileType.Ore, TileChance.Nine));
        board.putTile(new Tile(5,1, TileType.Dessert));
        board.putTile(new Tile(7,1, TileType.Clay, TileChance.Three));
        board.putTile(new Tile(9,1, TileType.Ocean));

        //y=2
        board.putTile(new Tile(0,2, TileType.Sheep, TileChance.Eight));
        board.putTile(new Tile(2,2, TileType.Sheep, TileChance.Three));
        board.putTile(new Tile(4,2, TileType.Clay, TileChance.Eleven));
        board.putTile(new Tile(6,2, TileType.Wheat, TileChance.Four));
        board.putTile(new Tile(8,2, TileType.Wood, TileChance.Eight));

        //y=3
        board.putTile(new Tile(0,3, TileType.Ocean));
        board.putTile(new Tile(1,3, TileType.Wood, TileChance.Four));
        board.putTile(new Tile(3,3, TileType.Wheat, TileChance.Six));
        board.putTile(new Tile(5,3, TileType.Wheat, TileChance.Five));
        board.putTile(new Tile(7,3, TileType.Sheep, TileChance.Ten));
        board.putTile(new Tile(9,3, TileType.Ocean));

        //y=4
        board.putTile(new Tile(0,4, TileType.Ocean));
        board.putTile(new Tile(1,4, TileType.Ocean));
        board.putTile(new Tile(2,4, TileType.Clay, TileChance.Eleven));
        board.putTile(new Tile(4,4, TileType.Wood, TileChance.Twelve));
        board.putTile(new Tile(6,4, TileType.Ore, TileChance.Nine));
        board.putTile(new Tile(8,4, TileType.Ocean));
        board.putTile(new Tile(9,4, TileType.Ocean));

        return board;
    }
}
