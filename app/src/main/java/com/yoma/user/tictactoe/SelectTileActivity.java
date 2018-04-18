package com.yoma.user.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SelectTileActivity extends AppCompatActivity {
    final static int Third_3 = 1;
    final static int Fourth_4 = 2;
    final static int Fifth_5 = 3;
    int type;

    Button threeTile, fourTile, fiveTile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_tile);

        threeTile = (Button) findViewById(R.id.three);
        fourTile = (Button) findViewById(R.id.four);
        fiveTile = (Button) findViewById(R.id.five);


        threeTile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                type = Third_3;
                openNext();
            }
        });
        fourTile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                type = Fourth_4;
                openNext();
            }
        });
        fiveTile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                type = Fifth_5;
                openNext();
            }
        });


    }
    public void openNext(){
            Intent next = new Intent(this,PickActivity.class);
            next.putExtra("tileNumber",type);
            startActivity(next);
        }
    }

