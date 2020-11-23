package com.upeu.app_movilidadoficial.TokenReceive.api.service;

import com.upeu.app_movilidadoficial.TokenReceive.api.model.Login;
import com.upeu.app_movilidadoficial.TokenReceive.api.model.User;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface UserClient {

    @POST("/auth/login")
    Call<User> login(@Body Login login);

}
