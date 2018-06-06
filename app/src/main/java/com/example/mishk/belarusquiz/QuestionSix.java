package com.example.mishk.belarusquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;

public class QuestionSix  extends AppCompatActivity{
    int userScore;
    @Override
    public void onCreate (Bundle SavedInstanceState){
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.sixth_page_slider);
        setTheme(R.style.AppTheme);
        //**Below code is based on reference from http://www.vogella.com/tutorials/AndroidIntent/article.html
        //Lars Vogel (c) 2014, 2016 vogella GmbH
        //Version 0.3,
        //18.06.2016
        //Get data from previous activity
        userScore=getIntent().getIntExtra("USER_SCORE", 0);
    }
    //Check RadioButtons and update the score
    public void addPointForQuestion6 (View view){
        boolean rightAnswer=((RadioButton)view).isChecked();
        switch(view.getId()){
            case R.id.q6a1:
                if(rightAnswer)
                    //World of Warcraft
                    break;
            case R.id.q6a2:
                if(rightAnswer)
                    //World of Tanks
                    userScore=userScore+1;
                break;
            case R.id.q6a3:
                if(rightAnswer)
                    //Minecraft
                    break;
        }
    }
    //**Below code is based on reference from http://www.vogella.com/tutorials/AndroidIntent/article.html
    //Lars Vogel (c) 2014, 2016 vogella GmbH
    //Version 0.3,
    //18.06.2016
    //Open a new sub-activity and pass user score
    public void GoToQuestion7 (View view){
        Intent goToQuestion7 = new Intent (this, QuestionSeven.class);
        goToQuestion7.putExtra("USER_SCORE", userScore);
        startActivity(goToQuestion7);
    }

}
