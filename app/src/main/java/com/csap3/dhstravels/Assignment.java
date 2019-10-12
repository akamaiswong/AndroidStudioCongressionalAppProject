package com.csap3.dhstravels;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


// @author :Donna Prince
//Date : 10/10/2019

//class for assignment activity
public class Assignment extends AppCompatActivity {

    // assign button to Button
    public Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // look button click
        setContentView(R.layout.activity_assignment);button = (Button) findViewById(R.id.button);
        // when button is clicked , open the schedule page
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_schedule_page();
            }
        });

    }

    public void open_schedule_page(){
        // when button is clicked view should switch from current page to Schedule page
        Intent intent = new Intent(this, Schedule.class);
        // execute the intent so that layout switch occurs
        startActivity(intent);
    }



}