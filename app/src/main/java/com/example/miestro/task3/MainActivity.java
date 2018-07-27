package com.example.miestro.task3;

import android.graphics.Typeface;
import android.support.design.widget.NavigationView;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout mDrawer;
    private ActionBarDrawerToggle mToggle;
    TextView inpox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("");

        mDrawer = (DrawerLayout)findViewById(R.id.DrawerLayout);

        mToggle = new ActionBarDrawerToggle(this,mDrawer,R.string.Open,R.string.Close);
        NavigationView navigationView =(NavigationView)findViewById(R.id.navigationview);
   //     setupDrawercontent(navigationView);

       mDrawer.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        View hView =  navigationView.getHeaderView(0);


        inpox=(TextView) MenuItemCompat.getActionView(navigationView.getMenu().
                findItem(R.id.Inpox));


//This method will initialize the count value
        initializeCountDrawer();


    }

    private void initializeCountDrawer(){

        //Gravity property aligns the text
        inpox.setGravity(Gravity.CENTER);
        inpox.setTypeface(null, Typeface.NORMAL);
        inpox.setTextColor(getResources().getColor(R.color.colorAccent));

        inpox.setText("1");


    }




}
