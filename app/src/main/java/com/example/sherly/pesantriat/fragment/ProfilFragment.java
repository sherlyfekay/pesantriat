package com.example.sherly.pesantriat.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.sherly.pesantriat.R;
import com.example.sherly.pesantriat.activity.AccountActivity;
import com.example.sherly.pesantriat.activity.LoginActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProfilFragment extends Fragment {

    LinearLayout lin_changeAccount, lin_name, lin_dateOfBirth, lin_gender, lin_phoneNum, lin_address, linKeluar;

    public ProfilFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profil, container, false);

        lin_changeAccount = (LinearLayout) view.findViewById(R.id.lin_changeAccount);
        lin_name = (LinearLayout) view.findViewById(R.id.lin_name);
        lin_dateOfBirth = (LinearLayout) view.findViewById(R.id.lin_dateOfBirth);
        lin_gender = (LinearLayout) view.findViewById(R.id.lin_gender);
        lin_phoneNum = (LinearLayout) view.findViewById(R.id.lin_phoneNum);
        lin_address = (LinearLayout) view.findViewById(R.id.lin_address);
        linKeluar = (LinearLayout) view.findViewById(R.id.linKeluar);

        lin_changeAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), AccountActivity.class);
                getActivity().startActivity(intent);
            }
        });

        linKeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), LoginActivity.class);
                getActivity().startActivity(intent);
            }
        });

        return view;
    }

}
