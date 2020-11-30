package com.upeu.app_movilidadoficial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.upeu.app_movilidadoficial.TokenReceive.api.api.WebServiceOauth;
import com.upeu.app_movilidadoficial.TokenReceive.api.api.WebServiceOauthApi;
import com.upeu.app_movilidadoficial.TokenReceive.api.model.Token;
import com.upeu.app_movilidadoficial.TokenReceive.api.share_pref.TokenManager;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    Button btn_login;
    EditText user, pass;
    private TokenManager tokenManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_login = findViewById(R.id.sigin);
        user = findViewById(R.id.userName);
        pass = findViewById(R.id.password);

        setUpView();
    }

    private void setUpView() {
        tokenManager = TokenManager.getInstance(getSharedPreferences(TokenManager.SHARED_PREFERENCES, MODE_PRIVATE));
        btn_login.setOnClickListener((v) -> {
            Toast.makeText(MainActivity.this, "Logeado", Toast.LENGTH_SHORT).show();
            obtenerToken();
        });
    }

    private void obtenerToken() {
        String authHeader = "Basic " + Base64.encodeToString(("alejoelrey:alejoelmejor123456").getBytes(), Base64.NO_WRAP);
        Call<Token> call = WebServiceOauth
                .getInstance()
                .createService(WebServiceOauthApi.class)
                .obtenerToken(
                        authHeader,
                        user.getText().toString(),
                        pass.getText().toString(),
                        "password"
                );

        call.enqueue(new Callback<Token>() {
            Token token = new Token();
            @Override
            public void onResponse(Call<Token> call, Response<Token> response) {
                if(response.code()==200) {
                    Log.d("TAG1", "Access Token: " + response.body().getAccessToken()
                    +" Refresh Token: " + response.body().getRefreshToken());

                    token = response.body();
                    tokenManager.saveToken(token);
                } else {
                    Log.d("TAG1", "Error");
                }
            }

            @Override
            public void onFailure(Call<Token> call, Throwable t) {

            }
        });
    }
}

