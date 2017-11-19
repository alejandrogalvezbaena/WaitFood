package com.example.galvezagb50.waitfood.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.galvezagb50.waitfood.R;
import com.example.galvezagb50.waitfood.pojo.Restaurant;
import com.example.galvezagb50.waitfood.repository.RestaurantRepository;

/**
 * Created by galvezagb50
 */


public class RestaurantAdapter extends ArrayAdapter<Restaurant> {

    public RestaurantAdapter(@NonNull Context context) {
        super(context, R.layout.item_restaurant, RestaurantRepository.getInstance().getRestaurants());

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        RestaurantHolder restaurantHolder;
        View view = convertView;

        if (view == null){

            LayoutInflater inflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view= inflater.inflate(R.layout.item_restaurant,null);
            restaurantHolder = new RestaurantHolder();
            restaurantHolder.icon = (ImageView) view.findViewById(R.id.icon);
            restaurantHolder.txv_Name = (TextView)view.findViewById(R.id.txv_name);
            restaurantHolder.txv_SortName = (TextView)view.findViewById(R.id.txv_SortName);
            view.setTag(restaurantHolder);
        }else {
            restaurantHolder = (RestaurantHolder) view.getTag();
        }

        restaurantHolder.icon.setImageResource(getItem(position).getImagen());
        restaurantHolder.txv_Name.setText(getItem(position).getName());
        restaurantHolder.txv_SortName.setText(getItem(position).getShortname());


        return view;
    }

    class RestaurantHolder {
        ImageView icon;
        TextView txv_Name;
        TextView txv_SortName;

    }



}
