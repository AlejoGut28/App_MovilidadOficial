package com.upeu.app_movilidadoficial.Interfaces;


import com.upeu.app_movilidadoficial.Models.Convocatoria;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ConvocatoriaInterface {
    @GET("apisis/convocatoria")
    Call<List<Convocatoria>> getConvocatoria();
}
