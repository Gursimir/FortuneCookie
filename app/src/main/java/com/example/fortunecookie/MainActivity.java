package com.example.fortunecookie;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView);
        Button button = findViewById(R.id.button);

        String[] fortune = {"The love of your life is right in front of your eyes.",

                "Behind this fortune is the love of my life.",

                "You have a secret admirer.",

                "Love, because it is the only true adventure.",

                "The love of your life will appear in front of you unexpectedly!",

                "An old love will come back to you.",

                "Your love life will soon be happy and harmonious."};
            Random random = new Random();

            button.setOnClickListener(v -> textView.setText(fortune[random.nextInt(fortune.length)]));
    }
}