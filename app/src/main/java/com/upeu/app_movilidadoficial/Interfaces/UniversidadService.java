package com.upeu.app_movilidadoficial.Interfaces;

import com.upeu.app_movilidadoficial.Models.Universidad;
import com.upeu.app_movilidadoficial.TokenReceive.api.model.Token;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface UniversidadService {
    
    @GET("/apisis/universidad")
    Call<List<Universidad>> getUniversidad(@Header("Authorization") String authToken);
}
