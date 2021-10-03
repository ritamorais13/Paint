package com.example.paint;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.LogPrinter;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        if(intent.hasExtra("color")) {
            Bundle extras = intent.getExtras();
            String color = extras.getString("color");
                switch(color) {
                    case "1":
                        findViewById(R.id.layoutMain).setBackgroundColor(getResources().getColor(R.color.c1));
                        break;
                    case "2":
                        findViewById(R.id.layoutMain).setBackgroundColor(getResources().getColor(R.color.c2));
                        break;
                    case "3":
                        findViewById(R.id.layoutMain).setBackgroundColor(getResources().getColor(R.color.c3));
                        break;
                    case "4":
                        findViewById(R.id.layoutMain).setBackgroundColor(getResources().getColor(R.color.c4));
                        break;
                    case "5":
                        findViewById(R.id.layoutMain).setBackgroundColor(getResources().getColor(R.color.c5));
                        break;
                    case "6":
                        findViewById(R.id.layoutMain).setBackgroundColor(getResources().getColor(R.color.c6));
                        break;
                    case "7":
                        findViewById(R.id.layoutMain).setBackgroundColor(getResources().getColor(R.color.c7));
                        break;
                    case "8":
                        findViewById(R.id.layoutMain).setBackgroundColor(getResources().getColor(R.color.c8));
                        break;
                    default:
                        findViewById(R.id.layoutMain).setBackgroundColor(getResources().getColor((R.color.c9)));
                }

        }
    }

    /* Called when the user taps the settings button */
    public void showSettings (View view){
        Intent intent = new Intent(this, ShowSettings.class);
        startActivity(intent);
    }

    /* Called when the user taps the about button */
    public void about (View view){
        Intent intent = new Intent(this, About.class);
        startActivity(intent);

    }

}