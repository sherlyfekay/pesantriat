package com.example.sherly.pesantriat.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.sherly.pesantriat.R;
import com.example.sherly.pesantriat.activity.DaftarDokterActivity;
import com.example.sherly.pesantriat.model.DataPoli;

import java.util.ArrayList;

/**
 * Created by sherly on 13/11/2017.
 */

public class GridPoliAdapter extends BaseAdapter {
    public Context context;
    ArrayList<DataPoli> data;

    public GridPoliAdapter(Context c, ArrayList<DataPoli> data) {
        this.context = c;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View grid;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(convertView == null) {
            grid = new View(context);
            grid = inflater.inflate(R.layout.activity_item_poli, null);
            TextView textView = (TextView) grid.findViewById(R.id.namaPoli);
            ImageView imageView = (ImageView) grid.findViewById(R.id.iconPoli);
            CardView content_grid =  (CardView)grid.findViewById(R.id.content_grid);
            textView.setText(data.get(position).getNamaPoli());
            Glide.with(context).load(data.get(position).getIconPoli()).into(imageView);

            content_grid.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, DaftarDokterActivity.class);
                    context.startActivity(intent);
//                    ApiService.service_get.getDetailWahana("123", "Basic YWRtaW46YXBpQDIwMTc=", Integer.parseInt(data.get(position).getId())).enqueue(new Callback<DetailWahanaModel>() {
//                        @Override
//                        public void onResponse(Call<DetailWahanaModel> call, Response<DetailWahanaModel> response) {
//                            Intent intent = new Intent(context, DescWahanaActivity.class);
//                            intent.putExtra("judul", response.body().getData().getWahana_nama());
//                            intent.putExtra("isi", response.body().getData().getKeterangan());
//                            //intent.putExtra("point", response.body().getData().g());
//                            intent.putExtra("image", data.get(position).getImage());
//                            context.startActivity(intent);
//                        }
//
//                        @Override
//                        public void onFailure(Call<DetailWahanaModel> call, Throwable t) {
//
//                        }
//                    });
                }
            });
        }
        else {
            grid = (View) convertView;
        }

        return grid;
    }
}
