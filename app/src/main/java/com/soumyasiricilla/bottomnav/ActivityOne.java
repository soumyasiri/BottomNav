package com.soumyasiricilla.bottomnav;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by soumyasiricilla on 12/7/16.
 */

public class ActivityOne extends ActivityBase {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_one);
        super.onCreate(savedInstanceState);

        Menu bottomNavigationViewMenu = mBottomNav.getMenu();

        bottomNavigationViewMenu.findItem(R.id.action_webshop).setChecked(false);
        bottomNavigationViewMenu.findItem(R.id.action_scanner).setChecked(true);
    }


}
