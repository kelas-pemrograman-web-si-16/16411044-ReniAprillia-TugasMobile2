package com.example.latihan2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class intent1 extends AppCompatActivity {

    Button btnNext;
    EditText edNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent1);

        btnNext = (Button) findViewById(R.id.btnNext);
        edNama = (EditText) findViewById(R.id.edNama);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nama = edNama.getText().toString();

                Intent a = new Intent(intent1.this,
                intent2.class);
                a.putExtra("nama", nama);
                startActivity(a);
                finish();

            }
        });
    }
}
