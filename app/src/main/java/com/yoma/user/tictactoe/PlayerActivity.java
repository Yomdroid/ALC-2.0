package com.yoma.user.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlayerActivity extends AppCompatActivity {

    int type;

    Button about,computer, player;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        computer = (Button) findViewById(R.id.computer);
        about = (Button) findViewById(R.id.about);
        player = (Button) findViewById(R.id.player);

        computer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computerPick();
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                about();
            }
        });

        player.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                playerPick();
            }
        });


    }

    public void computerPick (){
        Intent next = new Intent(this,SelectTileActivity.class);
        startActivity(next);
    }

    public void playerPick (){
        Intent next = new Intent(this,TileActivity.class);
        startActivity(next);
    }
    public void about (){
        Intent next = new Intent(this,About.class);
        startActivity(next);
    }
}
