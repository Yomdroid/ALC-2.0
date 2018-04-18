package com.yoma.user.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MultiplayerActivity extends AppCompatActivity {

    Button proceed;
    EditText playerOne, playerTwo;
    Intent intent;
    String firstName,SecondName;
    int type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplayer);

        playerOne = (EditText) findViewById(R.id.playerone);
        playerTwo = (EditText) findViewById(R.id.playertwo);
        proceed = (Button) findViewById(R.id.proceed);

        firstName = playerOne.getText().toString();
        SecondName = playerTwo.getText().toString();

        intent = getIntent();
        final int tile = intent.getIntExtra("tileNumber", type);

        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (playerOne.getText().toString().equals("") || playerTwo.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Enter names of players", Toast.LENGTH_SHORT).show();
                    return;

                } else {
                    if (tile == 3) {
                        intent = new Intent(MultiplayerActivity.this, Human5.class);
                        intent.putExtra("firstplayer", playerOne.getText().toString());
                        intent.putExtra("secondplayer", playerTwo.getText().toString());
                        startActivity(intent);

                    } else if (tile == 2) {
                        intent = new Intent(MultiplayerActivity.this, Human4.class);
                        intent.putExtra("firstplayer", playerOne.getText().toString());
                        intent.putExtra("secondplayer", playerTwo.getText().toString());
                        startActivity(intent);

                    } else if (tile == 1) {
                        intent = new Intent(MultiplayerActivity.this, Human3.class);
                        intent.putExtra("firstplayer", playerOne.getText().toString());
                        intent.putExtra("secondplayer", playerTwo.getText().toString());
                        startActivity(intent);

                    }

                }

            }
        });
    }

}