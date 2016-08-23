package com.sgp.anil.viewpager;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import me.relex.circleindicator.CircleIndicator;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Nature> getData = dataSource();
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        CustomPageAdapter mCustomPagerAdapter = new CustomPageAdapter(MainActivity.this, getData);
        viewPager.setAdapter(mCustomPagerAdapter);
        CircleIndicator indicator = (CircleIndicator) findViewById(R.id.indicator);
        indicator.setViewPager(viewPager);
    }

    private List<Nature> dataSource() {
        List<Nature> data = new ArrayList<Nature>();
        data.add(new Nature(R.drawable.araku));
        data.add(new Nature(R.drawable.ash));
        data.add(new Nature(R.drawable.jas));
        data.add(new Nature(R.drawable.jcm));
        return data;
    }
}
