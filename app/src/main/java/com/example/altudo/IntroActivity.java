package com.example.altudo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class IntroActivity extends AppCompatActivity {

    private ViewPager screenPager;
    IntroViewPagerAdaopter introViewPagerAdaopter;
    private Object IntroViewPagerAdaopter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        List<ScreenItem> mList = new ArrayList<>();
        mList.add(new ScreenItem("Fresh Food", "", R.drawable.img1));
        mList.add(new ScreenItem("Fast Delivery", "", R.drawable.img2));
        mList.add(new ScreenItem("Easy Pay","", R.drawable.img3));


        screenPager = findViewById(R.id.screen_viewpager);
        IntroViewPagerAdaopter = new IntroViewPagerAdaopter(this, mList);
        screenPager.setAdapter(introViewPagerAdaopter);

    }
}
