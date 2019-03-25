package com.example.latihan2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtNama;
    Button btnSubmit;
    ImageView imgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNama = (EditText) findViewById(R.id.edtNama);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        imgView = (ImageView) findViewById(R.id.imgView);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = edtNama.getText().toString();

                if (nama.equals("g")) {
                    imgView.setImageDrawable(getResources().getDrawable(R.drawable.g));
                } else if (nama.equals("ga")) {
                    imgView.setImageDrawable(getResources().getDrawable(R.drawable.ga));
                } else if (nama.equals("gam")) {
                    imgView.setImageDrawable(getResources().getDrawable(R.drawable.gam));
                } else {
                    Toast.makeText(getApplicationContext(), "Inputan Salah", Toast.LENGTH_LONG).show();
                }

            }

        });

    }
}
