package com.cpst343.happymacro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.cpst343.happymacro.databinding.GoalBinding;

public class goal extends AppCompatActivity {

    private GoalBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.goal);

         }


    public void summaryButtonClick(View view) {
        Intent intent = new Intent(this, summary.class);
        startActivity(intent);
    }

}