package com.soumyasiricilla.bottomnav;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends ActivityBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);

        Menu bottomNavigationViewMenu = mBottomNav.getMenu();
        bottomNavigationViewMenu.findItem(R.id.action_webshop).setChecked(true);
    }

}
