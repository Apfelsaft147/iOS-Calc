package com.u_showcasedev.ioscalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class InfoPaulStore extends AppCompatActivity {

    private ImageView back;
    private Button website;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.AppTheme);
        setContentView(R.layout.activity_info_paul_store);

        website = findViewById(R.id.websiteButton);
        website.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://usowcasedev.infinityfreeapp.com/index/paulstore.html"));
                startActivity(browserIntent);
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