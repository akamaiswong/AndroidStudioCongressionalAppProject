package com.csap3.dhstravels;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;


public class NewAssignment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_assignment);
        openlast_page();
    }

    public void openlast_page(){
        Intent intent = new Intent(this,Second_Page.class);
        startActivity(intent);

    }
}
