package com.marblelab.newsreader;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android.app.FragmentManager fragmentManager=getFragmentManager();
        android.app.FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        NewsFeedFragment newsFeedFragment=new NewsFeedFragment();
        fragmentTransaction.replace(R.id.fragment_container,newsFeedFragment);
        fragmentTransaction.commit();




    }
}
