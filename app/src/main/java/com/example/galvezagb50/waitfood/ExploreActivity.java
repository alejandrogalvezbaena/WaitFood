package com.example.galvezagb50.waitfood;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.galvezagb50.waitfood.adapter.RestaurantAdapter;

/**
 * @Aurtor Alejandro Galvez Baena
 * @Version 1.0
 * @Descripcion Restaurantes cerca de tu zona
 */

public class ExploreActivity extends AppCompatActivity {

    private RestaurantAdapter adapter;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);

        listView = (ListView)findViewById(R.id.listRestaurant);
        adapter = new RestaurantAdapter(this);
        listView.setAdapter(adapter);


    }
}
