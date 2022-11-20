package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;


import com.google.android.material.navigation.NavigationView;

public class Home extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawerLayout;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        Toolbar toolbar;
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.home_1);
        NavigationView navigationView = findViewById(R.id.nav_V);
        navigationView.setNavigationItemSelectedListener(this);


        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open_nav, R.string.close_nav);
        drawerLayout.addDrawerListener(toggle);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new homeF()).commit();
            navigationView.setCheckedItem(R.id.nav_V);
        }

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {

            case R.id.nav_home1:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new homeF()).commit();
                break;

            case R.id.nav_home2:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new fragment_two()).commit();
                break;

            case R.id.nav_home3:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new fragment_three()).commit();
                break;

            case R.id.nav_home5:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new fragment_fiveI()).commit();
                break;


            case R.id.nav_home6:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new fragment_six()).commit();
                break;

            case R.id.nav_home7:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new fragment_seven()).commit();
                break;

            case R.id.nav_home8:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new fragment_eight()).commit();
                break;

            case R.id.nav_logout:
                Toast.makeText(this,"Logout", Toast.LENGTH_SHORT).show();
                break;


        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);

        }else{
            super.onBackPressed();

        }
    }
}