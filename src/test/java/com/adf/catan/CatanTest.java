package com.adf.catan;

import org.assertj.core.api.Assertions;
import org.assertj.core.api.Condition;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static com.adf.catan.TileType.*;
import static org.assertj.core.api.Assertions.assertThat;

public class CatanTest {

    @Test
    public void generateBoardTiles_3_4_5_4_3() throws Exception {
        Catan catan = new Catan();
        Board randomBoard = catan.createRandomBoard();

        List tiles = new ArrayList();

        for (int x = 0; x < 10 ; x++) {
            for (int y = 0; y < 5; y++) {
                Tile tile = randomBoard.tiles[x][y];
                tiles.add(tile.getType());
            }
        }

        assertThat(tiles).filteredOn(tileTypeOf(Clay)).hasSize(3);
        assertThat(tiles).filteredOn(tileTypeOf(Dessert)).hasSize(1);
        assertThat(tiles).filteredOn(tileTypeOf(Ore)).hasSize(3);
        assertThat(tiles).filteredOn(tileTypeOf(Sheep)).hasSize(4);
        assertThat(tiles).filteredOn(tileTypeOf(Wheat)).hasSize(4);
        assertThat(tiles).filteredOn(tileTypeOf(Wood)).hasSize(4);
        assertThat(tiles).filteredOn(tileTypeOf(Ocean)).hasSize(12);

    }

    private Condition<TileType> tileTypeOf(final TileType expectedType) {
        return new Condition<TileType>(){
            @Override
            public boolean matches(TileType value) {
                return expectedType ==value;
            }
        };
    }
}