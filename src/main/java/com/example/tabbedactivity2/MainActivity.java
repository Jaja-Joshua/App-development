package com.example.tabbedactivity2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TabLayout tabLayout = findViewById(R.id.tabBar);
        TabItem tabAbout_user = findViewById(R.id.tabAbout_user);
        TabItem tabAbout_app = findViewById(R.id.tabAbout_app);
        TabItem tabData_visualization = findViewById(R.id.tabData_visualization);
        ViewPager viewPager = findViewById(R.id.viewpager);

        PagerAdapter pagerAdapter;
        pagerAdapter = new
                PagerAdapter(getSupportFragmentManager(),
                    tabLayout.getTabCount());

        viewPager.setAdapter(pagerAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });



    }
}