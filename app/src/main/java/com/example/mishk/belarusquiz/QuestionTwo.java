package com.example.mishk.belarusquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class QuestionTwo extends AppCompatActivity {
    int userScore;
    EditText answerField;
    @Override
    public void onCreate (Bundle SavedInstanceState){
        super.onCreate(SavedInstanceState);
        setTheme(R.style.AppTheme);
        setContentView(R.layout.second_page_slider);
        answerField=findViewById(R.id.answer_field);



        //**Below code is based on reference from http://www.vogella.com/tutorials/AndroidIntent/article.html
        //Lars Vogel (c) 2014, 2016 vogella GmbH
        //Version 0.3,
        //18.06.2016
        //Get data passed from the previous activity
        userScore=getIntent().getIntExtra("USER_SCORE",userScore);
    }
    //Get input from EditText, check if it`s equal to right answer and update the score, if yes

    public void CheckUserInput (View view){
        String userAnswer = answerField.getText().toString();
        String rightAnswer="lungs of europe";
        if (userAnswer.equalsIgnoreCase(rightAnswer)){
            userScore=userScore+1;
        }
    }

    //**Below code is based on reference from http://www.vogella.com/tutorials/AndroidIntent/article.html
    //Lars Vogel (c) 2014, 2016 vogella GmbH
    //Version 0.3,
    //18.06.2016
    //Start a new sub-activity and pass the score variable
    public void GoToQuestion3 (View view){
        Intent goToQuestion3 = new Intent (this, QuestionThree.class);
        goToQuestion3.putExtra("USER_SCORE", userScore);
        startActivity(goToQuestion3);

    }
}
