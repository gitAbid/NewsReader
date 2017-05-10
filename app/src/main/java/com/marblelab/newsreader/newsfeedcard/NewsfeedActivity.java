package com.marblelab.newsreader.newsfeedcard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.marblelab.newsreader.R;


public class NewsfeedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android.app.FragmentManager fragmentManager=getFragmentManager();
        android.app.FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        NewsfeedFragment newsFeedFragment=new NewsfeedFragment();
        fragmentTransaction.replace(R.id.fragment_container,newsFeedFragment);
        fragmentTransaction.commit();




    }
}
