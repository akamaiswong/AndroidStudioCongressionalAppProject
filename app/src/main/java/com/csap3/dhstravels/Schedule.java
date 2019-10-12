package com.csap3.dhstravels;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;

// @author :Donna Prince  -- added buttons to the schedule view
//@author: Yoga Kanneboina -- created the activity, added text boxes, designed the format
//Date : 10/10/2019


public class Schedule extends AppCompatActivity {

    private Button button1; // assign private variable button1 to Button
    private Button button2; // assign private variable button2 to Button
    private Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

        // look for button by id to switch to assignment view
        button1 = (Button) findViewById(R.id.hwbtn);
        // when button is click execute the open_assignment method
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_assignments();
            }
        });


        // look for button by id to switch to destination view
        button2 = (Button) findViewById(R.id.destbtn);
        // when button is click execute the open_destination method
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_destination();
            }
        });


        button3 = (Button) findViewById(R.id.settings);
        // when button is click execute the open_destination method
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_settings();
            }
        });

    }
    // when HW button is click execute this method
    public void open_assignments(){
        // create an intent to switch view for current view to assignment view
        Intent intent = new Intent(this, Assignment.class);
        //start activity to switch view
        startActivity(intent);
    }


    public void open_destination(){
        // create an intent to switch view for current view to destination view
        Intent intent = new Intent(this,NewDestination.class);
        //start activity to switch layout
        startActivity(intent);
    }

    public void open_settings(){
        // create an intent to switch view for current view to destination view
        Intent intent = new Intent(this,activity_settings.class);
        //start activity to switch layout
        startActivity(intent);
    }
}


