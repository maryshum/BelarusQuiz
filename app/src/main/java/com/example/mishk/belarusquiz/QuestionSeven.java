package com.example.mishk.belarusquiz;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class QuestionSeven extends AppCompatActivity{
    int userScore;
    @Override
    public void onCreate (Bundle SavedInstanceState){
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.seventh_page_slider);
        setTheme(R.style.AppTheme);
        //**Below code is based on reference from http://www.vogella.com/tutorials/AndroidIntent/article.html
        //Lars Vogel (c) 2014, 2016 vogella GmbH
        //Version 0.3,
        //18.06.2016
        //Get data from previous activity
        userScore=getIntent().getIntExtra("USER_SCORE", 0);
    }
    //Check RadioButtons and update the score
    public void addPointForQuestion7 (View view){
        boolean rightAnswer=((RadioButton)view).isChecked();
        switch(view.getId()){
            case R.id.q7a1:
                if(rightAnswer)
                    //Hockey
                    userScore=userScore+1;
                    break;
            case R.id.q7a2:
                if(rightAnswer)
                    //Football
                break;
            case R.id.q7a3:
                if(rightAnswer)
                    //Golf
                    break;
        }
    }
    public void showResult (View view){
    if (userScore >= 6) {
        Context context = getApplicationContext();
        CharSequence textForToast1 = "Wow! Your score is "+userScore+ ". You know Belarus as if it was your home country!";
        int duration = Toast.LENGTH_LONG;
        Toast toast1 = Toast.makeText(context, textForToast1, duration);
        toast1.show();

    }else {
       Context context =getApplicationContext();
       CharSequence textForToast2 = "Your score is "+userScore+". Visit us again to learn more about Belarus!";
       int duration=Toast.LENGTH_LONG;
       Toast toast2 = Toast.makeText(context, textForToast2, duration);
       toast2.show();
    }
}
//Take user to the first question of the quiz
public void restartQuiz (View view){
    Intent restartQuiz = new Intent (this, QuestionOne.class);
    startActivity(restartQuiz);
}
}
