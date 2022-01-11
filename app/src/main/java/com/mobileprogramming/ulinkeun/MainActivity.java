package com.mobileprogramming.ulinkeun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {
    Button Login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Login= (Button) findViewById(R.id.Login);

        Login.setOnClickListener(v-> {
            Intent intent1 = new Intent(getApplicationContext(), MenuUtama.class);
            startActivity(intent1);
        });
    }
}