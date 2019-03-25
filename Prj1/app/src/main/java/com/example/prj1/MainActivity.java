package com.example.prj1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtNama;
    TextView txtNPM;
    EditText editNPM, editNama;
    Button btnSumit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtNPM = (TextView) findViewById(R.id.txtNPM);
        txtNama = (TextView) findViewById(R.id.txtNama);
        editNama = (EditText) findViewById(R.id.editNama);
        editNPM = (EditText) findViewById(R.id.editNPM);

        btnSumit = (Button) findViewById(R.id.btnSumit);

        btnSumit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nama = editNama.getText().toString();
                String npm = editNPM.getText().toString();

                txtNama.setText(nama);
                txtNPM.setText(npm);

            }

        });

    }
}
