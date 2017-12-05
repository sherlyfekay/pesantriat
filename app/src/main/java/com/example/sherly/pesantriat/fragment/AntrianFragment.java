package com.example.sherly.pesantriat.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.sherly.pesantriat.R;
import com.example.sherly.pesantriat.activity.DaftarDokterActivity;
import com.example.sherly.pesantriat.adapter.GridPoliAdapter;
import com.example.sherly.pesantriat.model.DataPoli;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class AntrianFragment extends Fragment {

    GridView poliGrid;
    ArrayList<DataPoli> dataPoli;

    public AntrianFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_antrian, container, false);

        poliGrid = (GridView) view.findViewById(R.id.poliGridView);
        dataPoli = new ArrayList<DataPoli>();
        String[] namaPoli = {"Poli Umum", "Poli THT", "Poli Mata", "Poli Gigi", "Poli Kandungan", "Poli Anak", "Poli Paru", "Poli Jantung"};
        Integer[] iconPoli = {R.drawable.syringe, R.drawable.ear, R.drawable.eye, R.drawable.tooth, R.drawable.pregnancy, R.drawable.girl, R.drawable.lungs, R.drawable.heart};

        for (int i=0; i<8; i++) {
            DataPoli data = new DataPoli();
            data.setNamaPoli(namaPoli[i]);
            data.setIconPoli(iconPoli[i]);

            dataPoli.add(data);
        }

        GridPoliAdapter adapter = new GridPoliAdapter(getActivity(), dataPoli);
        poliGrid.setAdapter(adapter);

        poliGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getActivity(), DaftarDokterActivity.class);
                getActivity().startActivity(intent);
            }
        });
        return view;
    }

}
