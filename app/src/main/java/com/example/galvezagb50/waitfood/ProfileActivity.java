package com.example.galvezagb50.waitfood;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import com.example.galvezagb50.waitfood.adapter.ProfileAdapter;

/**
 * @Aurtor Alejandro Galvez Baena
 * @Version 1.0
 * @Descripcion Muestra las diferentes caracteristicas del usuario
 */

public class ProfileActivity extends AppCompatActivity {

    private ProfileAdapter adapter;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        listView = (ListView)findViewById(R.id.listFeatures);
        adapter = new ProfileAdapter(this);
        listView.setAdapter(adapter);
    }
}
