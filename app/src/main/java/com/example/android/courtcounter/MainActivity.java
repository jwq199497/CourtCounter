package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamAScore);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.teamBScore);
        scoreView.setText(String.valueOf(score));
    }

    public void p1A(View view){
        scoreA = scoreA + 1;
        displayForTeamA(scoreA);
    }

    public void p2A(View view){
        scoreA = scoreA + 2;
        displayForTeamA(scoreA);
    }

    public void p3A(View view){
        scoreA = scoreA + 3;
        displayForTeamA(scoreA);
    }

    public void p1B(View view){
        scoreB = scoreB + 1;
        displayForTeamB(scoreB);
    }

    public void p2B(View view){
        scoreB = scoreB + 2;
        displayForTeamB(scoreB);
    }

    public void p3B(View view){
        scoreB = scoreB + 3;
        displayForTeamB(scoreB);
    }


    public void reset(View view){
        displayForTeamA(0);
        displayForTeamB(0);
    }

}
