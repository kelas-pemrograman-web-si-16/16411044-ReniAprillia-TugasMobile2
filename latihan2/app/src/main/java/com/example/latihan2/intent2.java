package com.example.latihan2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class intent2 extends AppCompatActivity {

    TextView txtNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent2);

        txtNama = (TextView) findViewById(R.id.txtPassingData);

        Intent intent = getIntent();
        String nama = intent.getStringExtra("nama");
        txtNama.setText(nama);
    }
}
