package com.example.widgetsapp;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    SeekBar seekBar;
    TextView textView;
    ProgressBar progressBarHorizontal;
    ProgressBar progressBarCircular;
    Button btn25,btn100;





 //this is horizontal and circular progressbar
   /* protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     //   progressBarHorizontal=findViewById(R.id.progressHorizontal);
        progressBarCircular=findViewById(R.id.progressCircular);
        btn25=findViewById(R.id.btn1);
        btn100=findViewById(R.id.btn2);

        btn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  progressBarHorizontal.setProgress(25);
                progressBarCircular.setProgress(25);
            }
        });

        btn100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // progressBarHorizontal.setProgress(100);
                progressBarCircular.setProgress(100);

            }
        });

    }*/









    //this code is for seekbar
   /*  @Override
   protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       seekBar=findViewById(R.id.seekBar1);
       textView=findViewById(R.id.txt1);
       seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
           @Override
           public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
               textView.setTextSize(progress+1);
           }

           @Override
           public void onStartTrackingTouch(SeekBar seekBar) {

           }

           @Override
           public void onStopTrackingTouch(SeekBar seekBar) {

           }
       });


    }*/
}
