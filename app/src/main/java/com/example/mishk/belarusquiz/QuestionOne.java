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
        //find the first checkbox and check if it is checked
        final CheckBox q1a1 = findViewById(R.id.q1a1);
        boolean answerRussia = q1a1.isChecked();
        //find the second checkbox and check if it is checked
        final CheckBox q1a2 = findViewById(R.id.q1a2);
        boolean answerBulgaria = q1a2.isChecked();
        //find the third checkbox and check if it is checked
        final CheckBox q1a3 = findViewById(R.id.q1a3);
        boolean answerPoland = q1a3.isChecked();
        //update score to 2 (1 for each country) if Russia and Poland are checked, and Bulgaria is not checked
        if (answerRussia && !answerBulgaria && answerPoland) {
            userScore = 2;
        }else {
            //otherwise set score to 0
            userScore = 0;
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
