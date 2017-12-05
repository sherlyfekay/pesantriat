package com.example.sherly.pesantriat.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.sherly.pesantriat.R;
import com.example.sherly.pesantriat.adapter.DoctorAdapter;
import com.example.sherly.pesantriat.model.DataDokter;

import java.util.ArrayList;
import java.util.List;

public class DaftarDokterActivity extends AppCompatActivity {

    private List<DataDokter> doctorList = new ArrayList<>();
    private RecyclerView recyclerView;
    private DoctorAdapter doctorAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_dokter);

        setTitle("Daftar Dokter");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setFocusable(false);

        doctorAdapter = new DoctorAdapter(doctorList, DaftarDokterActivity.this);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(DaftarDokterActivity.this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(doctorAdapter);

        prepareDoctorData();
    }

    private void prepareDoctorData() {
        DataDokter doctor = new DataDokter(
                "Sherly Fekay",
                "Spesialis Mata",
                "Jalan Raya ITS No. 123, Sukolilo",
                "081231328297"
        );

        for (int i = 0; i < 16; i++)
            doctorList.add(doctor);
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
