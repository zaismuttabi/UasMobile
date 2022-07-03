package com.zais.alertdantoast.toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.zais.alertdantoast.R;

public class ToastAlertActivity extends AppCompatActivity {
    Button btnShowAlert, btnShowToast;
    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast_alert);

        mContext = this;

        btnShowAlert = findViewById(R.id.btn_show_alert);
        btnShowToast = findViewById(R.id.btn_show_toast);

        btnShowToast.setOnClickListener(view -> Toast.makeText(mContext, "Tampil Toast Message", Toast.LENGTH_LONG).show());

        btnShowAlert.setOnClickListener(view -> showAlert());

    }

    private void showAlert(){
        AlertDialog.Builder dialog=new AlertDialog.Builder(this);
        dialog.setMessage("Silahkan Pilih yes atau no");
        dialog.setTitle("Tampil Dialog Alert");
        dialog.setPositiveButton("YES", (dialog1, which) ->
                Toast.makeText(getApplicationContext(),"Yes yang di klik",Toast.LENGTH_LONG).show());
        dialog.setNegativeButton("cancel", (dialog12, which) ->
                Toast.makeText(getApplicationContext(),"cancel yang di klik",Toast.LENGTH_LONG).show());
        AlertDialog alertDialog=dialog.create();
        alertDialog.show();

    }
}