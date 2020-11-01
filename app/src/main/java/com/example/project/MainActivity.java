package com.example.project;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.start);
        RelativeLayout relativeLayout=(RelativeLayout) findViewById(R.id.relativeLayout);
        AnimationDrawable animationDrawable = (AnimationDrawable) relativeLayout.getBackground();

        animationDrawable.setEnterFadeDuration(1000);
        animationDrawable.setExitFadeDuration(2000);

        animationDrawable.start();
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openNewActivity();
            }
        });
    }
    public void openNewActivity(){
        Intent intent=new Intent(this , LoginActivity.class);
        startActivity(intent);
    }
}