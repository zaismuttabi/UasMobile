package com.zais.alertdantoast.tabview.basic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.zais.alertdantoast.R;
import com.google.android.material.tabs.TabLayout;

public class TabLayoutBasicActivity extends AppCompatActivity {

    TabLayout tbLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout_basic);

        tbLayout = findViewById(R.id.tb_layout);

        tbLayout.addTab(tbLayout.newTab().setText("Satu"));
        tbLayout.addTab(tbLayout.newTab().setText("Dua"));
        tbLayout.addTab(tbLayout.newTab().setText("Tiga"));
        tbLayout.setTabGravity(TabLayout.GRAVITY_FILL);

    }
}