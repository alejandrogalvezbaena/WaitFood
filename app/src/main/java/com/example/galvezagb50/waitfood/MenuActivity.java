package com.example.galvezagb50.waitfood;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;

import com.example.galvezagb50.waitfood.pojo.Imagenes;

/**
 * @Aurtor Alejandro Galvez Baena
 * @Version 1.0
 * @Descripcion Se mostrara el icono de cada opcion de la aplicacion
 */

public class MenuActivity extends AppCompatActivity {

    private GridLayout gridMenu;
    private ClickListenerDashBoard listenerMenu;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        gridMenu = ((GridLayout) findViewById(R.id.gridMenu));
        listenerMenu = new ClickListenerDashBoard();

        Imagenes[] imagenes =
                {
                new Imagenes(R.drawable.explorar, 1),
                new Imagenes(R.drawable.anadir, 2),
                new Imagenes(R.drawable.nuevopedido, 3),
                new Imagenes(R.drawable.perfil, 4)};

        int width = (int) getResources().getDimension(R.dimen.imgMenuWidth);
        int height = (int) getResources().getDimension(R.dimen.imgMenuHeight);

        ImageView imageView;
        for (int i = 0; i < imagenes.length; i++) {

            imageView = new ImageView(this);
            imageView.setId(imagenes[i].getId());
            imageView.setImageResource(imagenes[i].getImg());

            GridLayout.LayoutParams params = new GridLayout.LayoutParams();
            params.width = width;
            params.height = height;
            params.rowSpec = GridLayout.spec(GridLayout.UNDEFINED, GridLayout.FILL, 1f);
            params.columnSpec = GridLayout.spec(GridLayout.UNDEFINED, GridLayout.FILL, 1f);

            imageView.setLayoutParams(params);
            imageView.setOnClickListener(listenerMenu);

            gridMenu.addView(imageView);
        }

    }

    class ClickListenerDashBoard implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            Intent intent;
            //la id es el del array de imagenes 0 es la primera imagen del array y asi ...
            switch (view.getId()) {
                case 1:
                    intent = new Intent(MenuActivity.this, ExploreActivity.class);
                    startActivity(intent);
                    break;
                case 2:
                    intent = new Intent(MenuActivity.this, AddProductActivity.class);
                    startActivity(intent);
                    break;
                case 3:
                    intent = new Intent(MenuActivity.this, NewOrder.class);
                    startActivity(intent);
                    break;
                case 4:
                    intent = new Intent(MenuActivity.this, ProfileActivity.class);
                    startActivity(intent);
                    break;
            }

        }
    }
}
