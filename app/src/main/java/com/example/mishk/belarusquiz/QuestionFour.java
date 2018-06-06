package com.example.mishk.belarusquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;

public class QuestionFour extends AppCompatActivity{
    int userScore;
    @Override
    public void onCreate (Bundle SavedInstanceState){
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.fourth_page_slider);
        setTheme(R.style.AppTheme);
        //**Below code is based on reference from http://www.vogella.com/tutorials/AndroidIntent/article.html
        //Lars Vogel (c) 2014, 2016 vogella GmbH
        //Version 0.3,
        //18.06.2016
        //Get data from previous activity
        userScore=getIntent().getIntExtra("USER_SCORE",0);
    }
    //Check RadioButtons and update the score
    public void addPointForQuestion4 (View view){
        boolean rightAnswer=((RadioButton)view).isChecked();
        switch(view.getId()){
            case R.id.q4a1:
                if(rightAnswer)
                    //Squash
                    break;
            case R.id.q4a2:
                if(rightAnswer)
                    //Cabbage
                    break;
            case R.id.q4a3:
                if(rightAnswer)
                    //Potato
                    userScore=userScore+1;
                    break;
        }
    }
    //**Below code is based on reference from http://www.vogella.com/tutorials/AndroidIntent/article.html
    //Lars Vogel (c) 2014, 2016 vogella GmbH
    //Version 0.3,
    //18.06.2016
  //Open a new sub-activity and pass user score
    public void GoToQuestion5 (View view){
        Intent goToQuestion5 = new Intent (this, QuestionFive.class);
        goToQuestion5.putExtra("USER_SCORE", userScore);
        startActivity(goToQuestion5);
    }
}
