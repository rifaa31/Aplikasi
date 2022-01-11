package com.mobileprogramming.ulinkeun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class WisataPanyaweuyan extends AppCompatActivity {
    ImageButton exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata_panyaweuyan);
        exit= (ImageButton) findViewById(R.id.Exit);

        exit.setOnClickListener(v-> {
            Intent intent1 = new Intent(getApplicationContext(), MenuUtama.class);
            startActivity(intent1);
        });
    }
}
