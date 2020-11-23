package com.upeu.app_movilidadoficial;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.upeu.app_movilidadoficial.Interfaces.ConvenioInterface;
import com.upeu.app_movilidadoficial.Models.Convenio;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Convenios#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Convenios extends Fragment {


    private final String baseUrl = "http://35.232.83.197:8888/";
    private Button v_detalleconv_1;
    private Button v_detalleconv_2;
    private Button v_detalleconv_3;

    private TextView textView9;
    private TextView textView10;
    private TextView textView12;
    List<Convenio> listaConvenios = new ArrayList<>();
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Convenios() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Convenios.
     */
    // TODO: Rename and change types and number of parameters
    public static Convenios newInstance(String param1, String param2) {
        Convenios fragment = new Convenios();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
        Retrofit retrofit = new Retrofit.Builder().baseUrl(baseUrl).
                addConverterFactory(GsonConverterFactory.create())
                .build();

        ConvenioInterface convenioInterface = retrofit.create(ConvenioInterface.class);
        Call<List<Convenio>> lista = convenioInterface.getConvenios();
        lista.enqueue(new Callback<List<Convenio>>() {
            @Override
            public void onResponse(Call<List<Convenio>> call, Response<List<Convenio>> response) {
                if(response.isSuccessful())
                listaConvenios = response.body();

            }

            @Override
            public void onFailure(Call<List<Convenio>> call, Throwable t) {

            }
        });

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_convenios, container, false);
        v_detalleconv_1 = v.findViewById(R.id.v_detalleconv_1);
        v_detalleconv_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Docs_adjuntados.class));

            }
        });
        v_detalleconv_2 = v.findViewById(R.id.v_detalleconv_2);
        v_detalleconv_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Docs_adjuntados.class));
            }
        });
        v_detalleconv_3 = v.findViewById(R.id.b_vacantes_deta4);
        v_detalleconv_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Docs_adjuntados.class));
            }
        });
        return v;
    }
}