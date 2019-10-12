package com.csap3.dhstravels;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//@author: Akamai Wong
//@author: Jasleen Kaur
//Date: 10/11/2019


/*
The public class FactsActivity is a child of the class AppCompat Activity, which allows it to
communicate with the other activities and launch the schedule activity from a button.
*/

public class FactsActivity extends AppCompatActivity {
    private Button button; //The button variable allows us to identify the button when setting up methods.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*
        This method creates the activity, everything in this method will be called when the activity is launched.
        This is essentially the set-up of the world, and identifies all of the interactive widgets used in the activity.
         */
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facts); //Links the java page with the xml page

        button = (Button) findViewById(R.id.Home);
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


    public void openScheduleActivity() {
        /*
        This method is to open the Activity with the schedule for the homework. It does this by
        creating a new intent and passing in the parameter this, and Schedule class which tells the
        app to switch the screen to Schedule.
         */
        Intent intent = new Intent(this, Schedule.class);
        startActivity(intent);
    }
}
