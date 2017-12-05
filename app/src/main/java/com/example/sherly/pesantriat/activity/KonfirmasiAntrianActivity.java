package com.example.sherly.pesantriat.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.sherly.pesantriat.R;

public class KonfirmasiAntrianActivity extends AppCompatActivity {

    Button btn_Ya, btn_Tidak;
    int ingatAntrian = 11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konfirmasi_antrian);
        setTitle("Konfirmasi Antrian");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btn_Ya = (Button) findViewById(R.id.btnYa_antrian);
        btn_Tidak = (Button) findViewById(R.id.btnTidak_antrian);

        btn_Ya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KonfirmasiAntrianActivity.this, AntrianActivity.class);
                startActivity(intent);
            }
        });

        btn_Tidak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }

    public void increment(View view) {
        if (ingatAntrian == 31) {
            return;
        }
        ingatAntrian = ingatAntrian + 1;
        displayIngatAntrian(ingatAntrian);
    }

    public void decrement(View view) {
        if (ingatAntrian == 11) {
            return;
        }
        ingatAntrian = ingatAntrian - 1;
        displayIngatAntrian(ingatAntrian);
    }

    private void displayIngatAntrian(int ingatAntrian) {
        TextView tvIngatAntrian = (TextView) findViewById(R.id.tvIngatAntrian);
        tvIngatAntrian.setText("" + ingatAntrian);
    }
}
