package com.zais.alertdantoast.localdb;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.zais.alertdantoast.R;

import java.util.ArrayList;

public class LocaldbActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "MESSAGE";
    private ListView listViewContact;
    DBHelper mydb;
    Button btnContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_localdb);

        btnContact = findViewById(R.id.btn_kontak);
        listViewContact = findViewById(R.id.listView1);

        btnContact.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(),ContactActivity.class);
            Bundle dataBundle = new Bundle();
            dataBundle.putInt("id", 0);
            intent.putExtras(dataBundle);
            startActivity(intent);
        });

        loadData();

    }

    private void loadData(){
        mydb = new DBHelper(this);
        ArrayList array_list = mydb.getAllCotacts();
        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1, array_list);

        listViewContact.setAdapter(arrayAdapter);
        listViewContact.setOnItemClickListener((arg0, arg1, arg2, arg3) -> {
            // TODO Auto-generated method stub
            int id_To_Search = arg2 + 1;

            Bundle dataBundle = new Bundle();
            dataBundle.putInt("id", id_To_Search);

            Intent intent = new Intent(getApplicationContext(),ContactActivity.class);

            intent.putExtras(dataBundle);
            startActivity(intent);
        });
    }


    @Override
    protected void onResume() {
        super.onResume();
        //loadData();
    }

}