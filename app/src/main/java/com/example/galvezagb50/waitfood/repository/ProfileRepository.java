package com.example.galvezagb50.waitfood.repository;

import com.example.galvezagb50.waitfood.pojo.Feature;


import java.util.ArrayList;

/**
 * Created by galvezagb50
 */

public class ProfileRepository {
    ArrayList<Feature> features;
    private static ProfileRepository profileRepository;

    static {
        profileRepository = new ProfileRepository();
    }

    private ProfileRepository() {
        this.features = new ArrayList<>();
        Initialize();
    }

    public void Initialize() {
        addFeature(new Feature("Email", "galvez50galvez97@gmail.com"));
        addFeature(new Feature("Localidad", "Puente Genil"));
        addFeature(new Feature("Edad", "20"));
        addFeature(new Feature("Telefono", "682441992"));
        addFeature(new Feature("Direccion", "Calle Clavel, 11"));
        addFeature(new Feature("Establecimiento Favorito", "Cafeteria Cristina"));
        addFeature(new Feature("Sobre mi", "bla bla bla bla bla bla"));
    }

    public static ProfileRepository getInstance(){
        if (profileRepository == null)
            profileRepository = new ProfileRepository();
        return profileRepository;
    }

    public void addFeature(Feature feature) {
        this.features.add(feature);
    }

    public ArrayList<Feature> getFeatures() {
        return this.features;
    }
}
