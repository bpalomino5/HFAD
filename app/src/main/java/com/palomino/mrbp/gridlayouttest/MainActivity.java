package com.palomino.mrbp.gridlayouttest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState != null){
            //retrieve values from the Bundle
            int calcuation = savedInstanceState.getInt("calcuation");

            //can now reassign calculation to where it was previously being used
        }
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        //assigns a string name to type value and put it in the bundle
        //savedInstanceState.put*("name", value);
        //ex. putInt("calculation",45);
    }

    @Override
    protected void onStop(){
        super.onStop();
        //called when app loses visibility
        //your implementation
    }

    @Override
    protected void onStart(){
        super.onStart();
        //called when app gains visibility
        //your implementation
    }

    @Override
    protected void onPause(){
        super.onPause();
        //called when app loses focus
    }

    @Override
    protected void onResume(){
        super.onResume();
        //called when app gains focus
    }


}
