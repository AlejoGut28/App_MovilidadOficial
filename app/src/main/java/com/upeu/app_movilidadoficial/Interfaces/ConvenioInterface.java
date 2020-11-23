package com.upeu.app_movilidadoficial.Interfaces;


import com.upeu.app_movilidadoficial.Models.Convenio;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ConvenioInterface {
    @GET("apisis/convenio")
    Call <List<Convenio>> getConvenios();
}
