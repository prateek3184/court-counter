package com.example.android.courtcounter;

import android.os.Debug;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0;
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void addThreeToTeamA(View v) {
        teamAScore = teamAScore + 3;
        displayTeamAScore(teamAScore);
    }

    public void addTwoToTeamA(View v) {
        teamAScore = teamAScore + 2;
        displayTeamAScore(teamAScore);
    }

    public void addOneToTeamA(View v) {
        teamAScore = teamAScore + 1;
        displayTeamAScore(teamAScore);
    }

    public void displayTeamAScore(int score) {
        TextView threePointScore = (TextView) findViewById(R.id.team_a_score);
        threePointScore.setText(String.valueOf(score));
    }

    public void addThreeToTeamB(View v) {
        teamBScore = teamBScore + 3;
        displayTeamBScore(teamBScore);
    }

    public void addTwoToTeamB(View v) {
        teamBScore = teamBScore + 2;
        displayTeamBScore(teamBScore);
    }

    public void addOneToTeamB(View v) {
        teamBScore = teamBScore + 1;
        displayTeamBScore(teamBScore);
    }

    public void displayTeamBScore(int score) {
        TextView threePointScore = (TextView) findViewById(R.id.team_b_score);
        threePointScore.setText(String.valueOf(score));

    }

    public void resetTeamScores(View v) {
        teamAScore = 0;
        teamBScore = 0;
        displayTeamAScore(teamAScore);
        displayTeamBScore(teamBScore);
    }


}
