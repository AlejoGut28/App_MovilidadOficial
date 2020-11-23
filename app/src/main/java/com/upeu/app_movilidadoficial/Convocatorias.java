package com.upeu.app_movilidadoficial;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.upeu.app_movilidadoficial.Interfaces.ConvenioInterface;
import com.upeu.app_movilidadoficial.Interfaces.ConvocatoriaInterface;
import com.upeu.app_movilidadoficial.Models.Convenio;
import com.upeu.app_movilidadoficial.Models.Convocatoria;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Convocatorias#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Convocatorias extends Fragment {
    private final String baseUrl = "http://35.232.83.197:8888/";


    List<Convocatoria> listaConvocatorias = new ArrayList<>();

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Convocatorias() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Convocatorias.
     */
    // TODO: Rename and change types and number of parameters
    public static Convocatorias newInstance(String param1, String param2) {
        Convocatorias fragment = new Convocatorias();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Retrofit retrofit = new Retrofit.Builder().baseUrl(baseUrl).
                addConverterFactory(GsonConverterFactory.create())
                .build();
        ConvocatoriaInterface convocatoriaInterface = retrofit.create(ConvocatoriaInterface.class);
        Call<List<Convocatoria>> lista = convocatoriaInterface.getConvocatoria();


        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_convocatorias, container, false);
    }
}