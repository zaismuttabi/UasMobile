package com.zais.alertdantoast.tabview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.zais.alertdantoast.R;
import com.zais.alertdantoast.tabview.basic.TabLayoutBasicActivity;
import com.zais.alertdantoast.tabview.custome.TabLayoutCustomeActivity;

public class TabViewActivity extends AppCompatActivity {
    Context mContext;
    Button btnBasic, btnCustome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_view);

        mContext = this;
        btnBasic = findViewById(R.id.btn_basic_tab_view);
        btnCustome = findViewById(R.id.btn_custome_tab_view);

        btnBasic.setOnClickListener(view -> {
            Intent intent = new Intent(mContext, TabLayoutBasicActivity.class);
            startActivity(intent);
        });

        btnCustome.setOnClickListener(view -> {
            Intent intent = new Intent(mContext, TabLayoutCustomeActivity.class);
            startActivity(intent);
        });

    }
}