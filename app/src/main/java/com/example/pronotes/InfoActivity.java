
package com.example.pronotes;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        String title = getResources().getString(R.string.info);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(title.substring(0, 1).toUpperCase() + title.substring(1));
    }
}