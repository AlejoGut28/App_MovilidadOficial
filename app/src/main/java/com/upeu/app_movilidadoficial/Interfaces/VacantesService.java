package com.upeu.app_movilidadoficial.Interfaces;

import com.upeu.app_movilidadoficial.Models.Vacantes;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface VacantesService {

    @GET("/apisis/vacante")
    Call<List<Vacantes>> getVacantes(@Header("Authorization") String authToken);
}
