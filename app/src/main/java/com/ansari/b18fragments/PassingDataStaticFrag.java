package com.ansari.b18fragments;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PassingDataStaticFrag extends AppCompatActivity implements MyInterface{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_data_static_frag);
    }

    @Override
    public void myMethod(String data) {

FragmentTwo fragmentTwo = (FragmentTwo) getSupportFragmentManager().findFragmentById(R.id.fragmentF2);
        fragmentTwo.getMyData(data);
    }
}
