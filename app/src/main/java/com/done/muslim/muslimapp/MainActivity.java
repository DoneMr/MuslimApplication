package com.done.muslim.muslimapp;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;

import com.done.muslim.muslimapp.adapter.MyFragmentPageAdapter;
import com.done.muslim.muslimapp.common.BaseActivity;

public class MainActivity extends BaseActivity {

    private static final String TAG = "MainActivity";

    private static final String[] mainTitles = new String[]{"Home", "User"};

    private TabLayout tabLayout;

    private ViewPager vpMain;

    @Override
    protected int setLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void bindView() {
        tabLayout = findViewById(R.id.tb_main);
        tabLayout.addTab(tabLayout.newTab().setText(mainTitles[0]));
        tabLayout.addTab(tabLayout.newTab().setText(mainTitles[1]));
        vpMain = findViewById(R.id.vp_main);
//        MyFragmentPageAdapter fragmentPageAdapter = new MyFragmentPageAdapter(getSupportFragmentManager());
//        vpMain.setAdapter(fragmentPageAdapter);
//        tabLayout.setupWithViewPager(vpMain);
    }

    @Override
    protected void bindData() {
    }

}
