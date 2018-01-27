package com.victor.cotacaomoeda;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.victor.cotacaomoeda.models.ArrayAdapterMoeda;
import com.victor.cotacaomoeda.models.CotacaoResponse;
import com.victor.cotacaomoeda.models.Moeda;
import com.victor.cotacaomoeda.models.Valores;
import com.victor.cotacaomoeda.service.CotacaoService;
import com.victor.cotacaomoeda.service.DetalheMoedaService;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by victor on 26/01/18.
 */

public class IndexCotacaoActivity extends AppCompatActivity {

    private static final String TAG = "suemar";

    private Context mContext;
    ArrayAdapterMoeda arrayAdapterMoeda;
    Context ctx;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index_cotacao);

        ctx = this;

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(CotacaoService.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        CotacaoService service = retrofit.create(CotacaoService.class);
        Call<CotacaoResponse> requestMoeda = service.buscaMoeda();

        final DetalheMoedaService detalheMoedaService = new DetalheMoedaService();

        requestMoeda.enqueue(new Callback<CotacaoResponse>() {
            @Override
            public void onResponse(Call<CotacaoResponse> call, Response<CotacaoResponse> response) {
             if (!response.isSuccessful()){

                 Log.i("TAG", "Erro: " + response.code());

             } else {

                 final CotacaoResponse cotacaoResponse = response.body();

                 //chama Metodo que configura onclick dos textos
                 configurarTextos(cotacaoResponse);

                 configurarImagens(cotacaoResponse);

             }

            }

            @Override
            public void onFailure(Call<CotacaoResponse> call, Throwable t) {
                Log.e(TAG,"Erro " + t.getMessage());
            }
        });

    }




    private void configurarImagens(final CotacaoResponse cotacaoResponse) {

        final DetalheMoedaService detalheMoedaService = new DetalheMoedaService();

        ImageView imgDolar = (ImageView) findViewById(R.id.imgDolar);
        imgDolar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.activity_descricao_moeda);

                //DETALHE
                TextView textDetalheMoeda = (TextView) findViewById(R.id.textDetalheMoeda);
                textDetalheMoeda.setText(cotacaoResponse.getValores().getUSD().toString());

                //HISTORIA
                TextView textMoeda = (TextView) findViewById(R.id.textHistoriaMoeda);
                String descricao = detalheMoedaService.getDescricaoMoeda("Dolar");
                textMoeda.setText(descricao);
            }
        });

        ImageView imgEuro = (ImageView) findViewById(R.id.imgEuro);
        imgEuro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.activity_descricao_moeda);

                //DETALHE
                TextView textDetalheMoeda = (TextView) findViewById(R.id.textDetalheMoeda);
                textDetalheMoeda.setText(cotacaoResponse.getValores().getEUR().toString());


                //HISTORIA
                TextView textMoeda = (TextView) findViewById(R.id.textHistoriaMoeda);
                String descricao = detalheMoedaService.getDescricaoMoeda("Euro");
                textMoeda.setText(descricao);
            }
        });


        ImageView imgPeso = (ImageView) findViewById(R.id.imgPeso);
        imgPeso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.activity_descricao_moeda);

                //DETALHE
                TextView textDetalheMoeda = (TextView) findViewById(R.id.textDetalheMoeda);
                textDetalheMoeda.setText(cotacaoResponse.getValores().getARS().toString());

                //HISTORIA
                TextView textMoeda = (TextView) findViewById(R.id.textHistoriaMoeda);
                String descricao = detalheMoedaService.getDescricaoMoeda("Peso");
                textMoeda.setText(descricao);
            }
        });

        ImageView imgBitcoin = (ImageView) findViewById(R.id.imgBitcoin);
        imgBitcoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.activity_descricao_moeda);

                //DETALHE
                TextView textDetalheMoeda = (TextView) findViewById(R.id.textDetalheMoeda);
                textDetalheMoeda.setText(cotacaoResponse.getValores().getBTC().toString());

                //HISTORIA
                TextView textMoeda = (TextView) findViewById(R.id.textHistoriaMoeda);
                String descricao = detalheMoedaService.getDescricaoMoeda("Bitcoin");
                textMoeda.setText(descricao);
            }
        });



        ImageView imgLibra = (ImageView) findViewById(R.id.imgLibra);
        imgLibra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.activity_descricao_moeda);

                //DETALHE
                TextView textDetalheMoeda = (TextView) findViewById(R.id.textDetalheMoeda);
                textDetalheMoeda.setText(cotacaoResponse.getValores().getGBP().toString());

                TextView textMoeda = (TextView) findViewById(R.id.textHistoriaMoeda);
                String descricao = detalheMoedaService.getDescricaoMoeda("Libra");
                textMoeda.setText(descricao);
            }
        });

    }


    private void configurarTextos(final CotacaoResponse cotacaoResponse) {

        final DetalheMoedaService detalheMoedaService = new DetalheMoedaService();

        TextView textDolar = (TextView) findViewById(R.id.textDolar);
        textDolar.setText(cotacaoResponse.getValores().getUSD().toString());
        textDolar.setOnClickListener(new View.OnClickListener() {

            // Evendo de click da moeda  Dollar
            @Override
            public void onClick(View view) {
                setContentView(R.layout.activity_descricao_moeda);

                TextView textDetalheMoeda = (TextView) findViewById(R.id.textDetalheMoeda);
                TextView textHistoriaMoeda = (TextView) findViewById(R.id.textHistoriaMoeda);

                textDetalheMoeda.setText(cotacaoResponse.getValores().getUSD().toString());
                String descricao = detalheMoedaService.getDescricaoMoeda("Dolar");
                textHistoriaMoeda.setText(descricao);


            }
        });

        // Evendo de click da moeda Euro
        TextView textEuro = (TextView) findViewById(R.id.textEuro);
        textEuro.setText(cotacaoResponse.getValores().getEUR().toString());

        textEuro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.activity_descricao_moeda);
                TextView textDetalheMoeda = (TextView) findViewById(R.id.textDetalheMoeda);
                textDetalheMoeda.setText(cotacaoResponse.getValores().getEUR().toString());

                TextView textDolar = (TextView) findViewById(R.id.textHistoriaMoeda);
                String descricao = detalheMoedaService.getDescricaoMoeda("Euro");
                textDolar.setText(descricao);
            }
        });

        // Evendo de click da moeda Bitcoin
        TextView textBitcoin = (TextView) findViewById(R.id.textBitcoin);
        textBitcoin.setText(cotacaoResponse.getValores().getBTC().toString());
        textBitcoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.activity_descricao_moeda);
                TextView textDetalheMoeda = (TextView) findViewById(R.id.textDetalheMoeda);
                textDetalheMoeda.setText(cotacaoResponse.getValores().getBTC().toString());

                TextView textDolar = (TextView) findViewById(R.id.textHistoriaMoeda);
                String descricao = detalheMoedaService.getDescricaoMoeda("Bitcoin");
                textDolar.setText(descricao);
            }
        });

        // Evendo de click da moeda Peso
        TextView textPeso = (TextView) findViewById(R.id.textPeso);
        textPeso.setText(cotacaoResponse.getValores().getARS().toString());

        textPeso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.activity_descricao_moeda);
                TextView textDetalheMoeda = (TextView) findViewById(R.id.textDetalheMoeda);
                textDetalheMoeda.setText(cotacaoResponse.getValores().getARS().toString());
                TextView textDolar = (TextView) findViewById(R.id.textHistoriaMoeda);
                String descricao = detalheMoedaService.getDescricaoMoeda("Peso");
                textDolar.setText(descricao);
            }
        });

        // Evendo de click da moeda Libra
        TextView textLibra = (TextView) findViewById(R.id.textLibra);
        textLibra.setText(cotacaoResponse.getValores().getGBP().toString());
        textLibra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.activity_descricao_moeda);
                TextView textDetalheMoeda = (TextView) findViewById(R.id.textDetalheMoeda);
                textDetalheMoeda.setText(cotacaoResponse.getValores().getGBP().toString());
                TextView textDolar = (TextView) findViewById(R.id.textHistoriaMoeda);
                String descricao = detalheMoedaService.getDescricaoMoeda("Libra");
                textDolar.setText(descricao);
            }
        });
    }

}


