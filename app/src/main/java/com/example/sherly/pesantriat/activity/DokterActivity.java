package com.example.sherly.pesantriat.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.sherly.pesantriat.R;

public class DokterActivity extends AppCompatActivity {

    Button btnAmbilNomor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dokter);

        setTitle("Sherly Fekay");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnAmbilNomor = (Button) findViewById(R.id.btnAmbilNomor);

        btnAmbilNomor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DokterActivity.this, KonfirmasiAntrianActivity.class);
                startActivity(intent);
            }
        });


    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
