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
    private Button twitter;
    private Button paulstore;
    private Button paulstoreinfo;
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

        twitter = findViewById(R.id.twitterButton);
        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/u_showcasedev"));
                startActivity(browserIntent);
            }
        });

        paulstore = findViewById(R.id.paulstore);
        paulstore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://usowcasedev.infinityfreeapp.com/index/paulstore.html")));
            }
        });

        paulstoreinfo = findViewById(R.id.paulstoreinfo);
        paulstoreinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://usowcasedev.infinityfreeapp.com/index/paulstore.html"));
                startActivity(new Intent(SettingActivity.this, InfoPaulStore.class));
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