package com.thelosers.internshiptrail;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import com.thelosers.internshiptrail.Fragments.Fragment_Profile;

public class MainActivity extends AppCompatActivity {



    FragmentManager manager;

    Fragment fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager = getSupportFragmentManager();
        fragment = manager.findFragmentById(R.id.main_activity_fragment);

        //
        if (fragment == null) {
            fragment = new Fragment_Profile();
            manager.beginTransaction()
                    .add(R.id.main_activity_fragment, fragment)

                    .commit();
        }

        //uncomment for second

//        if (fragment == null) {
//            fragment = new Fragment_Plaumbing();
//            manager.beginTransaction()
//                    .add(R.id.main_activity_fragment, fragment)
//
//                    .commit();
//        }



        //uncomment for third
//        if (fragment == null) {
//            fragment = new fragment_Home();
//            manager.beginTransaction()
//                    .add(R.id.main_activity_fragment, fragment)
//
//                    .commit();
//        }



    }

}
