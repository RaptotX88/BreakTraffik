package com.example.ashik.timer;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int counter=10;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button= (Button) findViewById(R.id.button);
        textView= (TextView) findViewById(R.id.textView);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                new CountDownTimer(30000, 1000){
                    public void onTick(long millisUntilFinished){
                        textView.setText(String.valueOf(counter));
                        if(counter>=0) {

                            counter--;
                        }
                        else
                            onFinish();

                    }
                    public  void onFinish(){
                        textView.setText("FINISH!!");
                    }
                }.start();
            }
        });
    }
}
