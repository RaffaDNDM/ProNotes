package com.example.pronotes;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class LanguageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);

        Intent intent = getIntent();
        final String type_photo = intent.getStringExtra(LearnActivity.KEY_LEARN);


        int resource_title = this.getResources().getIdentifier(type_photo+"_title", "string", this.getPackageName());
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(resource_title);
    }
}
