package com.example.user.rockpaperscissors;

import behaviours.Move;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by user on 22/06/2017.
 */

public class Computer {

    Move move;
    ArrayList<Move> computer;

    public Computer(){
        this.computer = new ArrayList<Move>();
        loadComputer();
    }

    public void loadComputer() {
        for (Move move : Move.values()) {
            computer.add(move);
        }
    }

    public int getComputerSize() {
        return computer.size();
    }

    public Move getMove(){
        Move[] moves = Move.values();
//        make array and funnel ENUMS into array using .values
        Random random = new Random();
        int index = random.nextInt(moves.length);
        return moves[index];
    }
}
