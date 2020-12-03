package com.upeu.app_movilidadoficial.ui.home;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.upeu.app_movilidadoficial.Det_Vacante;
import com.upeu.app_movilidadoficial.Interfaces.VacantesService;
import com.upeu.app_movilidadoficial.Models.Universidad;
import com.upeu.app_movilidadoficial.Models.Vacantes;
import com.upeu.app_movilidadoficial.R;
import com.upeu.app_movilidadoficial.Requisitos_Convocatorias;
import com.upeu.app_movilidadoficial.TokenReceive.api.api.WebServiceOauth;
import com.upeu.app_movilidadoficial.TokenReceive.api.share_pref.TokenManager;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class HomeFragment extends Fragment {
    private Button req_button ;
    private HomeViewModel homeViewModel;
    private TokenManager tokenManager;


    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        req_button = root.findViewById(R.id.req_button);

        //getVacantes();
        req_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Requisitos_Convocatorias.class);
                startActivity(intent);
            }
        });


        //final TextView textView = root.findViewById(R.id.text_home);
        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {


            @Override
            public void onChanged(@Nullable String s) {
                //textView.setText(s);
            }
        });

        return root;


    }

    public void getVacantes() {
        Call<List<Vacantes>> call = WebServiceOauth
                .getInstance()
                .createService(VacantesService.class)
                .getVacantes("Bearer " + tokenManager.getToken().getAccessToken());

        call.enqueue(new Callback<List<Vacantes>>() {
            @Override
            public void onResponse(Call<List<Vacantes>> call, Response<List<Vacantes>> response) {
                if(response.code()==200){
                    for (int i=0; i<response.body().size(); i++){
                        Log.d("TAG1" , "idvacante: " + response.body().get(i).getIdvacante() +
                                            "uni_anfi: " + response.body().get(i).getUni_anfi() +
                                            "fecha_inicio: " + response.body().get(i).getFecha_inicio() +
                                            "fecha_fin: " + response.body().get(i).getFecha_fin() +
                                            "contacto: " + response.body().get(i).getContacto());
                    }
                } else {
                    Log.d("TAG2: " , "Error");
                }
            }

            @Override
            public void onFailure(Call<List<Vacantes>> call, Throwable t) {

            }
        });
    }


}