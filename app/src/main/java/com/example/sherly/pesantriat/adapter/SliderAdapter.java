package com.example.sherly.pesantriat.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.sherly.pesantriat.R;
import com.example.sherly.pesantriat.model.DataInformasi;

import java.util.ArrayList;

/**
 * Created by sherly on 13/11/2017.
 */

public class SliderAdapter extends PagerAdapter {

    private ArrayList<Integer> data_slider;
    private LayoutInflater inflater;
    private Context context;

    public SliderAdapter(Context context, ArrayList<Integer> data_slider) {
        this.context = context;
        this.data_slider = data_slider;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public int getCount() {
        return data_slider.size();
    }

    @Override
    public Object instantiateItem(ViewGroup view, int position) {
        View myImageLayout = inflater.inflate(R.layout.slide, view, false);
        ImageView myImage = (ImageView) myImageLayout.findViewById(R.id.image);
        //Glide.with(context).load(data_slider.get(position).getImg()).into(myImage);
        myImage.setImageResource(data_slider.get(position));
        view.addView(myImageLayout, 0);
        return myImageLayout;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view.equals(object);
    }
}

