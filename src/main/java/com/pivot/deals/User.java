package com.pivot.deals;

import java.util.ArrayList;

public class User {
    public int id;
    public String username;
    private String password;
    public Location location;
    public int age;
    public ArrayList<Restaurant> favorites;

    // Setters
    public User() {

    }

    public User(int id, String username) {
        this.id = id;
        this.username = username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Getters
    public String getUsername() {
        return username;
    }

    public Location getLocation() {
        return location;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<Restaurant> getFavorites() {
        return favorites;
    }
}
