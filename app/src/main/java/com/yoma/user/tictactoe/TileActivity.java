package com.yoma.user.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TileActivity extends AppCompatActivity {
    final static int Third_3 = 1;
    final static int Fourth_4 = 2;
    final static int Fifth_5 = 3;
    int type;

    Button button3,button4, button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tile);

        button3 = (Button) findViewById(R.id.three);
        button4 = (Button) findViewById(R.id.four);
        button5 = (Button) findViewById(R.id.five);


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                type = Third_3;
                openNext();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                type = Fourth_4;
                openNext();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                type = Fifth_5;
                openNext();
            }
        });


    }
    public void openNext(){
        Intent next = new Intent(this,MultiplayerActivity.class);
        next.putExtra("tileNumber",type);
        startActivity(next);
    }
}
