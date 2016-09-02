package com.adf.catan;

import org.assertj.core.api.Condition;
import org.junit.Test;

import java.util.List;

import static com.adf.catan.TileType.*;
import static org.assertj.core.api.Assertions.assertThat;

public class CatanTest {

    @Test
    //http://menzgaming.com/settlersofcatan/settlers-catan-board-harmony/
    public void generateHarmonyBoard() throws Exception {
        Catan catan = new Catan();
        Board randomBoard = catan.createHarmonyBoard();

        List tilesList = randomBoard.tileList;
        assertAllTileTypesAllocated(tilesList);
        assertAllTileChancesAllocated(tilesList);

    }

    private void assertAllTileTypesAllocated(List tiles) {
        assertThat(tiles).filteredOn(tileTypeOf(Clay)).hasSize(3);
        assertThat(tiles).filteredOn(tileTypeOf(Dessert)).hasSize(1);
        assertThat(tiles).filteredOn(tileTypeOf(Ore)).hasSize(3);
        assertThat(tiles).filteredOn(tileTypeOf(Sheep)).hasSize(4);
        assertThat(tiles).filteredOn(tileTypeOf(Wheat)).hasSize(4);
        assertThat(tiles).filteredOn(tileTypeOf(Wood)).hasSize(4);
        assertThat(tiles).filteredOn(tileTypeOf(Ocean)).hasSize(12);
    }

    private void assertAllTileChancesAllocated(List tiles) {
        assertThat(tiles).filteredOn(tileChanceOf(TileChance.Two)).hasSize(1);
        assertThat(tiles).filteredOn(tileChanceOf(TileChance.Three)).hasSize(2);
        assertThat(tiles).filteredOn(tileChanceOf(TileChance.Four)).hasSize(2);
        assertThat(tiles).filteredOn(tileChanceOf(TileChance.Five)).hasSize(2);
        assertThat(tiles).filteredOn(tileChanceOf(TileChance.Six)).hasSize(2);
        assertThat(tiles).filteredOn(tileChanceOf(TileChance.Seven)).hasSize(0);
        assertThat(tiles).filteredOn(tileChanceOf(TileChance.Eight)).hasSize(2);
        assertThat(tiles).filteredOn(tileChanceOf(TileChance.Nine)).hasSize(2);
        assertThat(tiles).filteredOn(tileChanceOf(TileChance.Ten)).hasSize(2);
        assertThat(tiles).filteredOn(tileChanceOf(TileChance.Eleven)).hasSize(2);
        assertThat(tiles).filteredOn(tileChanceOf(TileChance.Twelve)).hasSize(1);
    }

    private Condition<Tile> tileChanceOf(final TileChance seven) {
        return new Condition<Tile>() {
            @Override
            public boolean matches(Tile value) {
                return seven == value.getTileChance();
            }
        };
    }

    private Condition<Tile> tileTypeOf(final TileType expectedType) {
        return new Condition<Tile>(){
            @Override
            public boolean matches(Tile value) {
                return expectedType == value.getTileType();
            }
        };
    }
}