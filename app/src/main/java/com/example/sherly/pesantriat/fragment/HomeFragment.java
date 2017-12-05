package com.example.sherly.pesantriat.fragment;


import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sherly.pesantriat.R;
import com.example.sherly.pesantriat.adapter.SliderAdapter;
import com.example.sherly.pesantriat.model.DataInformasi;
import com.robohorse.pagerbullet.PagerBullet;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import me.relex.circleindicator.CircleIndicator;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    //private static PagerBullet slide_picture;

    private static ViewPager mPager;
    private static int currentPage = 0;
    private static final Integer[] info = {R.drawable.img4,R.drawable.img3,R.drawable.img2};
    public ArrayList<Integer> infoArray = new ArrayList<Integer>();

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        //slide_picture = (PagerBullet) view.findViewById(R.id.slide_picture);

        for(int i=0;i<info.length;i++) {
            //DataInformasi item = new DataInformasi();
            //item.setImg(info[i]);
            infoArray.add(info[i]);
        }

        mPager = (ViewPager) view.findViewById(R.id.pager);
        mPager.setAdapter(new SliderAdapter(getActivity(),infoArray));
        CircleIndicator indicator = (CircleIndicator) view.findViewById(R.id.indicator);
        indicator.setViewPager(mPager);

        // Auto start of viewpager
//        final Handler handler = new Handler();
//        final Runnable Update = new Runnable() {
//            public void run() {
//                if (currentPage == info.length) {
//                    currentPage = 0;
//                }
//                mPager.setCurrentItem(currentPage++, true);
//            }
//        };
//        Timer swipeTimer = new Timer();
//        swipeTimer.schedule(new TimerTask() {
//            @Override
//            public void run() {
//                handler.post(Update);
//            }
//        }, 2500, 2500);

        //slide_picture.setAdapter(new SliderAdapter(getActivity(), infoArray));

        return view;
    }
}
