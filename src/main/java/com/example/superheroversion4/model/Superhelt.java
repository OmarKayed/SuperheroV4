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

    public Superhelt(String superheroname, String realName, int creationYear) {
        this.superheroName = superheroname;
        this.realName = realName;
        this.creationYear = creationYear;

    }

    public Superhelt () {

    }

    public String getHeroName() {
        if (superheroName.isEmpty()) {
            return "Intet superhelte navn";
        } else {
            return superheroName;
        }
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
}

