package com.soumyasiricilla.bottomnav;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Created by soumyasiricilla on 12/7/16.
 */

public class ActivityThree extends ActivityBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_three);
        super.onCreate(savedInstanceState);

        Menu bottomNavigationViewMenu = mBottomNav.getMenu();
        bottomNavigationViewMenu.findItem(R.id.action_webshop).setChecked(false);
        bottomNavigationViewMenu.findItem(R.id.action_settings).setChecked(true);
    }
}
