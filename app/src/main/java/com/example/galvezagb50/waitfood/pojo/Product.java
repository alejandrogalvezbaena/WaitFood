package com.example.galvezagb50.waitfood.pojo;

/**
 * Created by galvezagb50
 */

public class Product {
    private int _ID;
    private int _ID_dependency;
    private  String name;
    private String description;

    public int get_ID() {
        return _ID;
    }

    public void set_ID(int _ID) {
        this._ID = _ID;
    }

    public int get_ID_dependency() {
        return _ID_dependency;
    }

    public void set_ID_dependency(int _ID_dependency) {this._ID_dependency = _ID_dependency; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Product(int _ID, int _ID_dependency, String name, String description) {
        this._ID = _ID;
        this._ID_dependency=_ID_dependency;
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return getName();
    }

}
