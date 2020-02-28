package com.example.lotteryfragmentone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
/*
Fragment Life Cycle: https://developer.android.com/guide/components/fragment

There are two ways to add a fragment to an activity: dynamically using Java and statically using XML.
Before embedding a "support" fragment in an Activity make sure the Activity is changed to extend from
FragmentActivity or AppCompatActivity which adds support for the fragment manager to all Android versions.
*/

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
