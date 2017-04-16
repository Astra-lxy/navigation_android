package com.example.john.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
    private ViewFlipper vf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vf=(ViewFlipper)findViewById(R.id.vf);
    }

    public void next(View view) {
        vf.setInAnimation(this,android.R.anim.slide_in_left);
        vf.setOutAnimation(this,android.R.anim.slide_out_right);

        vf.showNext();


    }
    public void prev(View view) {


        vf.setInAnimation(this,R.anim.slide_in_right);
        vf.setOutAnimation(this,R.anim.slide_out_left);
        vf.showPrevious();

    }
}
