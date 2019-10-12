package com.csap3.dhstravels;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//@author: Akamai Wong
//@author: Yoga Kanneboina
//date: 10/11/19

/*
This class extends AppCompatActivity which makes it possible for us to use button functions
and intents.
*/

public class Login extends AppCompatActivity {

    private Button button; //the button variable allows us to identify the button.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*
        This method helps find the button and listens to when the button is clicked.
         */
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*
                This method calls the openSchedule Activity when the button is clicked.
                 */
                openScheduleActivity();
            }
        });

    }

    public void openScheduleActivity(){
        /*
        This method is to open the Activity with the schedule for the homework. It does this by
        creating a new intent and passing in the parameter this, and Schedule class which tells the
        app to switch the screen to Schedule.
         */
        Intent intent = new Intent(this, Schedule.class);
        startActivity(intent);
    }
}
