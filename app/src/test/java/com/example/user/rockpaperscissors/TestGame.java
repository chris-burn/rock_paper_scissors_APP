package com.example.user.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import behaviours.Move;

import static behaviours.Move.PAPER;
import static behaviours.Move.ROCK;
import static behaviours.Move.SCISSORS;
import static org.junit.Assert.assertEquals;

/**
 * Created by user on 04/07/2017.
 */

public class TestGame {

    Game game;

    @Before
    public void before(){
        this.game = new Game();
    }

    @Test
    public void canCompareMoves(){
        assertEquals(1, game.compareMoves(ROCK, SCISSORS));
    }


    @Test
    public void canDisplayWinner(){
        assertEquals("Player wins", game.displayWinner(1));
    }


}
