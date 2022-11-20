package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;


public class fragment_two extends Fragment {
    BottomNavigationView navigationView;



       @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
           // Inflate the layout for this fragment
           View view = inflater.inflate(R.layout.fragment_two, container, false);
//
//           BottomNavigationView navigationView = (BottomNavigationView) getView().findViewById(R.id.navtwobtn);
//
//
           return view;
//
//
//
//
       }
//
}