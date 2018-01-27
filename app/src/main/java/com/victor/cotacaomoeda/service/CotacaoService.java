package com.victor.cotacaomoeda.service;

import com.victor.cotacaomoeda.models.CotacaoResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by victor on 27/01/18.
 */

public interface CotacaoService {

    public static final String BASE_URL = "http://api.promasters.net.br/cotacao/v1/";

    @GET("valores")
    Call<CotacaoResponse> buscaMoeda();

}
