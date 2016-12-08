package com.soumyasiricilla.bottomnav;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;

/**
 * Created by soumyasiricilla on 12/7/16.
 */

public abstract class ActivityBase extends AppCompatActivity {

    public BottomNavigationView mBottomNav;

    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        CoordinatorLayout fullView = (CoordinatorLayout) getLayoutInflater().inflate(R.layout.activity_base, null);
        FrameLayout activityContainer = (FrameLayout) fullView.findViewById(R.id.activity_content);
        getLayoutInflater().inflate(layoutResID, activityContainer, true);
        super.setContentView(fullView);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBottomNav = (BottomNavigationView) findViewById(R.id.bottom_navigation_view);
        setBottomNav();
    }


    public void setBottomNav() {


        mBottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                Fragment fragment;
                switch (id) {
                    case R.id.action_webshop:
//                        Intent webshopIntent = new Intent(getApplicationContext(), MainActivity.class);
//                        startActivity(webshopIntent);
                        getSupportFragmentManager().beginTransaction().add(R.id.activity_content, new FragmentOne(), "Content").commit();
//
                        break;
                    case R.id.action_scanner:
//                        Intent scannerIntent = new Intent(getApplicationContext(), ActivityOne.class);
//                        startActivity(scannerIntent);
                        getSupportFragmentManager().beginTransaction().add(R.id.activity_content, new FragmentTwo(), "Content").commit();
                        break;
                    case R.id.action_selfcheckout:
//                        Intent intent = new Intent(getApplicationContext(), ActivityTwo.class);
//                        startActivity(intent);
                        getSupportFragmentManager().beginTransaction().add(R.id.activity_content, new FragmentThree(), "Content").commit();
                        break;
                    case R.id.action_settings:
//                        Intent settingsIntent = new Intent(getApplicationContext(), ActivityThree.class);
//                        startActivity(settingsIntent);
                        getSupportFragmentManager().beginTransaction().add(R.id.activity_content, new FragmentFour(), "Content").commit();
                        break;
                }

                return true;
            }
        });
    }
}
