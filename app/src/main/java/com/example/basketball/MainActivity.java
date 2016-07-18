package com.example.basketball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.basketball.R;

public class MainActivity extends AppCompatActivity {
    int TeamA = 0;
    int TeamAFoul =0;
    int TeamATimeout=0;
    int TeamB = 0;
    int TeamBFoul =0;
    int TeamBTimeout =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void teamA1(View view) {

        TeamA = TeamA + 1;
        displayScoreForTeamA(TeamA);
    }

    public void teamA2(View view) {
        TeamA = TeamA + 2;
        displayScoreForTeamA(TeamA);
    }

    public void teamA3(View view) {
        TeamA = TeamA + 3;
        displayScoreForTeamA(TeamA);
    }
    public void teamAFoulButton(View view) {
        TeamAFoul = TeamAFoul + 1;
        displayFoulForTeamA(TeamAFoul);
    }
    public void teamATimeoutButton(View view) {
        TeamATimeout = TeamATimeout + 1;
        displayTimeoutForTeamA(TeamATimeout);
    }

    private void displayScoreForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamAScore);
        scoreView.setText("" + score);
    }
    private void displayFoulForTeamA(int foul) {
        TextView scoreView = (TextView) findViewById(R.id.teamAFoul);
        scoreView.setText(String.valueOf(foul));
    }
    private void displayTimeoutForTeamA(int Timeout) {
        TextView scoreView = (TextView) findViewById(R.id.teamATimeout);
        scoreView.setText(String.valueOf(Timeout));
    }

    public void teamB1(View view) {
        TeamB = TeamB + 1;
        displayScoreForTeamB(TeamB);
    }

    public void teamB2(View view) {
        TeamB = TeamB + 2;
        displayScoreForTeamB(TeamB);
    }

    public void teamB3(View view) {
        TeamB = TeamB + 3;
        displayScoreForTeamB(TeamB);
    }
    public void teamBFoulButton(View view) {
        TeamBFoul = TeamBFoul + 1;
        displayFoulForTeamB(TeamBFoul);
    }
    public void teamBTimeoutButton(View view) {
        TeamBTimeout = TeamBTimeout + 1;
        displayTimeoutForTeamB(TeamBTimeout);
    }

    private void displayScoreForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamBScore);
        scoreView.setText(String.valueOf(score));
    }
    private void displayFoulForTeamB(int foul) {
        TextView scoreView = (TextView) findViewById(R.id.teamBFoul);
        scoreView.setText(String.valueOf(foul));
    }
    private void displayTimeoutForTeamB(int Timeout) {
        TextView scoreView = (TextView) findViewById(R.id.teamBTimeout);
        scoreView.setText(String.valueOf(Timeout));
    }
    public void resetButton(View view) {
        TeamA = 0;
        TeamB = 0;
        TeamAFoul =0;
        TeamATimeout=0;
        TeamBFoul =0;
        TeamBTimeout =0;
        displayScoreForTeamA(0);
        displayScoreForTeamB(0);
        displayFoulForTeamA(0);
        displayFoulForTeamB(0);
        displayTimeoutForTeamA(0);
        displayTimeoutForTeamB(0);

    }
}