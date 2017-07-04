package com.example.user.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView playerText;
    TextView computerText;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        playerText = (TextView) findViewById(R.id.player_answer);
        computerText = (TextView)findViewById(R.id.computer_answer);
        resultText = (TextView)findViewById(R.id.winner_display);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        String playerChoice = extras.getString("player");
        playerText.setText(playerChoice);

        String computerChoice = extras.getString("computer");
        computerText.setText(computerChoice);

        String answer = extras.getString("result");
        resultText.setText(answer);
    }


//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_result);
//
//        computerText = (TextView)findViewById(R.id.computer_text);
//        resultText = (TextView)findViewById(R.id.result_text);
//
//        Intent intent = getIntent();
//        Bundle extras = intent.getExtras();
//
//        String computerChoice = extras.getString("computer");
//        computerText.setText(computerChoice);
//
//        String answer = extras.getString("result");
//        resultText.setText(answer);


}
