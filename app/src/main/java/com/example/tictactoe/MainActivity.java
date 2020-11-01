package com.example.tictactoe;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button1 = findViewById(R.id.button1);
        final Button button2 = findViewById(R.id.button2);
        final Button button3 = findViewById(R.id.button3);
        final Button button4 = findViewById(R.id.button4);
        final Button button5 = findViewById(R.id.button5);
        final Button button6 = findViewById(R.id.button6);
        final Button button7 = findViewById(R.id.button7);
        final Button button8 = findViewById(R.id.button8);
        final Button button9 = findViewById(R.id.button9);
        Button newGame = findViewById(R.id.newGameButton);
        newGame.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        button1.setText("");
                        button2.setText("");
                        button3.setText("");
                        button4.setText("");
                        button5.setText("");
                        button6.setText("");
                        button7.setText("");
                        button8.setText("");
                        button9.setText("");
                    }
                }
        );

        button1.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        TextView buttonOne =
                                findViewById(R.id.button1);
                        buttonOne.setText("X");
                    }
                }
        );
        button2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView buttonTwo =
                                findViewById(R.id.button2);
                        buttonTwo.setText("X");
                    }
                }
        );
        button3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView buttonThree =
                                findViewById(R.id.button3);
                        buttonThree.setText("X");
                    }
                }
        );
        button4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView buttonFour =
                                findViewById(R.id.button4);
                        buttonFour.setText("X");
                    }
                }
        );
        button5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView buttonFive =
                                findViewById(R.id.button5);
                        buttonFive.setText("X");
                    }
                }
        );
        button6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView buttonSix =
                                findViewById(R.id.button6);
                        buttonSix.setText("X");
                    }
                }
        );
        button7.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView buttonSeven =
                                findViewById(R.id.button7);
                        buttonSeven.setText("X");
                    }
                }
        );
        button8.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView buttonEight =
                                findViewById(R.id.button8);
                        buttonEight.setText("X");
                    }
                }
        );
        button9.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView buttonNine =
                                findViewById(R.id.button9);
                        buttonNine.setText("X");
                    }
                }
        );
    }
}