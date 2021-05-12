package com.example.videoviewtest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListFragment listFragment;
    MainFragment mainFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listFragment = new ListFragment();
        mainFragment = new MainFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.container, mainFragment).commit();

    }

    public void onFragmentChanged(int index) {
        if (index == 0){
            Intent intent = new Intent(getApplicationContext(), VideoActivity.class);
            startActivity(intent);
        }
        if (index == 1){
            Toast.makeText(this, "목록으로 이동합니다.", Toast.LENGTH_SHORT).show();
            getSupportFragmentManager().beginTransaction().replace(R.id.container, listFragment).commit();
        }
    }
}