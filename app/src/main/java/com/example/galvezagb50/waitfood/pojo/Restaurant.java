package com.example.galvezagb50.waitfood.pojo;


/**
 * Created by galvezagb50
 */

public class Restaurant {
    private int _ID;
    private  String name;
    private  String shortname;
    private String location;
    private int imagen;

    public int get_ID() {
        return _ID;
    }

    public void set_ID(int _ID) {
        this._ID = _ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {this.location = location;}

    public int getImagen() {    return imagen;    }

    public void setImagen(int imagen) {this.imagen = imagen;}

    public Restaurant(int _ID, String name, String shortname, String location, int imagen) {
        this._ID = _ID;
        this.name = name;
        this.shortname = shortname;
        this.location = location;
        this.imagen=imagen;
    }
}
