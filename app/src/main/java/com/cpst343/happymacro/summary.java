package com.cpst343.happymacro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class summary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.summary);
    }

    public void userInfo(View view) {
        Intent intent = new Intent(this, little_info.class);
        startActivity(intent);

    }
}
