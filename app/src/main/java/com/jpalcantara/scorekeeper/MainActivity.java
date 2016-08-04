package com.jpalcantara.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int pointsRockets = 0;
    int reboundRockets = 0;
    int foulRockets = 0;

    int pointsWarriors = 0;
    int reboundWarriors = 0;
    int foulWarriors = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void threePointsRockets (View v) {
        pointsRockets = pointsRockets + 3;
        displayPointsRockets(pointsRockets);
    }

    public void twoPointsRockets (View v) {
        pointsRockets = pointsRockets + 2;
        displayPointsRockets(pointsRockets);
    }

    public void onePointRockets (View v) {
        pointsRockets = pointsRockets + 1;
        displayPointsRockets(pointsRockets);
    }

    public void addReboundRockets (View v) {
        reboundRockets = reboundRockets + 1;
        displayReboundsRockets(reboundRockets);
    }

    public void subtractReboundRockets (View v) {
        reboundRockets = reboundRockets - 1;
        displayReboundsRockets(reboundRockets);
    }

    public void addFoulRockets (View v) {
        foulRockets = foulRockets + 1;
        displayFoulsRockets(foulRockets);
    }

    public void subtractFoulRockets (View v) {
        foulRockets = foulRockets - 1;
        displayFoulsRockets(foulRockets);
    }


    public void displayPointsRockets (int points) {
        TextView pointsView = (TextView) findViewById(R.id.pointsRockets);
        pointsView.setText(String.valueOf(points));
    }

    public void displayReboundsRockets (int rebounds) {
        TextView reboundsView = (TextView) findViewById(R.id.reboundsRockets);
        reboundsView.setText(String.valueOf(rebounds));
    }

    public void displayFoulsRockets (int fouls) {
        TextView foulsView = (TextView) findViewById(R.id.foulsRockets);
        foulsView.setText(String.valueOf(fouls));
    }


    public void threePointsWarriors (View v) {
        pointsWarriors = pointsWarriors + 3;
        displayPointsWarriors(pointsWarriors);
    }

    public void twoPointsWarriors (View v) {
        pointsWarriors = pointsWarriors + 2;
        displayPointsWarriors(pointsWarriors);
    }

    public void onePointWarriors (View v) {
        pointsWarriors = pointsWarriors + 1;
        displayPointsWarriors(pointsWarriors);
    }

    public void addReboundWarriors (View v) {
        reboundWarriors = reboundWarriors + 1;
        displayReboundsWarriors(reboundWarriors);
    }

    public void subtractReboundWarriors (View v) {
        reboundWarriors = reboundWarriors - 1;
        displayReboundsWarriors(reboundWarriors);
    }

    public void addFoulWarriors (View v) {
        foulWarriors = foulWarriors + 1;
        displayFoulsWarriors(foulWarriors);
    }

    public void subtractFoulWarriors (View v) {
        foulWarriors = foulWarriors - 1;
        displayFoulsWarriors(foulWarriors);
    }


    public void reset (View v) {
        pointsRockets = 0;
        reboundRockets = 0;
        foulRockets = 0;
        pointsWarriors = 0;
        reboundWarriors = 0;
        foulWarriors = 0;
        displayPointsRockets(pointsRockets);
        displayReboundsRockets(reboundRockets);
        displayFoulsRockets(foulRockets);
        displayPointsWarriors(pointsWarriors);
        displayReboundsWarriors(reboundWarriors);
        displayFoulsWarriors(foulWarriors);
    }


    public void displayPointsWarriors (int points) {
        TextView pointsView = (TextView) findViewById(R.id.pointsWarriors);
        pointsView.setText(String.valueOf(points));
    }

    public void displayReboundsWarriors (int rebounds) {
        TextView reboundsView = (TextView) findViewById(R.id.reboundsWarriors);
        reboundsView.setText(String.valueOf(rebounds));
    }

    public void displayFoulsWarriors (int fouls) {
        TextView foulsView = (TextView) findViewById(R.id.foulsWarriors);
        foulsView.setText(String.valueOf(fouls));
    }
}
