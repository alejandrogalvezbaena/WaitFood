package com.example.galvezagb50.waitfood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * @Aurtor Alejandro Galvez Baena
 * @Version 1.0
 * @Descripcion Registro/Inicio Sesion del Usuario
 */

public class LoginActivity extends AppCompatActivity {

    private Button btnLogIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogIn=(Button)findViewById(R.id.btnLogIn);

        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent LogIn = new Intent(LoginActivity.this, MenuActivity.class);
                startActivity(LogIn);
            }
        });
    }




}
