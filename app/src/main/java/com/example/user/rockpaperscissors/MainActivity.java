package com.example.user.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import behaviours.Move;

import static behaviours.Move.ROCK;

public class MainActivity extends AppCompatActivity {

    Button rockButton;
    Button paperButton;
    Button scissorsButton;
    Game game;
    Computer computer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rockButton = (Button) findViewById(R.id.rockButton);
        paperButton = (Button) findViewById(R.id.paperButton);
        scissorsButton = (Button) findViewById(R.id.scissorsButton);
        game = new Game();
        computer = new Computer();
    }


    public void onRockButtonClicked(View button) {
        Move playerEnum = ROCK;
        Move computerEnum = computer.getMove();

        game.compareMoves(playerEnum, computerEnum);
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("result", game.displayWinner(game.compareMoves(playerEnum, computerEnum)));
        //        tag extra info to pass as "answer" which calls on method
        this.startActivity(intent);
    }



}
