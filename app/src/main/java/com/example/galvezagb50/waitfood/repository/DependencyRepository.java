package com.example.galvezagb50.waitfood.repository;

import com.example.galvezagb50.waitfood.pojo.Dependency;
import com.example.galvezagb50.waitfood.pojo.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by galvezagb50
 */

public class DependencyRepository {
    ArrayList<String> dependencies;
    HashMap<String, List<Product>> list_products;
    private static DependencyRepository dependencyRepository;

    static
    {
        dependencyRepository = new DependencyRepository();
    }

    private DependencyRepository() {
        this.dependencies = new ArrayList<>();
        this.list_products=new HashMap<>();
        Initialize();
    }

    public void Initialize() {

        dependencies.add(new Dependency(1, "Bocadillos").getName());
        dependencies.add(new Dependency(2, "Hamburguesas").getName());
        dependencies.add(new Dependency(3, "Pizzas").getName());
        dependencies.add(new Dependency(4, "Bebidas").getName());

        List<Product> bocadillos = new ArrayList<>();
        bocadillos.add(new Product(1, 1, "Musico", "Delicioso"));
        bocadillos.add(new Product(2, 1, "Capricho", "Delicioso"));
        bocadillos.add(new Product(3, 1, "Iberico", "Delicioso"));
        bocadillos.add(new Product(4, 1, "Lomo", "Delicioso"));

        List<Product> hamburguesas = new ArrayList<>();
        hamburguesas.add(new Product(1, 2, "Bruta", "Delicioso"));
        hamburguesas.add(new Product(2, 2, "Vegetal", "Delicioso"));
        hamburguesas.add(new Product(3, 2, "Carnivora", "Delicioso"));
        hamburguesas.add(new Product(4, 2, "Picante", "Delicioso"));

        List<Product> pizzas = new ArrayList<>();
        pizzas.add(new Product(1, 3, "Marinera", "Delicioso"));
        pizzas.add(new Product(2, 3, "Carbonara", "Delicioso"));
        pizzas.add(new Product(3, 3, "Barbacoa", "Delicioso"));
        pizzas.add(new Product(4, 3, "Peperoni", "Delicioso"));

        List<Product> bebidas = new ArrayList<>();
        bebidas.add(new Product(1, 4, "Coca Cola", "Delicioso"));
        bebidas.add(new Product(2, 4, "Fanta Naranja", "Delicioso"));
        bebidas.add(new Product(3, 4, "Nestea", "Delicioso"));
        bebidas.add(new Product(4, 4, "Aquarius", "Delicioso"));


        list_products.put(dependencies.get(0),bocadillos);
        list_products.put(dependencies.get(1),hamburguesas);
        list_products.put(dependencies.get(2),pizzas);
        list_products.put(dependencies.get(3),bebidas);

    }
    public static DependencyRepository getInstance(){
        if (dependencyRepository == null)
            dependencyRepository = new DependencyRepository();
        return dependencyRepository;
    }

    public ArrayList<String> getDependencies() {
        return this.dependencies;
    }

    public HashMap<String, List<Product>> getProducts(){return  this.list_products; }

}
