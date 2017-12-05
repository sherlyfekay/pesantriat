package com.example.sherly.pesantriat.activity;

import android.os.Build;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;

import com.example.sherly.pesantriat.R;
import com.example.sherly.pesantriat.fragment.AntrianFragment;
import com.example.sherly.pesantriat.fragment.CariFragment;
import com.example.sherly.pesantriat.fragment.HomeFragment;
import com.example.sherly.pesantriat.fragment.ProfilFragment;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//            Window w = getWindow();
//            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
//        }

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out)
                    .replace(R.id.tabContent, new HomeFragment())
                    .commit();
        }

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.tabLayout);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;

                switch (item.getItemId()) {
                    case R.id.nav_home:
                        fragment = new HomeFragment();
                        break;
                    case R.id.nav_antrian:
                        fragment = new AntrianFragment();
                        break;
                    case R.id.nav_cari:
                        fragment = new CariFragment();
                        break;
                    case R.id.nav_profil:
                        fragment = new ProfilFragment();
                        break;
                    default:
                        fragment = new HomeFragment();
                        break;
                }

                getSupportFragmentManager().beginTransaction()
                        .setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out)
                        .replace(R.id.tabContent, fragment)
                        .commit();

                return true;
            }
        });
    }
}
