package com.u_showcasedev.ioscalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class SettingActivity extends AppCompatActivity {

    private Button website;
    private Button fdroid;
    private ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.AppTheme);
        setContentView(R.layout.activity_setting);

        website = findViewById(R.id.websiteButton);
        website.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://usowcasedev.infinityfreeapp.com/"));
                startActivity(browserIntent);
            }
        });

        fdroid = findViewById(R.id.fdroidButton);
        fdroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://usowcasedev.infinityfreeapp.com/"));
                //startActivity(browserIntent);
                Toast.makeText(SettingActivity.this,"Not avaiable this time",Toast.LENGTH_SHORT).show();
            }
        });

        back = findViewById(R.id.backIcon);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(0);
            }
        });

    }
}