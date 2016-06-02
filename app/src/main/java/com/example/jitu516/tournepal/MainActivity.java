package com.example.jitu516.tournepal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class
        MainActivity extends AppCompatActivity {
        private static Button button, expbutton, vacationbutton, tourbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnClickButtonListener();
        OnClickExploreButton();
        OnClickVacationButton();
        OnClickTourButton();
    }

    public void OnClickButtonListener(){
            button=(Button)findViewById(R.id.weekendbtn);
            button.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent("com.example.jitu516.tournepal.Weekend");
                            startActivity(intent);
                        }
                    }
            );
    }

    public void OnClickExploreButton(){
        expbutton=(Button)findViewById(R.id.explorebtn);
        expbutton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent= new Intent("com.example.jitu516.tournepal.Explore");
                        startActivity(intent);
                    }
                }
        );
    }
    public void OnClickVacationButton(){
        vacationbutton=(Button)findViewById(R.id.vacattionbtn);
        vacationbutton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.jitu516.tournepal.Vacations");
                        startActivity(intent);
                    }
                }
        );
    }
    public void OnClickTourButton(){
        tourbutton=(Button)findViewById(R.id.tourbtn);
        tourbutton.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                public void onClick(View v){
                        Intent intent=new Intent("com.example.jitu516.tournepal.Tour");
                        startActivity(intent);
                    }
                }
        );}
}