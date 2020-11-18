package com.upeu.app_movilidadoficial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Menu_main extends AppCompatActivity {
    ImageButton imageButtonConve;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_main);
        imageButtonConve = (ImageButton) findViewById(R.id.convenios );
        imageButtonConve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent   imageButtonConve = new Intent(Menu_main.this, Convenios.class);
            }
        });
    }

}