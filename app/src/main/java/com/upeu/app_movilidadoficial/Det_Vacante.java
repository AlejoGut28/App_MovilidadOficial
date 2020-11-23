package com.upeu.app_movilidadoficial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Det_Vacante extends AppCompatActivity {
private Button btn_soli, btn_carta;

private  String url1,url2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_det_vacante);
        btn_soli = findViewById(R.id.btn_soli);
        btn_carta = findViewById(R.id.btn_carta);
        url2="https://drive.google.com/file/d/1oRr6qWv4tmqWk_SNrlQKj0poMg_lnMNU/view";
        url1="https://drive.google.com/file/d/1pS_uCPr62s10OAHV-OCQADM_PwjQAUgQ/view";
        btn_soli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse(url1);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });


    }
}