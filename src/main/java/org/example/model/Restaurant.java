package org.example.model;

import org.example.Generate.GeneratorID;

import java.awt.*;
import java.util.List;

public class Restaurant {
    private Long id;
    private String name;
    private String location;
    private String restType;
    private List<MenuItem> menuItems;

    public Restaurant() {
    }

    public Restaurant(Long id, String name, String location, String restType, List<MenuItem> menuItems) {
        this.id = GeneratorID.getRestaurantID();
        this.name = name;
        this.location = location;
        this.restType = restType;
        this.menuItems = menuItems;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRestType() {
        return restType;
    }

    public void setRestType(String restType) {
        this.restType = restType;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", location='" + location + '\'' +
               ", restType='" + restType + '\'' +
               ", menuItems=" + menuItems +
               '}';
    }
}
