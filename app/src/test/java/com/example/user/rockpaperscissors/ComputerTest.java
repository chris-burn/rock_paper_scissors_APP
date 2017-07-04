package com.example.user.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import behaviours.Move;

import static behaviours.Move.PAPER;
import static org.junit.Assert.assertEquals;

/**
 * Created by user on 04/07/2017.
 */

public class ComputerTest {

    Computer computer;

    @Before
    public void before(){
        this.computer = new Computer();
    }


    @Test
    public void canLoadComputerArray(){
        assertEquals(3, computer.getComputerSize());
    }

    @Test
    public void canGetRandomMove(){
        Computer spyComputer = Mockito.spy(computer);
        Mockito.when(spyComputer.getMove()).thenReturn(PAPER);

        assertEquals(PAPER, spyComputer.getMove());
    }






}
