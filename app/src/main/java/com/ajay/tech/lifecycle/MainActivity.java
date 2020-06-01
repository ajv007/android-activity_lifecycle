package com.ajay.tech.lifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    static final String TAG = "ActivityMain";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "onCreate Called");

        finish();

        /*findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TransparentActivity.class));
            }
        });

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DialogActivity.class));
            }
        });

        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, NormalActivity.class));
            }
        });*/


    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.i(TAG, "onRestart Called");

    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i(TAG, "onStart Called");

    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i(TAG, "onResume Called");

    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i(TAG, "onPause Called");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i(TAG, "onStop Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i(TAG, "onDestroy Called");
    }

    @Override
    public void onBackPressed() {
        Log.i(TAG, "onBackPressed Called");
        super.onBackPressed();
    }

    @Override
    public void finish() {
        Log.i(TAG, "finish Called");
        super.finish();
    }
}
