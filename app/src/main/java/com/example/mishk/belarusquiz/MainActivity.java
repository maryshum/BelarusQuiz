package com.example.mishk.belarusquiz;

import android.content.Intent;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //**Below code is based on reference from http://www.vogella.com/tutorials/AndroidIntent/article.html
    //Lars Vogel (c) 2014, 2016 vogella GmbH
    //Version 0.3,
    //18.06.2016

    //** This method opens the activity with the first question**//
    public void startQuiz (View view){
        Intent startQuiz = new Intent(this, QuestionOne.class);
        setTheme(R.style.AppTheme);
        startActivity(startQuiz);


    }

}
