package com.example.sherly.pesantriat.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.sherly.pesantriat.R;
import com.example.sherly.pesantriat.adapter.DoctorAdapter;
import com.example.sherly.pesantriat.model.DataDokter;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class CariFragment extends Fragment {

    String[] namaPoli = {"Nama Poli", "Poli Umum", "Poli THT", "Poli Mata", "Poli Gigi", "Poli Kandungan", "Poli Anak", "Poli Paru", "Poli Jantung"};
    String[] namaDokter = {"Nama Dokter", "Sherly Fekay", "Kila Kiantari", "Arinda Tiko", "Anre Sangsya", "Nuranisa"};
    Spinner spinner_Poli, spinner_Dokter;
    private List<DataDokter> doctorList = new ArrayList<>();
    private RecyclerView recyclerView;
    private DoctorAdapter doctorAdapter;

    public CariFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cari, container, false);
        spinner_Poli = (Spinner) view.findViewById(R.id.spinner_Poli);
        spinner_Dokter = (Spinner) view.findViewById(R.id.spinner_Dokter);
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        recyclerView.setFocusable(false);

        doctorAdapter = new DoctorAdapter(doctorList, getActivity());
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(doctorAdapter);

        prepareDoctorData();

        spinner_Poli.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spinner_Dokter.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        ArrayAdapter adapterPoli = new ArrayAdapter(getActivity(), android.R.layout.simple_spinner_item, namaPoli);
        adapterPoli.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_Poli.setAdapter(adapterPoli);

        ArrayAdapter adapterDokter = new ArrayAdapter(getActivity(), android.R.layout.simple_spinner_item, namaDokter);
        adapterDokter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_Dokter.setAdapter(adapterDokter);

        return view;
    }

    private void prepareDoctorData() {
        DataDokter doctor = new DataDokter(
                "Sherly Fekay",
                "Spesialis Mata",
                "Jalan Raya ITS No. 123, Sukolilo",
                "081231328297"
        );

        for (int i = 0; i < 3; i++)
            doctorList.add(doctor);
    }

}
