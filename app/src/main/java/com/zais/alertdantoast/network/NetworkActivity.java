package com.zais.alertdantoast.network;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.zais.alertdantoast.R;
import com.zais.alertdantoast.network.model.UserResponseItem;
import com.zais.alertdantoast.network.service.Service;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkActivity extends AppCompatActivity {
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_network);

        mContext = this;


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Service service = retrofit.create(Service.class);


        service.getDataUser().enqueue(new Callback<List<UserResponseItem>>() {
            @Override
            public void onResponse(Call<List<UserResponseItem>> call, Response<List<UserResponseItem>> response) {
                if (response.isSuccessful()){
//                    Log.d("Cetak Response : ", "onResponse: "+response.body());

                    for (UserResponseItem user : response.body()){
                        Log.d("Hasil ", "onResponse: "+user.getAddress().getCity().toString());
                    }

                } else if (response.code() == 400){

                } else if (response.code() == 500){
                    Toast.makeText(mContext, "Internal server Error", Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<List<UserResponseItem>> call, Throwable t) {
                Log.i("Gagal", t.toString());
            }
        });
    }

}