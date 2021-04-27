package com.labcnt.smarttirtayasa;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button answer1, answer2, answer3, answer4;

    TextView score, question;

    private com.labcnt.smarttirtayasa.Question nQuestion = new com.labcnt.smarttirtayasa.Question();

    private String nAnswer;
    private int nScore = 0;
    private int nQuestionLength = nQuestion.nQuestion.length;

    Random r;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r = new Random();

        answer1 = (Button) findViewById(R.id.answer1);
        answer2 = (Button) findViewById(R.id.answer2);
        answer3 = (Button) findViewById(R.id.answer3);
        answer4 = (Button) findViewById(R.id.answer4);

        score = (TextView) findViewById(R.id.score);
        question = (TextView) findViewById(R.id.question);

        score.setText("Score: " + nScore);

        updateQuestion(r.nextInt(nQuestionLength));

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer1.getText() == nAnswer){
                    nScore++;
                    score.setText("Score: " + nScore);
                    updateQuestion(r.nextInt(nQuestionLength));
                } else {
                    gameOver();
                }
            }
        });

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer2.getText() == nAnswer){
                    nScore++;
                    score.setText("Score: " + nScore);
                    updateQuestion(r.nextInt(nQuestionLength));
                } else {
                    gameOver();
                }
            }
        });

        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer3.getText() == nAnswer){
                    nScore++;
                    score.setText("Score: " + nScore);
                    updateQuestion(r.nextInt(nQuestionLength));
                } else {
                    gameOver();
                }
            }
        });

        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer4.getText() == nAnswer){
                    nScore++;
                    score.setText("Score: " + nScore);
                    updateQuestion(r.nextInt(nQuestionLength));
                } else {
                    gameOver();
                }
            }
        });

    }

    private void updateQuestion(int num){
        question.setText(nQuestion.getQuestion(num));
        answer1.setText(nQuestion.getChoice1(num));
        answer2.setText(nQuestion.getChoice2(num));
        answer3.setText(nQuestion.getChoice3(num));
        answer4.setText(nQuestion.getChoice4(num));

        nAnswer = nQuestion.getCorrectAnswer(num);

    }

    private void gameOver(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(com.labcnt.smarttirtayasa.MainActivity.this);
        alertDialogBuilder

                .setMessage("Game Over !, Skor anda adalah " + nScore + "Point")
                .setCancelable(false)
                .setPositiveButton("New Game",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                startActivity(new Intent(getApplicationContext(), com.labcnt.smarttirtayasa.MainActivity.class));
                            }
                        })

                .setNegativeButton("Exit",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                finish();
                            }
                        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();

    }


}