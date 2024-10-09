package com.example.bernatkopapirollo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    final int[] player_number = new int[1];
    final int[] computer_number = new int[1];

    ImageView choice_image = findViewById(R.id.choice_image);
    ImageView computer_image = findViewById(R.id.computer_image);

    TextView choice_text = findViewById(R.id.choice_text);
    TextView computer_text = findViewById(R.id.computer_text);

    TextView score_text = findViewById(R.id.score_text);

    Button rock = findViewById(R.id.rock_button);
    Button paper = findViewById(R.id.paper_button);
    Button scissors = findViewById(R.id.scissors_button);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choice_image.setImageResource(R.drawable.rock);
                player_number[0] = 1;
                final int min = 1;
                final int max = 3;
                final int random = new Random().nextInt((max - min) + 1) + min;
                computer_number[0] = random;

                if (random == 1) {
                    computer_image.setImageResource(R.drawable.rock);
                } else if (random == 2) {
                    computer_image.setImageResource(R.drawable.paper);
                } else {
                    computer_image.setImageResource(R.drawable.scissors);
                }
                decideWinner();
            }
        });

        paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choice_image.setImageResource(R.drawable.paper);
                player_number[0] = 2;
                final int min = 1;
                final int max = 3;
                final int random = new Random().nextInt((max - min) + 1) + min;
                computer_number[0] = random;

                if (random == 1) {
                    computer_image.setImageResource(R.drawable.rock);
                } else if (random == 2) {
                    computer_image.setImageResource(R.drawable.paper);
                } else {
                    computer_image.setImageResource(R.drawable.scissors);
                }
                decideWinner();
            }
        });

        scissors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choice_image.setImageResource(R.drawable.scissors);
                player_number[0] = 3;
                final int min = 1;
                final int max = 3;
                final int random = new Random().nextInt((max - min) + 1) + min;
                computer_number[0] = random;

                if (random == 1) {
                    computer_image.setImageResource(R.drawable.rock);
                } else if (random == 2) {
                    computer_image.setImageResource(R.drawable.paper);
                } else {
                    computer_image.setImageResource(R.drawable.scissors);
                }
                decideWinner();
            }
        });
    }

    public void decideWinner() {
        if (player_number[0] == computer_number[0]) {
            score_text.setText("Döntetlen");
        } else if (player_number[0] == 1 && computer_number[0] == 2) {
            score_text.setText("Gép nyert");
        } else if (player_number[0] == 1 && computer_number[0] == 3) {
            score_text.setText("Ember nyert");
        } else if (player_number[0] == 2 && computer_number[0] == 1) {
            score_text.setText("Ember nyert");
        } else if (player_number[0] == 3 && computer_number[0] == 1) {
            score_text.setText("Gép nyert");
        } else if (player_number[0] == 2 && computer_number[0] == 3) {
            score_text.setText("Gép nyert");
        } else if (player_number[0] == 3 && computer_number[0] == 2) {
            score_text.setText("Ember nyert");
        }
    }
}