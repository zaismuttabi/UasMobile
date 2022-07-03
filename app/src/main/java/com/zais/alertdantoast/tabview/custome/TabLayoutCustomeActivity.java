package com.zais.alertdantoast.tabview.custome;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.zais.alertdantoast.R;
import com.zais.alertdantoast.tabview.custome.adapter.ViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class TabLayoutCustomeActivity extends AppCompatActivity {

    TabLayout tbCustome;
    ViewPager vpCustome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout_custome);

        tbCustome = findViewById(R.id.tb_layout_custome);
        vpCustome = findViewById(R.id.viewPager);

        tbCustome.addTab(tbCustome.newTab().setText("Satu"));
        tbCustome.addTab(tbCustome.newTab().setText("Dua"));
        tbCustome.addTab(tbCustome.newTab().setText("Tiga"));
        tbCustome.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPagerAdapter adapter = new ViewPagerAdapter(this,getSupportFragmentManager(), tbCustome.getTabCount());
        vpCustome.setAdapter(adapter);

        vpCustome.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tbCustome));

        tbCustome.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                vpCustome.setCurrentItem(tab.getPosition());
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