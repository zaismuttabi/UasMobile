package com.zais.alertdantoast.sharedpref;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.zais.alertdantoast.R;

public class SharedPrefActivity extends AppCompatActivity {
    EditText etInputWord;
    Button btnSave, btnNonSave;

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor sharedEditor;

    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_pref);

        mContext = this;

        btnNonSave = findViewById(R.id.btn_pindah_aja);
        btnSave = findViewById(R.id.btn_pindah_save);

        etInputWord = findViewById(R.id.et_input_kata);

        sharedPreferences = getSharedPreferences("data_shared_preff_kita", MODE_PRIVATE);
        sharedEditor = sharedPreferences.edit();


        btnSave.setOnClickListener(view -> {
            String inputText = etInputWord.getText().toString();

            if (!inputText.equals("")) {
                sharedEditor.putString("NAMA", inputText);
                sharedEditor.commit();

                Intent intent = new Intent(mContext, UserActivity.class);
                startActivity(intent);
            } else {
                Toast.makeText(mContext, "Silahkan Isi dulu", Toast.LENGTH_LONG).show();
            }
        });

        btnNonSave.setOnClickListener(view -> {
            sharedEditor.remove("NAMA");
            sharedEditor.commit();

            Intent intent = new Intent(mContext, UserActivity.class);
            startActivity(intent);
        });

    }

}