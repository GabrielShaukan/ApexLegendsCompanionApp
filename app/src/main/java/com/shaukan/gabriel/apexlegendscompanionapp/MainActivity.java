package com.shaukan.gabriel.apexlegendscompanionapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private Button mLegends, mGear, mMap, mAchievements, mSkins;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLegends = findViewById(R.id.legends);
        mGear = findViewById(R.id.gear);
        mMap = findViewById(R.id.map);
        mAchievements = findViewById(R.id.achievements);
        mSkins = findViewById(R.id.skins);

        mLegends.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LegendsList.class);
                startActivity(intent);
            }
        });

        mGear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GearList.class);
                startActivity(intent);
            }
        });

        mMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MapActivity.class);
                startActivity(intent);
            }
        });

        mSkins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SkinsList.class);
                startActivity(intent);
            }
        });

        mAchievements.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AchievementList.class);
                startActivity(intent);
            }
        });

    }
}
