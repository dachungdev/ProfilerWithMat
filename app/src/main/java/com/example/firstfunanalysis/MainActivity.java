package com.example.firstfunanalysis;

import android.app.ActivityManager;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        LeakClass leakClass = new LeakClass();
        leakClass.start();
    }

    class LeakClass extends Thread{
        @Override
        public void run(){
            while (true){
                try{
                    Thread.sleep(60 * 60 * 1000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
