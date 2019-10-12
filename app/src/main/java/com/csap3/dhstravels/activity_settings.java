package com.csap3.dhstravels;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceFragmentCompat;

//@author: Akamai Wong
//@author: Jasleen Kaur
//Date: 10/11/2019


/*
The public class activity_settings is a child of the class AppCompat Activity, which allows it to
communicate with the other activities and launch the schedule activity from a button.
*/
public class activity_settings extends AppCompatActivity {

    private Button button; //Declares the button so that it can be identified in later methods.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*
        This method creates the activity, everything in this method will be called when the activity is launched.
        This is essentially the set-up of the world, and identifies all of the interactive widgets used in the activity.
         */
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings); //Links the java page with the xml page
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
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.settings, new SettingsFragment())
                .commit();
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    public static class SettingsFragment extends PreferenceFragmentCompat {
        @Override
        public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
            setPreferencesFromResource(R.xml.root_preferences, rootKey);
        }
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