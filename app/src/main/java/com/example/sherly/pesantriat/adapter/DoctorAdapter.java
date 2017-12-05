package com.example.sherly.pesantriat.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.sherly.pesantriat.R;
import com.example.sherly.pesantriat.activity.DokterActivity;
import com.example.sherly.pesantriat.model.DataDokter;

import java.util.List;

/**
 * Created by sherly on 13/11/2017.
 */

public class DoctorAdapter extends RecyclerView.Adapter<DoctorAdapter.MyViewHolder> {
    private List<DataDokter> doctorList;
    private Context context;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public RelativeLayout relativeLayout;
        public CardView cvAmbilNomor;
        public TextView tv_name, tv_address, tv_specialist;

        public MyViewHolder(View view) {
            super(view);
            relativeLayout = (RelativeLayout) view.findViewById(R.id.relativeLayout);
            cvAmbilNomor = (CardView) view.findViewById(R.id.cvAmbilNomor);
            tv_name = (TextView) view.findViewById(R.id.tv_name);
            tv_address = (TextView) view.findViewById(R.id.tv_address);
            tv_specialist = (TextView) view.findViewById(R.id.tv_specialist);
        }
    }

    public DoctorAdapter (List<DataDokter> doctorList, Context context) {
        this.doctorList = doctorList;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_doctor, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        DataDokter doctor = doctorList.get(position);

        holder.tv_name.setText(doctor.getName());
        holder.tv_address.setText(doctor.getAddress());
        holder.tv_specialist.setText(doctor.getSpecialist());
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(context, DetailActivity.class);
//                context.startActivity(intent);
            }
        });

        holder.cvAmbilNomor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DokterActivity.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return doctorList.size();
    }
}
