package com.example.user.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import behaviours.Move;

import static behaviours.Move.PAPER;
import static behaviours.Move.ROCK;
import static behaviours.Move.SCISSORS;

public class MainActivity extends AppCompatActivity {

    TextView titleText;
    Button rockButton;
    Button paperButton;
    Button scissorsButton;
    Game game;
    Computer computer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titleText = (TextView) findViewById(R.id.title);
        rockButton = (Button) findViewById(R.id.rockButton);
        paperButton = (Button) findViewById(R.id.paperButton);
        scissorsButton = (Button) findViewById(R.id.scissorsButton);
        game = new Game();
        computer = new Computer();
    }


    public void onRockButtonClicked(View button) {
        Move playerEnum = ROCK;
        Move computerEnum = computer.getMove();
//        Log.d("Player Choice Rock", playerEnum.toString());
//        Log.d("Computer Choice", computerEnum.toString());
        game.compareMoves(playerEnum, computerEnum);
        Intent intentRock = new Intent(this, ResultActivity.class);
        intentRock.putExtra("player", "Player chose:" + playerEnum.toString());
        intentRock.putExtra("computer", "Computer chooses: " + computerEnum.toString());
        intentRock.putExtra("result", game.displayWinner(game.compareMoves(playerEnum, computerEnum)));
        this.startActivity(intentRock);
    }


    public void onPaperButtonClicked(View button) {
        Move playerEnum = PAPER;
        Move computerEnum = computer.getMove();
//        Log.d("Player Choice Paper", playerEnum.toString());
//        Log.d("Computer Choice", computerEnum.toString());
        game.compareMoves(playerEnum, computerEnum);
        Intent intentPaper = new Intent(this, ResultActivity.class);
        intentPaper.putExtra("player", "Player chose:" + playerEnum.toString());
        intentPaper.putExtra("computer", "Computer chooses: " + computerEnum.toString());
        intentPaper.putExtra("result", game.displayWinner(game.compareMoves(playerEnum, computerEnum)));
        this.startActivity(intentPaper);
    }


    public void onScissorsButtonClicked(View button) {
        Move playerEnum = SCISSORS;
        Move computerEnum = computer.getMove();
//        Log.d("Player Choice Scissors", playerEnum.toString());
//        Log.d("Computer Choice", computerEnum.toString());
        game.compareMoves(playerEnum, computerEnum);
        Intent intentScissors = new Intent(this, ResultActivity.class);
        intentScissors.putExtra("player", "Player chose:" + playerEnum.toString());
        intentScissors.putExtra("computer", "Computer chooses: " + computerEnum.toString());
        intentScissors.putExtra("result", game.displayWinner(game.compareMoves(playerEnum, computerEnum)));
        this.startActivity(intentScissors);
    }


}
