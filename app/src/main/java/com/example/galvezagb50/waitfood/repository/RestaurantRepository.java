package com.example.galvezagb50.waitfood.repository;

import com.example.galvezagb50.waitfood.R;
import com.example.galvezagb50.waitfood.pojo.Restaurant;
import java.util.ArrayList;


/**
 * Created by galvezagb50
 */

public class RestaurantRepository {
    ArrayList<Restaurant> restaurants;
    private static RestaurantRepository restaurantRepository;
    private static final String unaEstrella="★☆☆☆☆";
    private static final String dosEstrella="★★☆☆☆";
    private static final String tresEstrella="★★★☆☆";
    private static final String cuatroEstrella="★★★★☆";
    private static final String cincoEstrella="★★★★★";

    static {
        restaurantRepository = new RestaurantRepository();
    }

    private RestaurantRepository() {
        this.restaurants = new ArrayList<>();
        Initialize();
    }

    public void Initialize() {
        addRestaurant(new Restaurant(1, "Restaurante Casa Pedro", unaEstrella, "Puente Genil", R.drawable.casapedro));
        addRestaurant(new Restaurant(2, "Cafeteria Cristina", dosEstrella, "Puente Genil", R.drawable.cafeteriacristina));
        addRestaurant(new Restaurant(3, "Fiftin", cincoEstrella, "Puente Genil", R.drawable.fiftin));
        addRestaurant(new Restaurant(4, "Casa Ricardo", unaEstrella, "Puente Genil", R.drawable.casaricardo));
        addRestaurant(new Restaurant(5, "Restaurante La Rueda", cuatroEstrella, "Puente Genil", R.drawable.restaurantelarueda));
        addRestaurant(new Restaurant(6, "Bar Maruja Limon", cuatroEstrella, "Puente Genil", R.drawable.barmarujalimon));
        addRestaurant(new Restaurant(7, "La Viña de Bruno", tresEstrella, "Puente Genil", R.drawable.lavinadebruno));
        addRestaurant(new Restaurant(8, "Bar El Camborio", tresEstrella, "Puente Genil", R.drawable.barelcamborio));
        addRestaurant(new Restaurant(9, "Hops", cincoEstrella, "Puente Genil", R.drawable.hops));
        addRestaurant(new Restaurant(10, "Hidalgo`s Restaurant", dosEstrella, "Puente Genil", R.drawable.hidalgorestaurant));
        addRestaurant(new Restaurant(11, "Restaurante VOGUEE", dosEstrella, "Puente Genil", R.drawable.restaurantevoguee));


    }
    public static RestaurantRepository getInstance(){
        if (restaurantRepository == null)
            restaurantRepository = new RestaurantRepository();
        return restaurantRepository;
    }

    public void addRestaurant(Restaurant restaurant) {
        this.restaurants.add(restaurant);
    }

    public ArrayList<Restaurant> getRestaurants() {
        return this.restaurants;
    }
}
