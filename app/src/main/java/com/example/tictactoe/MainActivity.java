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
        final TextView playerTurn = findViewById(R.id.textView);
        newGame.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        playerTurn.setText("Player X's Turn");
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
                        if (playerTurn.getText().equals("Player X's Turn")) {
                            buttonOne.setText("X");
                            playerTurn.setText("Player O's Turn");
                        }
                        else {
                            button1.setText("O");
                            playerTurn.setText("Player X's Turn");
                        }
                    }
                }
        );
        button2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView buttonTwo =
                                findViewById(R.id.button2);
                        if (playerTurn.getText().equals("Player X's Turn")) {
                            buttonTwo.setText("X");
                            playerTurn.setText("Player O's Turn");
                        }
                        else {
                            button2.setText("O");
                            playerTurn.setText("Player X's Turn");
                        }
                    }
                }
        );
        button3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView buttonThree =
                                findViewById(R.id.button3);
                        if (playerTurn.getText().equals("Player X's Turn")) {
                            buttonThree.setText("X");
                            playerTurn.setText("Player O's Turn");
                        }
                        else {
                            button3.setText("O");
                            playerTurn.setText("Player X's Turn");
                        }
                    }
                }
        );
        button4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView buttonFour =
                                findViewById(R.id.button4);
                        if (playerTurn.getText().equals("Player X's Turn")) {
                            buttonFour.setText("X");
                            playerTurn.setText("Player O's Turn");
                        }
                        else {
                            button4.setText("O");
                            playerTurn.setText("Player X's Turn");
                        }
                    }
                }
        );
        button5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView buttonFive =
                                findViewById(R.id.button5);
                        if (playerTurn.getText().equals("Player X's Turn")) {
                            buttonFive.setText("X");
                            playerTurn.setText("Player O's Turn");
                        }
                        else {
                            button5.setText("O");
                            playerTurn.setText("Player X's Turn");
                        }
                    }
                }
        );
        button6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView buttonSix =
                                findViewById(R.id.button6);
                        if (playerTurn.getText().equals("Player X's Turn")) {
                            buttonSix.setText("X");
                            playerTurn.setText("Player O's Turn");
                        }
                        else {
                            button6.setText("O");
                            playerTurn.setText("Player X's Turn");
                        }
                    }
                }
        );
        button7.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView buttonSeven =
                                findViewById(R.id.button7);
                        if (playerTurn.getText().equals("Player X's Turn")) {
                            buttonSeven.setText("X");
                            playerTurn.setText("Player O's Turn");
                        }
                        else {
                            button7.setText("O");
                            playerTurn.setText("Player X's Turn");
                        }
                    }
                }
        );
        button8.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView buttonEight =
                                findViewById(R.id.button8);
                        if (playerTurn.getText().equals("Player X's Turn")) {
                            buttonEight.setText("X");
                            playerTurn.setText("Player O's Turn");
                        }
                        else {
                            button8.setText("O");
                            playerTurn.setText("Player X's Turn");
                        }
                    }
                }
        );
        button9.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView buttonNine =
                                findViewById(R.id.button9);
                        if (playerTurn.getText().equals("Player X's Turn")) {
                            buttonNine.setText("X");
                            playerTurn.setText("Player O's Turn");
                        }
                        else {
                            button9.setText("O");
                            playerTurn.setText("Player X's Turn");
                        }
                    }
                }
        );
    }
}