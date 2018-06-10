package com.example.ajadiabiola.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /*method to display score*/
    public void displayForTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.Team_a_score);
                scoreView.setText(String.valueOf(score));
    }

    /*method to display score for team b*/
    public void displayForTeamB (int score){
        TextView scoreView = (TextView) findViewById(R.id.Team_b_score);
    scoreView.setText(String.valueOf(score));}
    /* method to add three points for team a*/

    public void addThreeForTeamA(View v){
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }
/*method to add three points to team b*/


    public void addThreeForTeamB (View v) {
        scoreTeamB =scoreTeamB +3;
        displayForTeamB(scoreTeamB);
    }
    /*method to add 2 points to team a*/
    public void addTwoForTeamA(View v){
    scoreTeamA = scoreTeamA + 2;
    displayForTeamA(scoreTeamA);}

    /*method to add 2 points to team b */
    public void addTwoForTeamB (View v){
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    /*method to add one point for team A*/
    public  void addOneToTeamA(View v)
    {
        scoreTeamA = scoreTeamA +1;
        displayForTeamA(scoreTeamA);
    }

    /*method to add one point for team b*/
    public  void addOneToTeamB(View v)
    {
        scoreTeamB = scoreTeamB +1;
        displayForTeamB(scoreTeamB);
    }

}

