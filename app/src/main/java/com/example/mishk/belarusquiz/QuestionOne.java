package com.example.mishk.belarusquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import com.example.mishk.belarusquiz.R;

public class QuestionOne extends AppCompatActivity {
    int userScore = 0;

    @Override
    protected void onCreate(Bundle SavedInstanceState) {
        super.onCreate(SavedInstanceState);
        setTheme(R.style.AppTheme);
        setContentView(R.layout.first_page_slider);
    }

    public void addPointsForQuestion1(View view) {
        //Check what checkbox is checked
        boolean rightAnswer = ((CheckBox) view).isChecked();
        //Check which checkboxes are checked
        switch (view.getId()) {
            case R.id.q1a1:
                if (rightAnswer)
                    //Russia
                    userScore = userScore + 1;
                break;
            case R.id.q1a2:
                if (rightAnswer)
                    //Bulgaria
                    break;
            case R.id.q1a3:
                if (rightAnswer)
                    //Poland
                    userScore = userScore + 1;
                break;
        }
    }
    //**Below code is based on reference from http://www.vogella.com/tutorials/AndroidIntent/article.html
    //Lars Vogel (c) 2014, 2016 vogella GmbH
    //Version 0.3,
    //18.06.2016
// Start a new sub-activity and pass the score variable
    public void GoToQuestion2(View view) {
        Intent goToQuestion2 = new Intent(this, QuestionTwo.class);
        goToQuestion2.putExtra("USER_SCORE", userScore);
        startActivity(goToQuestion2);

    }

}
