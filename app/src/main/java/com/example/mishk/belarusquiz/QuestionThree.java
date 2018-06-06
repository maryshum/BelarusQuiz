package com.example.mishk.belarusquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;

public class QuestionThree extends AppCompatActivity{
    int userScore;
    @Override
    public void onCreate (Bundle SavedInstanceState){
        super.onCreate(SavedInstanceState);
        setTheme(R.style.AppTheme);
        setContentView(R.layout.third_page_slider);
        //**Below code is based on reference from http://www.vogella.com/tutorials/AndroidIntent/article.html
        //Lars Vogel (c) 2014, 2016 vogella GmbH
        //Version 0.3,
        //18.06.2016
        //Get data passed from previous activity
        userScore=getIntent().getIntExtra("USER_SCORE", 0);
    }
    //Check if the right RadioButton is clicked and update the score
    public void addPointForQuestion3 (View view){
        //check the button state and store the result in a boolean
        boolean rightAnswer = ((RadioButton)view).isChecked();
        switch (view.getId()){
            case R.id.q3a1:
                if(rightAnswer)
                    //wolf
                    break;
            case R.id.q3a2:
                if (rightAnswer)
                    //bison
                    userScore=userScore+1;
                break;
            case R.id.q3a3:
                if (rightAnswer)
                    //bear
                    break; }
    }
    //**Below code is based on reference from http://www.vogella.com/tutorials/AndroidIntent/article.html
    //Lars Vogel (c) 2014, 2016 vogella GmbH
    //Version 0.3,
    //18.06.2016
    //Start a new sub-activity and pass the score variable
    public void GoToQuestion4 (View view){
        Intent goToQuestion4 = new Intent (this, QuestionFour.class);
        goToQuestion4.putExtra("USER_SCORE", userScore);
        startActivity(goToQuestion4);

    }
}
