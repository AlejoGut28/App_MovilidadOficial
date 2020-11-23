package com.upeu.app_movilidadoficial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.Gson;
import com.upeu.app_movilidadoficial.TokenReceive.api.model.Login;
import com.upeu.app_movilidadoficial.TokenReceive.api.model.User;
import com.upeu.app_movilidadoficial.TokenReceive.api.service.UserClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    Retrofit.Builder builder = new Retrofit.Builder()
            .baseUrl("http://35.232.83.197:8888")
            .addConverterFactory(GsonConverterFactory.create());

    Retrofit retrofit  = builder.build();
    UserClient userClient = retrofit.create(UserClient.class);

    Button btn_login;
    EditText user, pass;

    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_login = findViewById(R.id.sigin);
        user = findViewById(R.id.userName);
        pass = findViewById(R.id.password);


        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
                /*Intent intent = new Intent(v.getContext(), Menu_main.class);
                startActivityForResult(intent, 0);*/
            }
        });
    }

    private static String token;
    private void login() {
        Login login = new Login(user.getText().toString(), pass.getText().toString());
        Call<User> call = userClient.login(login);
        //Log.i("Usuario", login);
        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                if (response.isSuccessful()) {
                    Toast.makeText(MainActivity.this, response.body().getToken(), Toast.LENGTH_SHORT).show();
                    token = response.body().getToken();
                } else {
                    Toast.makeText(MainActivity.this, "Credenciales incorrectas", Toast.LENGTH_SHORT).show();
                }
            }
            @Override
            public void onFailure(Call<User> call, Throwable t) {
                Toast.makeText(MainActivity.this, "error !", Toast.LENGTH_SHORT).show();

            }
        });
    }

}