package com.example.user.rockpaperscissors;

import behaviours.Move;

import static behaviours.Move.PAPER;
import static behaviours.Move.ROCK;
import static behaviours.Move.SCISSORS;

/**
 * Created by user on 22/06/2017.
 */

public class Game {


    public Game(){}

    public int compareMoves(Move playerMove, Move computerMove){
        if (playerMove == computerMove){
            return 0;
        }

        switch (playerMove){
            case ROCK :
                return (computerMove == SCISSORS ? 1 : -1);
//            1 is player win, -1 is computer win
            case PAPER :
                return (computerMove == ROCK ? 1 : -1);
            case SCISSORS :
                return (computerMove == PAPER ? 1 : -1);
            default:
                return 0;
        }
    }

    public String displayWinner(int result){
        switch (result){
            case 0:
                return "IT'S A DRAW!";
            case 1:
                return "PLAYER WINS!";
            case -1:
                return "COMPUTER WINS!";
            default:
                return null;
        }
    }

}
