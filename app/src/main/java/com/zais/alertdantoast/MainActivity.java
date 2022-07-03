package com.zais.alertdantoast;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.zais.alertdantoast.async.AsyncTaskActivity;
import com.zais.alertdantoast.camera.CameraActivity;
import com.zais.alertdantoast.localdb.LocaldbActivity;
import com.zais.alertdantoast.maps.MapActivity;
import com.zais.alertdantoast.network.NetworkActivity;
import com.zais.alertdantoast.sharedpref.SharedPrefActivity;
import com.zais.alertdantoast.sms.SmsActivity;
import com.zais.alertdantoast.tabview.TabViewActivity;
import com.zais.alertdantoast.toast.ToastAlertActivity;

public class MainActivity extends AppCompatActivity {

    Button btnToast, btnAsync, btnCamera, btnLocaldb, btnMaps, btnNetwork, btnSharedPref, btnSms, btnTabView;
    Context context;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;
        btnToast = findViewById(R.id.btn_toast);
        btnAsync = findViewById(R.id.btn_async);
        btnCamera = findViewById(R.id.btn_camera);
        btnLocaldb = findViewById(R.id.btn_localdb);
        btnMaps = findViewById(R.id.btn_maps);
        btnNetwork = findViewById(R.id.btn_network);
        btnSharedPref = findViewById(R.id.btn_sharepref);
        btnSms = findViewById(R.id.btn_sms);
        btnTabView = findViewById(R.id.btn_tabview);
        onClickAction();

    }

    private void onClickAction() {
        btnToast.setOnClickListener(view -> startActivity(new Intent(context, ToastAlertActivity.class)));

        btnAsync.setOnClickListener(view -> startActivity(new Intent(context, AsyncTaskActivity.class)));

        btnCamera.setOnClickListener(view -> startActivity(new Intent(context, CameraActivity.class)));

        btnLocaldb.setOnClickListener(view -> startActivity(new Intent(context, LocaldbActivity.class)));

        btnMaps.setOnClickListener(view -> startActivity(new Intent(context, MapActivity.class)));

        btnNetwork.setOnClickListener(view -> startActivity(new Intent(context, NetworkActivity.class)));

        btnSharedPref.setOnClickListener(view -> startActivity(new Intent(context, SharedPrefActivity.class)));

        btnSms.setOnClickListener(view -> startActivity(new Intent(context, SmsActivity.class)));

        btnTabView.setOnClickListener(view -> startActivity(new Intent(context, TabViewActivity.class)));
    }
}
