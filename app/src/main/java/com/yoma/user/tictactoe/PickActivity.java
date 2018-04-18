package com.yoma.user.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class PickActivity extends AppCompatActivity {

    int type;
    Button btnX, btnO;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick);

        btnX = (Button) findViewById(R.id.btnX);
        btnO = (Button) findViewById(R.id.btnO);

         intent = getIntent();
        final int tile = intent.getIntExtra("tileNumber",type);



            btnO.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (tile == 3)
                        intent = new Intent(PickActivity.this, AIBrain5.class);
                    else if (tile == 2)
                        intent = new Intent(PickActivity.this, AIBrain4.class);
                    else
                        intent = new Intent(PickActivity.this, AIBrain3.class);
                    intent.putExtra("playerTurn", 2);
                    startActivity(intent);

                }
            });

            btnX.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (tile == 3)
                        intent = new Intent(PickActivity.this, AIBrain5.class);
                    else if (tile == 2)
                        intent = new Intent(PickActivity.this, AIBrain4.class);
                    else
                        intent = new Intent(PickActivity.this, AIBrain3.class);
                    intent.putExtra("playerTurn", 1);
                    startActivity(intent);
                }
            });

    }

}
