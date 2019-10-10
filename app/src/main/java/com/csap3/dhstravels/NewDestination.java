package com.csap3.dhstravels;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NewDestination extends AppCompatActivity {
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_destination);
        button2 = (Button) findViewById(R.id.donebtn);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_last_page();
            }
        });

    }

    public void open_last_page(){
        Intent intent = new Intent(this, Schedule.class);
        startActivity(intent);
    }



}


