package com.zais.alertdantoast.network.service;

import com.zais.alertdantoast.network.model.UserResponseItem;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Service {

    @GET("/users")
    Call<List<UserResponseItem>> getDataUser();

}
