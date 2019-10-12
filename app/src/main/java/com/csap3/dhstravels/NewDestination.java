package com.csap3.dhstravels;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

// @author :Donna Prince
//@author : Yoga Kanneboina
//@author: Akamai Wong
//Date : 10/11/2019

public class NewDestination extends AppCompatActivity {
    private Button button2; //assign button2 to Button
    private Button button3;//assign button2 to Button
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // set view to destination layout
        setContentView(R.layout.activity_new_destination);
        // switch view when button is clicked
        button2 = (Button) findViewById(R.id.donebtn);
        // execute open_last_page() when button is clicked
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_last_page();
            }
        });



        button3 = (Button) findViewById(R.id.travel);
        // execute open_last_page() when button is clicked
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_search();
            }
        });

    }

    //execute open_last_page() when button is clicked
    public void open_last_page(){
        // intent to switch from current layout to schedule view
        Intent intent = new Intent(this, Schedule.class);
        // start activity to switch view
        startActivity(intent);
    }

    public void open_search(){
        // intent to switch from current layout to facts view
        Intent intent = new Intent(this, FactsActivity.class);
        // start activity to switch view
        startActivity(intent);
    }

}


