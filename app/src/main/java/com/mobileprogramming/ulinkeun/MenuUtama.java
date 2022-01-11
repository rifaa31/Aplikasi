package com.mobileprogramming.ulinkeun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;

public class MenuUtama extends AppCompatActivity {
    ImageButton wisatapanyaweunyan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);
        wisatapanyaweunyan= (ImageButton) findViewById(R.id.wisatapanyaweuyan);

        wisatapanyaweunyan.setOnClickListener(v-> {
            Intent intent1 = new Intent(getApplicationContext(), WisataPanyaweuyan.class);
            startActivity(intent1);
        });
    }
}