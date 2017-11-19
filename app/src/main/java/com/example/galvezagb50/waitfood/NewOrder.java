package com.example.galvezagb50.waitfood;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import com.example.galvezagb50.waitfood.adapter.DependencyAdapter;

/**
 * @Aurtor Alejandro Galvez Baena
 * @Version 1.0
 * @Descripcion Se mostrara un layout con los distintos productos que hay para elegir
 */

public class NewOrder extends AppCompatActivity {

    private DependencyAdapter adapter;
    private ExpandableListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_order);

        listView = (ExpandableListView)findViewById(R.id.listDependency);
        adapter = new DependencyAdapter(this);
        listView.setAdapter(adapter);

    }
}
