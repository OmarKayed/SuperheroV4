package com.example.superheroversion4.model;

public class Superhelt {
    // attributes
    private int superheroID;
    private String superheroName;
    private String realName;
    private int creationYear;
    private String cityName;
    private String superpower;
    private boolean isHuman;


    // constructor
    public Superhelt (int superheroID, String superheroName, String realName, int creationYear, String cityName, String superpower, boolean isHuman) {
        this.superheroID = superheroID;
        this.superheroName = superheroName;
        this.realName = realName;
        this.creationYear = creationYear;
        this.cityName = cityName;
        this.superpower = superpower;
        this.isHuman = isHuman;
    }

    public int getSuperheroID() {
        return superheroID;
    }

    public String getSuperheroName() {
        return superheroName;
    }

    public String getRealName() {
        return realName;
    }

    public int getCreationYear() {
        return creationYear;
    }

    public String getSuperpower() {
        return superpower;
    }

    public String getCityName() {
        return cityName;
    }

    public void setSuperheroName(String superheroName) {
        this.superheroName = superheroName;
    }

    public void setSuperheroID(int superheroID) {
        this.superheroID = superheroID;
    }

    public void setCreationYear(int creationYear) {
        this.creationYear = creationYear;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setSuperpower(String superpower) {
        this.superpower = superpower;
    }

    public void setHuman(boolean human) {
        isHuman = human;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }
}

