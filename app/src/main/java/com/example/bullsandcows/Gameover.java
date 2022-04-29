package com.example.bullsandcows;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;
import com.example.bullsandcows.NewGame;
public class Gameover extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_over);
        final TextView text = (TextView) findViewById(R.id.move);
        final TextView guess = (TextView) findViewById(R.id.guess);
        guess.setText("Code: "+NewGame.code);
        text.setText("Moves: "+Integer.toString(NewGame.moves));
        final Button back = (Button) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Gameover.this, MainActivity.class));
            }
        });
    }
}
