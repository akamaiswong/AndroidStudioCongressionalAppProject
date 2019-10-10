package com.csap3.dhstravels;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;

public class Schedule extends AppCompatActivity {

    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

        button1 = (Button) findViewById(R.id.hwbtn);
        button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    open_assignments();
                }
            });



        button2 = (Button) findViewById(R.id.destbtn);
        button2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            open_destination();
        }
    });

}

        public void open_assignments(){
            Intent intent = new Intent(this, Assignment.class);
            startActivity(intent);
        }


    public void open_destination(){
        Intent intent = new Intent(this,NewDestination.class);
        startActivity(intent);
    }
    }


